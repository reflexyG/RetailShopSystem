package rss.solution;

public class Customer extends User {
	private String payment;
	private String address;
	
	public Customer(String username, String password) {
		super(username, password, "Customer");
		this.setAccountType("Customer");
		
	}
	
}
