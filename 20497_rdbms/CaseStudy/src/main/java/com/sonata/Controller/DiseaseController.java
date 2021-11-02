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

import com.sonata.Repository.DiseaseRepository;
import com.sonata.Repository.DoctorRepository;
import com.sonata.model.Disease;
import com.sonata.model.Doctor;

@RestController
public class DiseaseController {

Optional<Disease> dis1;
	
	@Autowired
	private DiseaseRepository prepository5;
	
	@GetMapping("/diseases")
	public List<Disease> getAllDisease() {
		return prepository5.findAll();
	}
	
	@GetMapping("/diseases/{id}")
	public ResponseEntity getDiseasesById(@PathVariable(value="id") Long dis_Id)
	{
		dis1 = prepository5.findById(dis_Id);
		return ResponseEntity.ok().body(dis1);
	}
	
	@PostMapping(value = "/diseases")
	public Disease saveDisease (@RequestBody Disease dis)
	{
		return prepository5.save(dis);
	}
	
	
	
}
