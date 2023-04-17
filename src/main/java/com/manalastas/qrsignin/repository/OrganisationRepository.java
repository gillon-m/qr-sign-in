package com.manalastas.qrsignin.repository;

import com.manalastas.qrsignin.model.user.Organisation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface OrganisationRepository extends JpaRepository<Organisation, Long> {
    Optional<Organisation> findById(Long id);
}
