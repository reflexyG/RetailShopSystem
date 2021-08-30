package rss.solution;


public class OrderItem {

	private String orderId, productId, name;
	boolean fragile;
	private int quantity;
	private double price;
	
	public OrderItem(String orderId, String productId, String name, boolean fragile, int quantity, double price) {
		this.orderId = orderId;
		this.productId = productId;
		this.name = name;
		this.fragile = fragile;
		this.quantity = quantity;
		this.price = price;
	}

	public String getOrderId() {
		return orderId;
	}

	public String getProductId() {
		return productId;
	}

	public String getName() {
		return name;
	}

	public boolean isFragile() {
		return fragile;
	}

	public int getQuantity() {
		return quantity;
	}

	public double getPrice() {
		return price;
	}

}
