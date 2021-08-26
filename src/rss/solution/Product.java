package rss.solution;

public class Product {
	private String id;
	private String name;
	private String description;
	private Boolean fragile;
	private int quantity;
	
	public Product(String id, String name, String description, Boolean fragile, int quantity){
		this.id = id;
		this.name = name;
		this.description = description;
		this.fragile = fragile;
		this.quantity = quantity;
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
}
