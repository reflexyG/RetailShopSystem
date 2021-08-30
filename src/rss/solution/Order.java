package rss.solution;
import java.util.ArrayList;
import java.util.List;

public class Order {
	
	private String id, payment, address, status;
	private Customer c;
	private String orderTime;
	private List<OrderItem> orderItems = new ArrayList<>();

	public Order(String id, Customer c, String orderTime, String payment, String address, String status) {
		this.id = id;
		this.c = c;
		this.orderTime = orderTime;
		this.payment = payment;
		this.address = address;
		this.status = status;
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

	public String getAddress() {
		return address;
	}

	public String getPayment() {
		return payment;
	}

	public String getStatus() {
		return status;
	}
	
}
