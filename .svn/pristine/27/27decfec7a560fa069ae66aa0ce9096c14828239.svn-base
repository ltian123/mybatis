package util;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUtil {

	private static SqlSessionFactory factory;
	
	
	static{
		try {
			factory = new SqlSessionFactoryBuilder().build(MyBatisUtil
													.class
													.getClassLoader()
													.getResourceAsStream("mybatis-config.xml"));
		} catch (Exception e) {
			e.printStackTrace();
			//静态代码块中出现异常抛出
			throw new ExceptionInInitializerError("mybatis初始化异常");
		}
	}
	
	public static SqlSession getSession(){
		SqlSession session = null;
		try {
			session = factory.openSession();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return session;
	}
	
	public static void closeSession(SqlSession session){
		if(session!=null){
			session.close();
		}
	}
	
	
}
