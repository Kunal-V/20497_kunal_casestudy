package com.sonata.OtherJDBC;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CallableExample {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/EmployeeDB", "root", "admin@123");
			
			CallableStatement cs = con.prepareCall("{call SAVE(?,?,?)}");
			cs.setInt(1,322);
			cs.setString(2, "excecution");
			cs.setDouble(3, 34546.0);
			
			int rs = cs.executeUpdate();
			System.out.println("the number of records inserted is " + rs);
			
			
		
		}catch(ClassNotFoundException e1) {System.out.println(e1);}
		catch(SQLException e2)  {e2.printStackTrace();

	}
	}
}
