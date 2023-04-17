package com.manalastas.qrsignin.model.user;

import com.manalastas.qrsignin.model.classroom.Classroom;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedList;
import java.util.List;

@Getter
@Setter
@Entity
public class Organisation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @OneToMany(mappedBy = "organisation")
    private List<Classroom> classrooms = new LinkedList<>();
}
