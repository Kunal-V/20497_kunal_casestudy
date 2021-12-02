package com.sonata.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Patient_Login {
	@Id
	long pat_Id;
	String password;
	
	Patient_Login() {}
	Patient_Login(long id, String password) {
		this.pat_Id=id;
		this.password=password;
	}
	public long getPat_Id() {
		return pat_Id;
	}
	public void setPat_Id(long pat_Id) {
		this.pat_Id = pat_Id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Patient_Login [pat_Id=" + pat_Id + ", password=" + password + "]";
	}
}
