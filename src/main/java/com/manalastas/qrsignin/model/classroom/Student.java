package com.manalastas.qrsignin.model.classroom;

import com.manalastas.qrsignin.model.user.Guardian;
import jakarta.persistence.*;
import lombok.Data;

import java.util.LinkedList;
import java.util.List;

@Entity
@Data
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    @ManyToMany(mappedBy = "wards")
    private List<Guardian> guardians;
    @ManyToMany(mappedBy = "students")
    private List<Classroom> classrooms;
}
