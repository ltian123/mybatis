package test;

import org.apache.ibatis.session.SqlSession;

import dao.IUserDao;

import entity.User;

import util.MyBatisUtil;

public class Test03 {

	public static void main(String[] args) {
		SqlSession session = null;
		
		User user = new User();
		user.setUsername("π‹¿Ì‘±");
		user.setPassword("admin123");
		user.setPhone("123456789");
		user.setId(9);
		
		try {
			session = MyBatisUtil.getSession();
			
			IUserDao userDao = session.getMapper(IUserDao.class);
			
//			userDao.insertUser2(user);
//			userDao.updateById(user);
			
			userDao.deleteById(9);
			
			session.commit();
			
//			System.out.println(user.getId());
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
		} finally{
			MyBatisUtil.closeSession(session);
		}
	}
}
