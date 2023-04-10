package com.manalastas.qrsignin.dao;

import com.manalastas.qrsignin.model.classroom.Classroom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassroomDao extends JpaRepository<Classroom, Long> {
}
