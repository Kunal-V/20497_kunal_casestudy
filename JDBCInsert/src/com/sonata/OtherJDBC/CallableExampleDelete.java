package com.sonata.OtherJDBC;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CallableExampleDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/EmployeeDB", "root", "admin@123");
			
			CallableStatement cs = con.prepareCall("{call DELETED(?,?)}");
			cs.setInt(1,322);
			cs.setDouble(2, 9999.0);
			
			int rs = cs.executeUpdate();
			System.out.println("the number of records updated is " + rs);
			
			
		
		}catch(ClassNotFoundException e1) {System.out.println(e1);}
		catch(SQLException e2)  {e2.printStackTrace();

	}
	}
}




	
