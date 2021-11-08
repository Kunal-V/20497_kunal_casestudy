package com.sonata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdatePrepareExample {

	public static void main(String[] args) {
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection
		("jdbc:mysql://localhost:3306/OnlineHospital", "root", "admin@123");
		PreparedStatement ps = con.prepareStatement("Update doctor set phone_no=? where dr_id = ?");
		ps.setInt(1, 987654321);
		ps.setInt(2,10);
		
		int a = ps.executeUpdate();
		System.out.println("the number of records updated is " + a );
		
	}catch(ClassNotFoundException e1 ) {System.out.println(e1); }
	 catch(SQLException e2) {e2.printStackTrace(); }
	}

}
