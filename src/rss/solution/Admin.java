package rss.solution;

public class Admin extends User{
	UserDao ud = new UserDao();

	public Admin(String username, String password, String email, int phone) {
	super(username, password,"Admin", email, phone);
	this.setAccountType("Admin");
	}
	
	public Boolean addAdmin(String username, String password, String email, int phone){
		return ud.addUser(username, password, "Admin", email, phone);
		
	}
	
	public Boolean deleteUser(String username, String type){
		return ud.deleteUser(username, type);
	}
	

}
