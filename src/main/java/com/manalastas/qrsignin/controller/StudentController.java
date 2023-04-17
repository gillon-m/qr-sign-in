package com.manalastas.qrsignin.controller;

import com.manalastas.qrsignin.dto.StudentDto;
import com.manalastas.qrsignin.service.StudentService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private ModelMapper modelMapper;

    @GetMapping("/{id}")
    public StudentDto getStudentById(@PathVariable Long id){
        StudentDto studentDto = modelMapper.map(studentService.getStudent(id), StudentDto.class);
        return studentDto;
    }
}