package com.sonata.DaoImpl;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import com.sonata.Dao.PatDao;
import com.sonata.Dao.Patient;

public class PatDaoImpl  implements PatDao {
	int row = 0;
	DbConnection db = new DbConnection();
	Patient patient = null;
	
	public int save(Object object) {
		try {
			patient = (Patient) object;
			PreparedStatement ca = db.getConnection().prepareStatement("insert into Patient values(?,?,?,?,?,?,?)");
			//PreparedStatement ca = db.getConnection().prepareCall("{call PAT(?,?,?,?,?,?,?)}");
			ca.setInt(1,patient.getPat_id());
			ca.setString(2,patient.getName());
			ca.setInt(3,patient.getAge());
			ca.setString(4,patient.getEmail());
			ca.setString(5,patient.getSex());
			ca.setInt(6,patient.getPhone_no());
			ca.setString(7,patient.getBlood_group());
			row = ca.executeUpdate();
			db.closeConnection();
			//return row;
			
		} catch(SQLException e)  {System.out.println(e); }
		return row;
}

	@Override
	public int PAT(Object object) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Patient> getData() {
		// TODO Auto-generated method stub
		return null;
	}

	
}