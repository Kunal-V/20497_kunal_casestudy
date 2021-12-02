package com.sonata.Controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sonata.model.Patient;
import com.sonata.model.Patient_Login;
import com.sonata.Repository.PatientRepository;
import com.sonata.Repository.Patient_LoginRepository;



@RestController
@CrossOrigin(origins ={ "http://localhost:4200","http://localhost:3000"})
public class Patient_LoginController {

Optional<Patient_Login> pl1;
	
	@Autowired
	private Patient_LoginRepository prepository7;
	
	@GetMapping("/patientlogin")
	public List<Patient_Login> getAllPatient_Login() {
		return prepository7.findAll();
	}	
	@GetMapping("/patientlogin/{id}")
	public ResponseEntity getPatient_LoginById(@PathVariable(value="id") Long pat_Id)
	{
		pl1 = prepository7.findById(pat_Id);
		return ResponseEntity.ok().body(pl1);
	}
	
	@PostMapping(value = "/patientlogin")
	public Patient_Login savePatient_Login (@RequestBody Patient_Login plog)
	{
		return prepository7.save(plog);
	}
	
	@PutMapping(value="/patientlogin/{id}")
	public ResponseEntity updatePatient_login(@PathVariable(value="id") Long pat_Id, @RequestBody Patient_Login pldata) {
	Patient_Login pl2 = prepository7.findById(pat_Id).get();
	pl2.setPat_Id(pldata.getPat_Id());
	pl2.setPassword(pldata.getPassword());
	
	
	Patient_Login updatePatient_Login = prepository7.save(pl2);
	return ResponseEntity.ok(updatePatient_Login);
	}


}
