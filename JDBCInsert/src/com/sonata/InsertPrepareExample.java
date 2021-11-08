package com.sonata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertPrepareExample {
	
	public static void main(String[] args) {
	
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/OnlineHospital", "root", "admin@123");
			
			PreparedStatement ps = con.prepareStatement("insert into Doctor values(?,?,?,?,?)");
			ps.setInt(1, 20);
			ps.setString(2,"Rao");
			ps.setString(3, "Physician");
			ps.setString(4, "rao@123");
			ps.setInt(5, 741852963);
			
			
			int a = ps.executeUpdate();
			System.out.println("the number of records updated are " + a);
			
		

	}catch(ClassNotFoundException e1 ) {System.out.println(e1); }
		 catch(SQLException e2) {e2.printStackTrace(); }
	}
}
