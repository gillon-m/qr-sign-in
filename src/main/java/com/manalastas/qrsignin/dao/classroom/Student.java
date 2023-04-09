package com.manalastas.qrsignin.dao.classroom;

import com.manalastas.qrsignin.dao.user.Guardian;
import jakarta.persistence.*;
import lombok.Data;

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
    private Classroom classroom;
}
