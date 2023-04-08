package com.manalastas.qrsignin.dao.classroom;

import com.manalastas.qrsignin.dao.user.Guardian;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
public class Attendance {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "student_id", referencedColumnName = "id")
    private Student student;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "classroom_id", referencedColumnName = "id")
    private Classroom classroom;
    @ManyToOne
    @JoinColumn(name = "classroomDayRecord_id", referencedColumnName = "id")
    private ClassroomDayRecord classroomDayRecord;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "signedInBy_id", referencedColumnName = "id")
    private Guardian signedInBy;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "signedOutBy_id", referencedColumnName = "id")
    private Guardian signedOutBy;
    private Date signInDateTime;
    private Date signOutDateTime;
}
