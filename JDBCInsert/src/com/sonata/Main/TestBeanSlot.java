package com.sonata.Main;

import java.sql.SQLException;
import com.sonata.Dao.Slot;
import com.sonata.DaoImpl.SlotDaoImpl;

public class TestBeanSlot {

	public static void main(String[] args) throws SQLException {
	Slot s1 = new Slot();
	s1.setPat_id(100);
	s1.setDr_id(10);
	s1.setDis_id(1);
	s1.setDate(10/12/2000);
	s1.setStart_time(1-00);
	s1.setEnd_time(2-00);
	s1.setSlot_id(1000);
	
	SlotDaoImpl dao = new SlotDaoImpl();
	int row = dao.save(s1);
	System.out.println(row);
	


}
}
