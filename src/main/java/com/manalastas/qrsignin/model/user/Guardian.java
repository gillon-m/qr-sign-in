package com.manalastas.qrsignin.model.user;

import com.manalastas.qrsignin.model.classroom.Student;
import com.manalastas.qrsignin.model.detail.Contact;
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
