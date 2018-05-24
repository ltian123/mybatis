package test;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import dao.IUserDao;

import entity.User;

import util.MyBatisUtil;

public class Test05 {

	public static void main(String[] args) {
		SqlSession session = null;
		
		List<User> users = new ArrayList<User>();
//		User u = new User();
//		u.setId(4);
//		u.setUsername("aaa");
//		u.setPassword("itany");
//		u.setPhone("123456");
		
		
		try {
			session = MyBatisUtil.getSession();
			
			IUserDao userDao = session.getMapper(IUserDao.class);
			
//			users = userDao.selectByParams4(u);
//			System.out.println(users);
			
//			userDao.updateById3(u);
			
			List<Integer> ids = new ArrayList<Integer>();
			ids.add(new Integer(1));
			ids.add(new Integer(3));
			ids.add(new Integer(5));
			
			users = userDao.selectByEach(ids);
			System.out.println(users);
			
			
			
			session.commit();
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			MyBatisUtil.closeSession(session);
		}
	}
}
