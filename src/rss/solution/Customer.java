package rss.solution;

public class Customer extends User {
	OrderDao od = new OrderDao();
	
	public Customer(String username, String password) {
		super(username, password, "Customer");
		this.setAccountType("Customer");
		// instantiate the customer object in the OrderDao
		od.setCustomer(this.getUsername(), this.getPassword());
	}
	
	public Boolean updateAccount(String password, String email, int phone){
		UserDao ud = new UserDao();
		return ud.updateUser(this.getUsername(), password, this.getaccountType(), email, phone);
	}
	
	public String placeOrder(String payment, String address, double price){
		// return the orderid
		return od.addOrder(payment, address, price);
	}
	
	public Boolean updateOrder(String orderId, String currentDateTime, String payment, 
		String address, String price, String status ){
		return od.updateOrder(orderId, this.getUsername(), currentDateTime, payment, address, price, status);
	}
		
}
