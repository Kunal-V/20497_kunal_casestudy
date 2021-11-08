package com.sonata.DaoImpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.sonata.Dao.DocDao;
import com.sonata.Dao.Doctor;

public class DocDaoImpl  implements DocDao {
	int row = 0;
	DbConnection db = new DbConnection();
	Doctor doctor = null;
	
	public int save(Object object) {
		try {
			doctor = (Doctor) object;
			PreparedStatement cs = db.getConnection().prepareStatement("insert into Doctor values(?,?,?,?,?)");
			//PreparedStatement cs = db.getConnection().prepareCall("{call DOC(?,?,?,?,?)}");
			cs.setInt(1,doctor.getDr_id());
			cs.setString(2,doctor.getDr_name());
			cs.setString(3,doctor.getSpecialization());
			cs.setString(4,doctor.getEmail());
			cs.setInt(5,doctor.getPhone_no());
			row = cs.executeUpdate();
			db.closeConnection();
			//return row;
			
		} catch(SQLException e)  {System.out.println(e); }
		return row;
}

	@Override
	public List<Doctor> getData() {
		// TODO Auto-generated method stub
		return null;
	}
}
			
		/*	@Override
			public List <Doctor> getData() {
				List<Doctor> docList = new ArrayList<>();
				
				try {
					PreparedStatement cs1 = db.getConnection().prepareStatement("select * from Doctor");
					ResultSet rs = cs1.executeQuery();
					while(rs.next()) {
						Doctor d1 = new Doctor ();
						int dr_id = rs.getInt(1);
						String dr_name = rs.getString(2);
						String specialization = rs.getString(3);
						String email = rs.getString(4);
						int phone_no = rs.getInt(5);
						
						d1.setDr_id(dr_id);
						d1.setDr_name(dr_name);
						d1.setSpecialization(specialization);
						d1.setEmail(email);
						d1.setPhone_no(phone_no);
						
					}
					
					}catch(SQLException se) {se.printStackTrace(); }
				return docList;
				}

}*/ 
		

 