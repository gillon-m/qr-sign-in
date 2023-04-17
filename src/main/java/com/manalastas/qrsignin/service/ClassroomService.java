package com.manalastas.qrsignin.service;

import com.manalastas.qrsignin.model.classroom.Classroom;
import com.manalastas.qrsignin.model.classroom.Student;
import com.manalastas.qrsignin.repository.ClassroomRepository;
import com.manalastas.qrsignin.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassroomService {
    @Autowired
    private ClassroomRepository classroomRepository;
    @Autowired
    private StudentRepository studentRepository;

    public Classroom getClassroom(Long id){
        return classroomRepository.findById(id).orElseThrow();
    }

    public List<Student> addStudents(Classroom classroom, List<Student> students){
        classroom.addStudents(students);
        studentRepository.saveAll(students)
        return classroomRepository.save(classroom);
    }

    public List<Student> addStudents(Long classroomId, List<Student> students){
        Classroom classroom = classroomRepository.findById(classroomId).orElseThrow();
        return addStudents(classroom, students);
    }
}
