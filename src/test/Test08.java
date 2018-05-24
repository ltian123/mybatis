package test;

import org.apache.ibatis.session.SqlSession;

import dao.IItemDao;
import dao.IOrderDao;

import util.MyBatisUtil;
import entity.Item;
import entity.Order;

public class Test08 {

	public static void main(String[] args) {
		SqlSession session = null;
//		Order order = new Order();
//		order.setNo("dianzichanpin1231231");
//		
//		Item item1 = new Item();
//		item1.setName("电脑");
//		item1.setNum(10);
//		
//		Item item2 = new Item();
//		item2.setName("电视");
//		item2.setNum(50);
//		
//		Item item3 = new Item();
//		item3.setName("冰箱");
//		item3.setNum(30);
//		
//		
//		//维护多方的关系
//		item1.setOrder(order);
//		item2.setOrder(order);
//		item3.setOrder(order);
//		
//		//维护一方的关系
//		order.addItem(item1);
//		order.addItem(item2);
//		order.addItem(item3);
		
		
		try {
			session = MyBatisUtil.getSession();
			
			IOrderDao orderDao = session.getMapper(IOrderDao.class);
//			orderDao.insertOrder(order);
			
			IItemDao itemDao = session.getMapper(IItemDao.class);
//			itemDao.insertItem(item1);
//			itemDao.insertItem(item2);
//			itemDao.insertItem(item3);
//			
			Order order = orderDao.selectById2(2);
			System.out.println(order);
			
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
		} finally{
			MyBatisUtil.closeSession(session);
		}
	}
}
