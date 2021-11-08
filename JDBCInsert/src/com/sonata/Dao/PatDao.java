package com.sonata.Dao;

import java.util.List;
	
	public interface PatDao {
		public int PAT(Object object);
		//public List <Patient> getData();
		//public int delete(Object object);
		//public int update(Object object);

		List<Patient> getData();

	
}
