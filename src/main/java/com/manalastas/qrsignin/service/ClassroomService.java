package com.manalastas.qrsignin.service;

import com.manalastas.qrsignin.model.classroom.Classroom;
import com.manalastas.qrsignin.repository.ClassroomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClassroomService {
    @Autowired
    private ClassroomRepository classroomRepository;

    public Classroom getClassroom(Long id){
        return classroomRepository.findById(id).orElse(null);
    }
}
