package entity;

import java.util.HashSet;
import java.util.Set;

public class Order {

	private Integer id;
	private String no;
	private Set<Item> items = new HashSet<Item>();
	
	public void addItem(Item item){
		items.add(item);
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public Set<Item> getItems() {
		return items;
	}
	public void setItems(Set<Item> items) {
		this.items = items;
	}
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", no=" + no + ", items=" + items + "]";
	}
	
}
