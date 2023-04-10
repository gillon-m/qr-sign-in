package com.manalastas.qrsignin.model.user;

import com.manalastas.qrsignin.model.classroom.Classroom;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Organisation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @OneToMany(mappedBy = "organisation")
    private List<Classroom> classrooms;
}
