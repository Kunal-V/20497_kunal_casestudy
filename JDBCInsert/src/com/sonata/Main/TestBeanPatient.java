package com.sonata.Main;

import java.sql.SQLException;
import com.sonata.Dao.Patient;
import com.sonata.DaoImpl.PatDaoImpl;


public class TestBeanPatient {

	public static void main(String[] args) throws SQLException {
	Patient p1 = new Patient();
	p1.setPat_id(200);
	p1.setName("rohan");
	p1.setAge(22);;
	p1.setSex("M");;
	p1.setEmail("rohan@123");
	p1.setPhone_no(785554321);
	p1.setBlood_group("B+");
	
	PatDaoImpl dao = new PatDaoImpl();
	int row = dao.save(p1);
	System.out.println(row);
	


}
}
