package rss.solution;

public class Product {
	private String id;
	private String name;
	private String description;
	private Boolean fragile;
	private int quantity;
	private double price;
	
	public Product(String id, String name, String description, Boolean fragile, int quantity, double price){
		this.id = id;
		this.name = name;
		this.description = description;
		this.fragile = fragile;
		this.quantity = quantity;
		this.price = price;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public Boolean getFragile() {
		return fragile;
	}
	
	public int getQuantity() {
		return quantity;
	}

	public double getPrice() {
		return price;
	}
	
}
