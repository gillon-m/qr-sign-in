package com.manalastas.qrsignin.dao.classroom;

import com.manalastas.qrsignin.dao.user.Organisation;
import com.manalastas.qrsignin.dao.user.Teacher;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Classroom {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToMany(mappedBy = "classroom")
    private List<Student> students;
    @ManyToMany
    @JoinTable(
            name = "classroom_headTeacher",
            joinColumns = @JoinColumn(name = "classroom_id"),
            inverseJoinColumns = @JoinColumn(name = "headTeacher_id"))
    private List<Teacher> headTeachers;
//    @ManyToMany
//    @JoinTable(
//            name = "classroom_supportTeacher",
//            joinColumns = @JoinColumn(name = "classroom_id"),
//            inverseJoinColumns = @JoinColumn(name = "supportTeacher_id"))
//    private List<Teacher> supportTeachers;
    @ManyToOne
    @JoinColumn(name = "organisation_id", referencedColumnName = "id")
    private Organisation organisation;
//    private blob qrCode;
}
