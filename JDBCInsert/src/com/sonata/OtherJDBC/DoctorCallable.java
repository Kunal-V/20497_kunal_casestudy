package com.sonata.OtherJDBC;


import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DoctorCallable {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/OnlineHospital", "root", "admin@123");
			
			CallableStatement cs = con.prepareCall("{call DOC(?,?,?,?,?)}");
			cs.setInt(1,100);
			cs.setString(2, "Kunal");
			cs.setString(3, "ENT");
			cs.setString(4, "kunal@yahoo.com");
			cs.setInt(5, 963852741);
			
			int rs = cs.executeUpdate();
			System.out.println("the number of records inserted is " + rs);
			
			
		
		}catch(ClassNotFoundException e1) {System.out.println(e1);}
		catch(SQLException e2)  {e2.printStackTrace();

	}
	}
}
