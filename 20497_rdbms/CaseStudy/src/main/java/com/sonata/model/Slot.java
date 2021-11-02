package com.sonata.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Slot {
@Id
	long slot_Id;
	long dr_Id;
	long pat_Id;
	long dis_Id;
	String date;
	String start_time;
	String end_time;
	


Slot() {}
	
	Slot(long id, long d_id, long p_id , long dis_id, String date, String s_time, String e_time ) {
		this.slot_Id=id;
		this.dr_Id= d_id;
		this.pat_Id=p_id;
		this.dis_Id=dis_id;
		this.date=date;
		this.start_time=s_time;
		this.end_time=e_time;
	
		
	}

	public long getDr_Id() {
		return dr_Id;
	}

	public void setDr_Id(long dr_Id) {
		this.dr_Id = dr_Id;
	}

	public long getPat_Id() {
		return pat_Id;
	}

	public void setPat_Id(long pat_Id) {
		this.pat_Id = pat_Id;
	}

	public long getDis_Id() {
		return dis_Id;
	}

	public void setDis_Id(long dis_Id) {
		this.dis_Id = dis_Id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getStart_time() {
		return start_time;
	}

	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}

	public String getEnd_time() {
		return end_time;
	}

	public void setEnd_time(String end_time) {
		this.end_time = end_time;
	}

	public long getSlot_Id() {
		return slot_Id;
	}

	public void setSlot_Id(long slot_Id) {
		this.slot_Id = slot_Id;
	}

	@Override
	public String toString() {
		return "Slot [dr_Id=" + dr_Id + ", pat_Id=" + pat_Id + ", dis_Id=" + dis_Id + ", date=" + date + ", start_time="
				+ start_time + ", end_time=" + end_time + ", slot_Id=" + slot_Id + "]";
	}
	




}