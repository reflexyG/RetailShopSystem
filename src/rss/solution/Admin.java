package rss.solution;

public class Admin extends User{
	UserDao ud = new UserDao();
	ProductDao pd = new ProductDao();

	public Admin(String username, String password) {
	super(username, password, "Admin");
	this.setAccountType("Admin");
	}
	
	// add new admin account
	public Boolean addAdmin(String username, String password, String email, int phone){
		return ud.addUser(username, password, "Admin", email, phone);
		
	}
	
	// update Customer account
	public Boolean updateCustomer(String username, String password,
		String email, int phoneNumber){
		return ud.updateUser(username, password, "Customer", email, phoneNumber);
	}
	
	// delete customer account
	public Boolean deleteUser(String username, String type){
		return ud.deleteUser(username, type);
	}
	
	// add new product
	public Boolean addProduct(String name, String description, 
		Boolean fragile, int quantity, double price){
		return pd.addProduct(name, description, fragile, quantity, price);
	}
	
	// update product details
	public Boolean updateProduct(String id, String name, 
		String description, Boolean fragile, int quantity, double price){
		return pd.updateProduct(id, name, description, fragile, quantity, price);
	}
	
	// delete product
	public Boolean deleteProduct(String id){
		return pd.deleteProduct(id);
	}

}
