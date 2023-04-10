package com.manalastas.qrsignin.model.user;

import com.manalastas.qrsignin.model.classroom.Classroom;
import com.manalastas.qrsignin.model.detail.Contact;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Embedded
    private Contact contact;
    @ManyToMany(mappedBy = "headTeachers")
    private List<Classroom> headOfClassrooms;
    @ManyToMany(mappedBy = "supportTeachers")
    private List<Classroom> supportOfClassroom;

}