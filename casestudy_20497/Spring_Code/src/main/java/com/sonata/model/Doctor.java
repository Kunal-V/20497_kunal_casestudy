package com.sonata.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Doctor {
@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)

	long dr_Id;
	String dr_Name;
	String specialization;
	String email;
	long phone_No;
	
	Doctor() {}
	
	Doctor(long id , String name, String spec, String mail, long phone) {
		this.dr_Id=id;
		this.dr_Name=name;
		this.specialization=spec;
		this.email=mail;
		this.phone_No=phone;
	
	}


	public long getDr_Id() {
		return dr_Id;
	}

	public void setDr_Id(long dr_Id) {
		this.dr_Id = dr_Id;
	}

	public String getDr_Name() {
		return dr_Name;
	}

	public void setDr_Name(String dr_Name) {
		this.dr_Name = dr_Name;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone_No() {
		return phone_No;
	}

	public void setPhone_No(long phone_No) {
		this.phone_No = phone_No;
	}

	@Override
	public String toString() {
		return "Doctor [dr_Id=" + dr_Id + ", dr_Name=" + dr_Name + ", specialization=" + specialization + ", email="
				+ email + ", phone_No=" + phone_No + "]";
	}
}