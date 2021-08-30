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
		// instantiate the customer object in the OrderDao
		od.setCustomer(this.getUsername(), this.getPassword());
		return od.addOrder(payment, address, price);
	}
	
	public Boolean updateOrder(String orderId, String currentDateTime, String payment, 
		String address, String price, String status ){
		// return the orderid
		OrderDao od = new OrderDao();
		// instantiate the customer object in the OrderDao
		od.setCustomer(this.getUsername(), this.getPassword());
		return od.updateOrder(orderId, this.getUsername(), currentDateTime, payment, address, price, status);
	}
		
}
