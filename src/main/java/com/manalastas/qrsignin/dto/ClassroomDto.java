package com.manalastas.qrsignin.dto;

import lombok.Data;

import java.util.List;

@Data
public class ClassroomDto {
    private Long id;
    private String name;
    private List<StudentDto> students;
}
