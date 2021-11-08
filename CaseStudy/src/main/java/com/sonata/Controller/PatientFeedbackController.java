package com.sonata.Controller;


import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sonata.model.Patient_Feedback;
import com.sonata.Repository.PatientFeedbackRepository;

@RestController
public class PatientFeedbackController {
	
Optional<Patient_Feedback> pf1;
	
	@Autowired
	private PatientFeedbackRepository prepository2;
	
	@GetMapping("/patientfeedbacks")
	public List<Patient_Feedback> getAllPatient_Feedbacks() {
		return prepository2.findAll();
	}
	
	@GetMapping("/patientfeedbacks/{id}")
	public ResponseEntity getPatient_FeedbacksById(@PathVariable(value="id") Long feedback_Id)
	{
		pf1 = prepository2.findById(feedback_Id);
		return ResponseEntity.ok().body(pf1);
	}
	
	@PostMapping(value = "/patientfeedbacks")
	public Patient_Feedback savePatient_Feedback (@RequestBody Patient_Feedback pf)
	{
		return prepository2.save(pf);
	}
	
	@PutMapping(value="/patientfeedbacks/{id}")
	public ResponseEntity updatePatient_Feedback(@PathVariable(value="id") Long feedback_Id, @RequestBody Patient_Feedback pfdata) {
	Patient_Feedback pf2 = prepository2.findById(feedback_Id).get();
	pf2.setDr_Id(pfdata.getDr_Id());
	pf2.setPat_Id(pfdata.getPat_Id());
	pf2.setFeedback(pfdata.getFeedback());
	pf2.setFeedback_Id(pfdata.getFeedback_Id());
	pf2.setDate(pfdata.getDate());
	
	
	
	Patient_Feedback updatePatient_Feedback = prepository2.save(pf2);
	return ResponseEntity.ok(updatePatient_Feedback);
	}

	@DeleteMapping(value="/patientfeedbacks/{id}")
	public ResponseEntity deletePatient_Feedback(@PathVariable(value="id") Long feedback_Id) {
	prepository2.deleteById(feedback_Id);
	return ResponseEntity.noContent().build();
	

	}
	
	
	
	
}
