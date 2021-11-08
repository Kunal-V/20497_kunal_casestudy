package com.sonata.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Disease {
	@Id
	long dis_Id;
	String dis_Name;
	
	Disease() {}
	
	Disease(long id, String name) {
		this.dis_Id=id;
		this.dis_Name=name;
	}

	public long getDis_Id() {
		return dis_Id;
	}

	public void setDis_Id(long dis_Id) {
		this.dis_Id = dis_Id;
	}

	public String getDis_Name() {
		return dis_Name;
	}

	public void setDis_Name(String dis_Name) {
		this.dis_Name = dis_Name;
	}

	@Override
	public String toString() {
		return "Disease [dis_Id=" + dis_Id + ", dis_Name=" + dis_Name + "]";
	}
	
	
	
	
	
}
