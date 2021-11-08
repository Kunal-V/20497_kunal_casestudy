package com.sonata.DaoImpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.sonata.Dao.Patientfeedback;
import com.sonata.Dao.PatientfeedbackDao;

public class PatientfeedbackDaoImpl  implements PatientfeedbackDao {

	int row = 0;
	DbConnection db = new DbConnection();
	Patientfeedback patientfeedback = null;
	
	public int save(Object object) {
		try {
			patientfeedback = (Patientfeedback) object;
			PreparedStatement pf = db.getConnection().prepareStatement("insert into Patientfeedback values(?,?,?,?,?)");
			//PreparedStatement cs = db.getConnection().prepareCall("{call DOC(?,?,?,?,?)}");
			pf.setInt(1,patientfeedback.getDr_id());
			pf.setInt(2,patientfeedback.getPat_id());
			pf.setString(3,patientfeedback.getFeedback());
			pf.setInt(4,patientfeedback.getFeedback_id());
			pf.setInt(5,patientfeedback.getDate());
			row = pf.executeUpdate();
			db.closeConnection();
			//return row;
			
		} catch(SQLException e)  {System.out.println(e); }
		return row;
}

	@Override
	public List<Patientfeedback> getData() {
		// TODO Auto-generated method stub
		return null;
	}
}
			
		
		

 