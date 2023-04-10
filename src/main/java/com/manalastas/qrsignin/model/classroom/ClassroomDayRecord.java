package com.manalastas.qrsignin.model.classroom;

import com.manalastas.qrsignin.model.user.Teacher;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Entity
public class ClassroomDayRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Date date;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "classroom_id", referencedColumnName = "id")
    private Classroom classroom;
    @ManyToMany
    @JoinTable(name = "classroomDayRecord_headTeacher")
    private List<Teacher> headTeacher;
    @ManyToMany
    @JoinTable(name = "classroomDayRecord_supportTeacher")
    private List<Teacher> supportTeachers;
    @OneToMany(mappedBy = "classroomDayRecord")
    private List<Attendance> attendances;
}
