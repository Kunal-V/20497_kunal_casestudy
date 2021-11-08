package com.sonata.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sonata.model.Disease;

@Repository
public interface DiseaseRepository extends JpaRepository<Disease, Long>{

}
