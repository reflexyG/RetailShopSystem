package rss.solution;

public class Admin extends User{

	public Admin(String username, String password, String email, int phone) {
	super(username, password, email, phone);
	this.setAccountType("Admin");
	}
	
	public Boolean addAdmin(String username, String password, String email, int phone){
		UserDao ud = new UserDao();
		ud.addUser(username, password, "Admin", email, phone);
		return true;
	}
	

}
