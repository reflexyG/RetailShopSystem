package rss.solution;

public class Customer extends User {
	
	public Customer(String username, String password) {
		super(username, password, "Customer");
		this.setAccountType("Customer");
		
	}
	
	public Boolean updateAccount(String password, String email, int phone){
		UserDao ud = new UserDao();
		return ud.updateUser(this.getUsername(), password, this.getaccountType(), email, phone);
	}
	
	public String placeOrder(String payment, String address, double price){
		OrderDao od = new OrderDao();
		od.setCustomer(this.getUsername(), this.getPassword());
		return od.addOrder(payment, address, price);
	}
		
}
