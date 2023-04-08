package com.manalastas.qrsignin.dao.user;

import com.manalastas.qrsignin.dao.classroom.Classroom;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Embedded
    private Contact contact;
//    @JoinColumn(name = "classroom_id", referencedColumnName = "id")
//    private Classroom classroom;
}