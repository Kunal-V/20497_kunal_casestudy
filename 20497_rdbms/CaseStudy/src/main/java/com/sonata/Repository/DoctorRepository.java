package com.sonata.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sonata.model.Doctor;


@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {

}
