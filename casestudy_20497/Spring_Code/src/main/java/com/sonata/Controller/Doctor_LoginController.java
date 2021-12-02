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
import com.sonata.Repository.Doctor_LoginRepository;
import com.sonata.model.Doctor;
import com.sonata.model.Doctor_Login;

import org.springframework.web.bind.annotation.CrossOrigin;


@RestController
@CrossOrigin(origins = { "http://localhost:4200","http://localhost:3000"})
public class Doctor_LoginController {

Optional<Doctor_Login> dl1;
	
	@Autowired
	private Doctor_LoginRepository prepository6;
	
	@GetMapping("/doctorlogin")
	public List<Doctor_Login> getAllDoctor_Login() {
		return prepository6.findAll();
	}
	
	@GetMapping("/doctorlogin/{id}")
	public ResponseEntity getDoctor_LoginById(@PathVariable(value="id") Long dr_Id)
	{
		dl1 = prepository6.findById(dr_Id);
		return ResponseEntity.ok().body(dl1);
	}
	

	@PostMapping(value = "/doctorlogin")
	public Doctor_Login saveDoctor_Login (@RequestBody Doctor_Login dlog)
	{
		return prepository6.save(dlog);
	}
	
	@PutMapping(value="/doctorlogin/{id}")
	public ResponseEntity updateDoctor_Login(@PathVariable(value="id") Long dr_Id, @RequestBody Doctor_Login drdata) {
	Doctor_Login dl2 = prepository6.findById(dr_Id).get();
	dl2.setDr_Id(drdata.getDr_Id());
	dl2.setPassword(drdata.getPassword());
	
	Doctor_Login updateDoctor_Login = prepository6.save(dl2);
	return ResponseEntity.ok(updateDoctor_Login);
	}

	@DeleteMapping(value="/doctorlogin/{id}")
	public ResponseEntity deleteDoctor_Login(@PathVariable(value="id") Long dr_Id) {
	prepository6.deleteById(dr_Id);
	return ResponseEntity.noContent().build();
	

	}


}



