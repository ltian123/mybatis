package test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import dao.IEmpDao;
import entity.Emp;

import util.MyBatisUtil;

public class Test07 {
	public static void main(String[] args) {
		SqlSession session = null;
		
		try {
			session = MyBatisUtil.getSession();
			
			IEmpDao empDao = session.getMapper(IEmpDao.class);
			
			
			Emp emp = empDao.selectById3(1);
			
//			List<Emp> emps = empDao.selectAll();
			
			System.out.println(emp);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			MyBatisUtil.closeSession(session);
		}
		
		
	}

}
