package com.sonata.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Patient_Feedback {
	@Id
	long feedback_Id;
	long dr_Id;
	long pat_Id;
	String feedback;
	
	String date;
	
	Patient_Feedback() {}
	
	Patient_Feedback(long id, long d_id, long p_id, String feedback , String date) {
this.feedback_Id=id;
this.dr_Id=d_id;
this.pat_Id=p_id;
this.feedback=feedback;
this.date=date;
	
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

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	public long getFeedback_Id() {
		return feedback_Id;
	}

	public void setFeedback_Id(long feedback_Id) {
		this.feedback_Id = feedback_Id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Patient_Feedback [dr_Id=" + dr_Id + ", pat_Id=" + pat_Id + ", feedback=" + feedback + ", feedback_Id="
				+ feedback_Id + ", date=" + date + "]";
	}


}
