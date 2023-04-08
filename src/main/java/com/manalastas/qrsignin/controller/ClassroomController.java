package com.manalastas.qrsignin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/classroom")
public class ClassroomController {
    @GetMapping("hi")
    public String sup(){
        return "hello";
    }
}