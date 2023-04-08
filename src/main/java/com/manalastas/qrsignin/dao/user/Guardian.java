package com.manalastas.qrsignin.dao.user;

import com.manalastas.qrsignin.dao.classroom.Student;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Guardian {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Embedded
    private Contact contact;
    @ManyToMany
    @JoinTable(
            name="guardian_ward",
            joinColumns=@JoinColumn(name="guardian_id"),
            inverseJoinColumns=@JoinColumn(name="ward_id"))
    private List<Student> wards;

}
