package com.sonata.OtherJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransactionControlExample {

	public static void main(String[] args) throws SQLException {
	Connection con=null;	
		try {
			Class.forName("com.mysql.jdbc.Driver");
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/EmployeeDB", "root", "admin@123");
			 con.setAutoCommit(false);
			 PreparedStatement ps = con.prepareStatement("insert into Employee values(?,?,?)");
			 ps.setInt(1, 2800);
			 ps.setString(2, "BYE");
			 ps.setDouble(3, 4568.98);
			 int a = ps.executeUpdate();
			 con.commit();
			 System.out.println("the number of records updated are " + a);
			 
	}catch(ClassNotFoundException e1) {System.out.println(e1);}
		catch(SQLException e2)  {e2.printStackTrace(); 
		con.rollback();
	}
	finally {
		con.close();
	}
}
}