package com.sonata.Main;

import java.sql.SQLException;

import com.sonata.Dao.Patientfeedback;
import com.sonata.DaoImpl.PatientfeedbackDaoImpl;

public class TestBeanPatientfeedback {

	public static void main(String[] args) throws SQLException {
	Patientfeedback p1 = new Patientfeedback();
	p1.setPat_id(200);
	p1.setDr_id(10);
	p1.setFeedback("very great doctor");
	p1.setFeedback_id(001);
	p1.setDate(11/01/2001);
	
	PatientfeedbackDaoImpl dao = new PatientfeedbackDaoImpl();
	int row = dao.save(p1);
	System.out.println(row);
	


}
}
