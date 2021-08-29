package rss.solution;

public class Customer extends User {
	private String payment;
	private String address;
	
	public Customer(String username, String password) {
		super(username, password, "Customer");
		this.setAccountType("Customer");
		
	}
	
	public Boolean updateAccount(String password, String email, int phone){
		UserDao ud = new UserDao();
		return ud.updateUser(this.getUsername(), password, this.getaccountType(), email, phone);
	}
	
}
