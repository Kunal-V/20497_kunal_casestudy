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

import com.sonata.Repository.DoctorRepository;
import com.sonata.model.Doctor;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
@CrossOrigin(origins ={ "http://localhost:4200","http://localhost:3000"})
public class DoctorController {
	
	Optional<Doctor> d1;
	
	@Autowired
	private DoctorRepository prepository;
	
	@GetMapping("/doctors")
	public List<Doctor> getAllDoctors() {
		return prepository.findAll();
	}
	
	
	@GetMapping("/doctors/{id}")
	public ResponseEntity getDoctorsById(@PathVariable(value="id") Long pId)
	{
		d1 = prepository.findById(pId);
		return ResponseEntity.ok().body(d1);
	}
	
	@PostMapping(value = "/doctors")
	public Doctor saveDoctor (@RequestBody Doctor doc)
	{
		return prepository.save(doc);
	}
	
	
	@PutMapping(value="/doctors/{id}")
	public ResponseEntity updateDoctor(@PathVariable(value="id") Long dr_Id, @RequestBody Doctor ddata) {
	Doctor d2 = prepository.findById(dr_Id).get();
	d2.setDr_Id(ddata.getDr_Id());
	d2.setDr_Name(ddata.getDr_Name());
	d2.setSpecialization(ddata.getSpecialization());
	d2.setEmail(ddata.getEmail());
	d2.setPhone_No(ddata.getPhone_No());
	
	Doctor updateDoctor = prepository.save(d2);
	return ResponseEntity.ok(updateDoctor);
	}
	
	@DeleteMapping(value="/doctors/{id}")
	public ResponseEntity deleteDoctor(@PathVariable(value="id") Long dr_Id) {
	prepository.deleteById(dr_Id);
	return ResponseEntity.noContent().build();
	

	}
	
	

}
