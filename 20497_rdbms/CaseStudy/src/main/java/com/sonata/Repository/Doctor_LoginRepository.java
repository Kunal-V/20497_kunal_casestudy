package com.sonata.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sonata.model.Doctor_Login;



@Repository
public interface Doctor_LoginRepository extends JpaRepository<Doctor_Login, Long> {

}
