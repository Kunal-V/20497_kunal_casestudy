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
import com.sonata.model.Prescription;
import com.sonata.Repository.PrescriptionRepository;

@RestController
public class PrescriptionController {

	Optional<Prescription> ps1;
	
	@Autowired
	private PrescriptionRepository prepository4;
	
	@GetMapping("/prescriptions")
	public List<Prescription> getAllPrescriptions() {
		return prepository4.findAll();
	}
	
	@GetMapping("/prescriptions/{id}")
	public ResponseEntity getPrescriptionsById(@PathVariable(value="id") Long slot_Id)
	{
		ps1 = prepository4.findById(slot_Id);
		return ResponseEntity.ok().body(ps1);
	}
	
	@PostMapping(value = "/prescriptions")
	public Prescription savePrescription (@RequestBody Prescription ps)
	{
		return prepository4.save(ps);
	}
	

}
