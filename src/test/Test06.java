package test;

import org.apache.ibatis.session.SqlSession;

import dao.IDeptDao;
import dao.IEmpDao;

import entity.Dept;
import entity.Emp;

import util.MyBatisUtil;

public class Test06 {
	
	public static void main(String[] args) {
		SqlSession session = null;
		Dept dept = new Dept();
		dept.setName("ÊÐ³¡²¿");
		
		
		Emp emp1 = new Emp();
		emp1.setName("aaa");
		emp1.setSalary(5000.0);
		emp1.setDept(dept);
		
		
		Emp emp2 = new Emp();
		emp2.setName("bbb");
		emp2.setSalary(6000.0);
		emp2.setDept(dept);
		
		
		Emp emp3 = new Emp();
		emp3.setName("ccc");
		emp3.setSalary(8000.0);
		emp3.setDept(dept);
		
		
		
		try {
			session = MyBatisUtil.getSession();
			
			IDeptDao deptDao = session.getMapper(IDeptDao.class);
			
			deptDao.insertDept(dept);
			
			
			IEmpDao empDao = session.getMapper(IEmpDao.class);
			
			empDao.insertEmp(emp1);
			empDao.insertEmp(emp2);
			empDao.insertEmp(emp3);
			
			
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
		} finally{
			MyBatisUtil.closeSession(session);
		}
		
	}

}
