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
import com.sonata.model.Slot;
import com.sonata.Repository.PatientRepository;
import com.sonata.Repository.SlotRepository;

@RestController
public class SlotController {

		Optional<Slot> s1;
		
		@Autowired
		private SlotRepository prepository3;
		
		
		@GetMapping("/slots")
		public List<Slot> getAllSlots() {
			return prepository3.findAll();
		}

		@GetMapping("/slots/{id}")
		public ResponseEntity getSlotsById(@PathVariable(value="id") Long slot_Id)
		{
			s1 = prepository3.findById(slot_Id);
			return ResponseEntity.ok().body(s1);
		}
		
		@PostMapping(value = "/slots")
		public Slot saveSlot (@RequestBody Slot slot)
		{
			return prepository3.save(slot);
		}

		@PutMapping(value="/slots/{id}")
		public ResponseEntity updateSlot(@PathVariable(value="id") Long slot_Id, @RequestBody Slot sdata) {
		Slot s2 = prepository3.findById(slot_Id).get();
		s2.setDr_Id(sdata.getDr_Id());
		s2.setPat_Id(sdata.getPat_Id());
		s2.setDis_Id(sdata.getDis_Id());
		s2.setStart_time(sdata.getStart_time());
		s2.setEnd_time(sdata.getEnd_time());
		s2.setSlot_Id(sdata.getSlot_Id());
		s2.setDate(sdata.getDate());
		
		
		
		Slot updateSlot = prepository3.save(s2);
		return ResponseEntity.ok(updateSlot);
		}

		@DeleteMapping(value="/slots/{id}")
		public ResponseEntity deleteSlot(@PathVariable(value="id") Long slot_Id) {
		prepository3.deleteById(slot_Id);
		return ResponseEntity.noContent().build();
		

		}













}
