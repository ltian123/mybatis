package dao;

import entity.Dept;

public interface IDeptDao {

	public void insertDept(Dept dept);
	
	
	public Dept selectById(Integer id);
}
