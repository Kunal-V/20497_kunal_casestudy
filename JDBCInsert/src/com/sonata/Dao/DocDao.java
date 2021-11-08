package com.sonata.Dao;

import java.util.List;

public interface DocDao {
	public int save(Object object);
	public List <Doctor> getData();
	//public int delete(Object object);
	//public int update(Object object);

}
