package com.manalastas.qrsignin.controller;

import com.manalastas.qrsignin.dto.ClassroomDto;
import com.manalastas.qrsignin.dto.OrganisationDTO;
import com.manalastas.qrsignin.model.classroom.Classroom;
import com.manalastas.qrsignin.model.user.Organisation;
import com.manalastas.qrsignin.service.OrganisationService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/organisations")
public class OrganisationController {
    @Autowired
    private OrganisationService organisationService;

    @Autowired
    private ModelMapper modelMapper;

    @PostMapping
    public OrganisationDTO createOrganisation(@RequestBody OrganisationDTO organisationRequest){
        Organisation organisation = modelMapper.map(organisationRequest, Organisation.class);
        Organisation createdOrganisation = organisationService.createOrganisation(organisation);
        return modelMapper.map(createdOrganisation, OrganisationDTO.class);
    }

    @GetMapping("/{id}")
    public OrganisationDTO getOrganisation(@PathVariable Long id){
        Organisation organisation = organisationService.getOrganisation(id);
        return modelMapper.map(organisation, OrganisationDTO.class);
    }

    @PostMapping("/{id}/classrooms")
    public List<ClassroomDto> addClassrooms(@PathVariable Long id, @RequestBody List<ClassroomDto> classroomsDto){
        List<Classroom> classrooms = classroomsDto
                .stream()
                .map(dto -> modelMapper.map(dto, Classroom.class))
                .collect(Collectors.toList());

        return organisationService.addClassrooms(id, classrooms)
                .stream()
                .map(dto -> modelMapper.map(dto, ClassroomDto.class))
                .collect(Collectors.toList());
    }
}
