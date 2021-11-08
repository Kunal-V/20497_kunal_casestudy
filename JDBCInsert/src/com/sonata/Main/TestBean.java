package com.sonata.Main;

import java.sql.SQLException;
import java.util.List;
import com.sonata.Dao.Doctor;
import com.sonata.DaoImpl.DocDaoImpl;

public class TestBean {

	public static void main(String[] args) throws SQLException {
	Doctor d1 = new Doctor();
	d1.setDr_id(10);
	d1.setDr_name("rao");
	d1.setSpecialization("Physician");
	d1.setEmail("rao@235");
	d1.setPhone_no(987654321);
	
	DocDaoImpl dao = new DocDaoImpl();
	int row = dao.save(d1);
	System.out.println(row);
	

/*	List<Doctor> list = dao.getData();
	for(Doctor d : list) {
		System.out.println(d.getDr_id());
		System.out.println(d.getDr_name());
		System.out.println(d.getSpecialization());
		System.out.println(d.getEmail());
		System.out.println(d.getPhone_no());
	} */
	} 

}
