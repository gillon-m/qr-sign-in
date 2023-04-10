package com.manalastas.qrsignin.controller;

import com.manalastas.qrsignin.model.classroom.Classroom;
import com.manalastas.qrsignin.service.ClassroomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/classroom")
public class ClassroomController {

    @Autowired
    private ClassroomService classroomService;

    @GetMapping("/{id}")
    public Classroom getClassroomById(@PathVariable("id") long id){
        return classroomService.getClassroom(id);
    }
}