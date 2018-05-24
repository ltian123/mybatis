package dao;

import entity.Order;

public interface IOrderDao {

	public void insertOrder(Order order);
	
	public Order selectById(Integer id);
	public Order selectById2(Integer id);
}
