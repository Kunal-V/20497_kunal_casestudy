package com.sonata.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Doctor_Login {
	@Id
	long dr_Id;
	String password;
	
	Doctor_Login() {}
	
	Doctor_Login(long id, String password) {
		this.dr_Id=id;
		this.password=password;
	}

	public long getDr_Id() {
		return dr_Id;
	}

	public void setDr_Id(long dr_Id) {
		this.dr_Id = dr_Id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Doctor_Login [dr_Id=" + dr_Id + ", password=" + password + "]";
	}
}
