package com.sonata.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Prescription {
	@Id
	long slot_Id;
	String prescription;
	
	Prescription() {}
	
	Prescription(long id, String prescription) {
		this.slot_Id=id;
		this.prescription=prescription;
	
}

	public long getSlot_Id() {
		return slot_Id;
	}

	public void setSlot_Id(long slot_Id) {
		this.slot_Id = slot_Id;
	}

	public String getPrescription() {
		return prescription;
	}

	public void setPrescription(String prescription) {
		this.prescription = prescription;
	}

	@Override
	public String toString() {
		return "Prescription [slot_Id=" + slot_Id + ", prescription=" + prescription + "]";
	}
}
