package com.manalastas.qrsignin.controller;

import com.manalastas.qrsignin.dto.ClassroomDto;
import com.manalastas.qrsignin.dto.StudentDto;
import com.manalastas.qrsignin.model.classroom.Classroom;
import com.manalastas.qrsignin.model.classroom.Student;
import com.manalastas.qrsignin.service.ClassroomService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/classrooms")
public class ClassroomController {

    @Autowired
    private ClassroomService classroomService;

    @Autowired
    private ModelMapper modelMapper;

    @GetMapping("/{id}")
    public ClassroomDto getClassroomById(@PathVariable Long id){
        ClassroomDto classroomDto = modelMapper.map(classroomService.getClassroom(id), ClassroomDto.class);
        return classroomDto;
    }

    @PostMapping("/{id}/students")
    public List<StudentDto> addClassrooms(@PathVariable Long id, @RequestBody List<StudentDto> studentDtos){
        List<Student> students = studentDtos
                .stream()
                .map(dto -> modelMapper.map(dto, Student.class))
                .collect(Collectors.toList());
        ClassroomDto classroomDto = classroomService.(id, classrooms)
                .stream()
                .map(dto -> modelMapper.map(dto, ClassroomDto.class))
                .collect(Collectors.toList());
        return classroomDto;
    }
}