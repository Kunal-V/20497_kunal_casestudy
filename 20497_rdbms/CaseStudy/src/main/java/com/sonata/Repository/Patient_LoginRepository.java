package com.sonata.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sonata.model.Patient;
import com.sonata.model.Patient_Login;


@Repository
public interface Patient_LoginRepository extends JpaRepository<Patient_Login, Long>{

}
