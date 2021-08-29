package rss.solution;
import java.util.ArrayList;
import java.util.List;

public class Order {
	
	private String id;
	private Customer c;
	private String orderTime;
	private List<OrderItem> orderItems = new ArrayList<>();
	private Address address;

	public Order(String id, Customer c, Address address) {
		this.id = id;
		this.c = c;
		this.address = address;
		setOrderItem();
	}
	
	private void setOrderItem(){
		OrderItemDao oid = new OrderItemDao();
		orderItems = oid.getOrderItemList(this.id);
	}

	public String getId() {
		return id;
	}

	public Customer getC() {
		return c;
	}

	public String getOrderTime() {
		return orderTime;
	}

	public List<OrderItem> getOrderItems() {
		return orderItems;
	}

	public Address getAddress() {
		return address;
	}
	
	
	
	
	
}
