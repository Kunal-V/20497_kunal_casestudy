package com.sonata.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sonata.model.Patient_Feedback;

@Repository
public interface PatientFeedbackRepository extends JpaRepository<Patient_Feedback, Long> {

}
