package com.sonata;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.io.*;

public class ImageStorage {

	public static void main(String[] args) throws FileNotFoundException  {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/EmployeeDB", "root", "admin@123");
			
			PreparedStatement ps = con.prepareStatement("insert into image values(?)");
			File file=new File("E:/training/im.jpg");
			FileInputStream fin = new FileInputStream(file);
			ps.setBinaryStream(1, fin,(int)file.length());
			int row = ps.executeUpdate();
			System.out.println(row);
		
		}catch(ClassNotFoundException e) {System.out.println(e);}
		catch(SQLException e1)  {System.out.println(e1); }
		
	}

}
