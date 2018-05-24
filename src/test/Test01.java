package test;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import dao.IUserDao;

import entity.User;

public class Test01 {

	public static void main(String[] args) {
		//SqlSessionFactoryBuilder用来读取配置文件,并获取SqlSessionFactory
		SqlSessionFactoryBuilder build = new SqlSessionFactoryBuilder();
		
		//获得SqlSessionFactory用来创建SqlSession工程
		SqlSessionFactory factory = build.build(Test01.class.getClassLoader().getResourceAsStream("mybatis-config.xml"));
		
		//会话,持久化管理器,线程不安全
		SqlSession session = factory.openSession();
		
		
		//method表示找到对应的mapper中的方法,也就是id，param表示方法中的参数值
//		session.selectOne(method, param)
		
		//方法一:根据mapper文件中的namespace找到对应的mapper中的方法
//		User user = session.selectOne("dao.IUserDao.selectById", 132);
//		System.out.println(user);
		
		//方法二:直接通过userDao查找对应的方法
		IUserDao userDao = session.getMapper(IUserDao.class);
		//userDao是一个动态代理对象
		System.out.println(userDao);
		
//		User user = userDao.selectById(1);
//		System.out.println(user);
//		
//		User user = userDao.selectById2(1);
//		System.out.println(user);
		
		User user = userDao.selectById3(1);
		System.out.println(user);
		
		
		session.close();
		
		
		
		
		
		
		
	}
}
