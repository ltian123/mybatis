package test;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import dao.IUserDao;

import entity.User;

import util.MyBatisUtil;

public class Test02 {

	public static void main(String[] args) {
		SqlSession session = null;
//		List<User> users = new ArrayList<User>();
		User u = new User();
		u.setUsername("admin");
		u.setPassword("admin");
		try {
			session = MyBatisUtil.getSession();
			
			IUserDao userDao = session.getMapper(IUserDao.class);
			
//			System.out.println(userDao.selectById(1));
			
//			users = userDao.selectAll();
//			System.out.println(users);
			
//			users = userDao.selectByPhone("110");
//			System.out.println(users);
			
//			User user = userDao.selectUserByUsernameAndPassword(u);
			
			User user = userDao.selectUserByUsernameAndPassword2("admin", "admin");
			System.out.println(user);
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			MyBatisUtil.closeSession(session);
		}
	}
}
