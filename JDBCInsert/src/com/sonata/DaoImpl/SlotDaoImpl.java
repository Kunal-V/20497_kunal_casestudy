package com.sonata.DaoImpl;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.sonata.Dao.SlotDao;
import com.sonata.Dao.Patient;
import com.sonata.Dao.Slot;


public class SlotDaoImpl implements SlotDao {
	
	int row = 0;
	DbConnection db = new DbConnection();
	Slot slot = null;
	
	public int save(Object object) {
		try {
			slot = (Slot) object;
			PreparedStatement cb = db.getConnection().prepareStatement("insert into Slot values(?,?,?,?,?,?,?)");
			cb.setInt(1,slot.getDr_id());
			cb.setInt(2,slot.getPat_id());
			cb.setInt(3,slot.getDis_id());
			cb.setInt(4,slot.getDate());
			cb.setInt(5,slot.getStart_time());
			cb.setInt(6,slot.getEnd_time());
			cb.setInt(7,slot.getSlot_id());
			row = cb.executeUpdate();
			db.closeConnection();
			
		} catch(SQLException e)  {System.out.println(e); }
		return row;
}

	@Override
	public int SLOT(Object object) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Patient> getData() {
		// TODO Auto-generated method stub
		return null;
	}

}
