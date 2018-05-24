package dao;

import java.util.List;

import entity.Emp;

public interface IEmpDao {

	public void insertEmp(Emp emp);
	
	public Emp selectById(Integer id);
	public Emp selectById2(Integer id);
	public Emp selectById3(Integer id);
	
	public List<Emp> selectAll();
}
