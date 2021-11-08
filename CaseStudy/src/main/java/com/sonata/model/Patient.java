package com.sonata.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Patient {
@Id
	long pat_Id;
	String pat_Name;
	long age;
	String email;
	String sex;
	long phone_No;
	String blood_Group;
	
	Patient() {}
	
	Patient(long id, String name , long age ,String email, String sex, long phone ,String blood) {
		this.pat_Id=id;
		this.pat_Name=name;
		this.age=age;
		this.email=email;
		this.sex=sex;
		this.phone_No=phone;
		this.blood_Group=blood;
		
	}

	public long getPat_Id() {
		return pat_Id;
	}

	public void setPat_Id(long pat_Id) {
		this.pat_Id = pat_Id;
	}

	public String getPat_Name() {
		return pat_Name;
	}

	public void setPat_Name(String pat_Name) {
		this.pat_Name = pat_Name;
	}

	public long getAge() {
		return age;
	}

	public void setAge(long age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public long getPhone_No() {
		return phone_No;
	}

	public void setPhone_No(long phone_No) {
		this.phone_No = phone_No;
	}

	public String getBlood_Group() {
		return blood_Group;
	}

	public void setBlood_Group(String blood_Group) {
		this.blood_Group = blood_Group;
	}

	@Override
	public String toString() {
		return "Patient [pat_Id=" + pat_Id + ", pat_Name=" + pat_Name + ", age=" + age + ", email=" + email + ", sex="
				+ sex + ", phone_No=" + phone_No + ", blood_Group=" + blood_Group + "]";
	}
	

}
