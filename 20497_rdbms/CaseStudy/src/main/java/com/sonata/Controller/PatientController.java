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

import com.sonata.model.Patient;
import com.sonata.Repository.PatientRepository;


@RestController
public class PatientController {

	Optional<Patient> p1;
	
	@Autowired
	private PatientRepository prepository1;
	
	@GetMapping("/patients")
	public List<Patient> getAllPatients() {
		return prepository1.findAll();
	}
	

	@GetMapping("/patients/{id}")
	public ResponseEntity getPatientsById(@PathVariable(value="id") Long pat_Id)
	{
		p1 = prepository1.findById(pat_Id);
		return ResponseEntity.ok().body(p1);
	}
	
	@PostMapping(value = "/patients")
	public Patient savePatient (@RequestBody Patient pat)
	{
		return prepository1.save(pat);
	}
	
	@PutMapping(value="/patients/{id}")
	public ResponseEntity updatePatient(@PathVariable(value="id") Long pat_Id, @RequestBody Patient pdata) {
	Patient p2 = prepository1.findById(pat_Id).get();
	p2.setPat_Id(pdata.getPat_Id());
	p2.setPat_Name(pdata.getPat_Name());
	p2.setAge(pdata.getAge());
	p2.setEmail(pdata.getEmail());
	p2.setSex(pdata.getSex());
	p2.setPhone_No(pdata.getPhone_No());
	p2.setBlood_Group(pdata.getBlood_Group());
	
	
	
	Patient updatePatient = prepository1.save(p2);
	return ResponseEntity.ok(updatePatient);
	}
	
	@DeleteMapping(value="/patients/{id}")
	public ResponseEntity deletePatient(@PathVariable(value="id") Long pat_Id) {
	prepository1.deleteById(pat_Id);
	return ResponseEntity.noContent().build();
	

	}
	
	
	
}
