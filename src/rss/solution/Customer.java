package rss.solution;

public class Customer extends User {
	private String payment;
	private String address;
	
	public Customer(String username, String password, String email, int phone) {
		super(username, password, "Customer", email, phone);
		this.setAccountType("Customer");
	}
	
}
