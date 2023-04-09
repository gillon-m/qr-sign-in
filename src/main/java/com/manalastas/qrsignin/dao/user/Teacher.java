package com.manalastas.qrsignin.dao.user;

import com.manalastas.qrsignin.dao.classroom.Classroom;
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