package com.sonata.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sonata.model.Patient;


@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {

}
