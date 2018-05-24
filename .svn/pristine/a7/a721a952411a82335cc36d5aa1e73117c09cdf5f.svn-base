package test;

import org.apache.ibatis.session.SqlSession;

import dao.IUserDao;
import entity.User;

import util.MyBatisUtil;

public class Test04 {

	public static void main(String[] args) {
		SqlSession session = null;
		User user = new User();
		user.setUsername("zhangsan");
		user.setPassword("zhangsan");
		user.setPhone("321123");
		
		try {
			session = MyBatisUtil.getSession();
			
			IUserDao userDao = session.getMapper(IUserDao.class);
			
//			System.out.println(userDao.selectById2(1));
			
			userDao.insertUser2(user);
			session.commit();
			System.out.println(user.getId());
			
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			MyBatisUtil.closeSession(session);
		}
	}
}
