package com.manalastas.qrsignin.service;

import com.manalastas.qrsignin.model.classroom.Classroom;
import com.manalastas.qrsignin.model.classroom.Student;
import com.manalastas.qrsignin.repository.ClassroomRepository;
import com.manalastas.qrsignin.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private ClassroomRepository classroomRepository;

    public Student getStudent(Long id){
        return studentRepository.findById(id).orElseThrow();
    }

}
