package rss.solution;

public class User {
	private String username;
	private String password;
	private String accountType;
	private String email;
	private int phone;
	
	public User(String username, String password, String accountType){
		this.username = username;
		this.password = password;
		this.accountType = accountType;

	}
	
	public User(String username, String password, String accountType, String email, int phone){
		this.username = username;
		this.password = password;
		this.accountType = accountType;
		this.email = email;
		this.phone = phone;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getEmail() {
		return email;
	}

	public int getPhone() {
		return phone;
	}
	
	public void setAccountType(String type) {
		this.accountType = type;
	}
	
	public String getaccountType(String type){
		this.accountType = type;
		return accountType;
	}
	
	public void login(){
		// declare new userdao object
		UserDao ud = new UserDao();
		// verify the account
		ud.findUser(this.username, this.password, this.accountType, "login");
	}

	
	
	
}
