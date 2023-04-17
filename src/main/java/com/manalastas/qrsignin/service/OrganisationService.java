package com.manalastas.qrsignin.service;

import com.manalastas.qrsignin.model.classroom.Classroom;
import com.manalastas.qrsignin.model.user.Organisation;
import com.manalastas.qrsignin.repository.ClassroomRepository;
import com.manalastas.qrsignin.repository.OrganisationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrganisationService {
    @Autowired
    private OrganisationRepository organisationRepository;

    @Autowired
    private ClassroomRepository classroomRepository;

    public Organisation getOrganisation(Long id){
        return organisationRepository.findById(id).orElseThrow();
    }

    public Organisation createOrganisation(Organisation organisation) {
        return organisationRepository.save(organisation);
    }

    public List<Classroom> addClassrooms(Long id, List<Classroom> classrooms) {
        Organisation organisation = organisationRepository.findById(id).orElseThrow();
        for(Classroom classroom: classrooms){
            classroom.setOrganisation(organisation);
        }
        return classroomRepository.saveAll(classrooms);
    }
}

