package rss.solution;

abstract class User {
	private final String username;
	private final String password;
	private String accountType;
	private final String email;
	private final int phone;
	
	public User(String username, String password, String email, int phone){
		this.username = username;
		this.password = password;
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
	
	public String getaccountType(){
		return accountType;
	}
	
	public void login(){
		// declare new userdao object
		UserDao ud = new UserDao();
		// verify the account
		ud.findUser(this.username, this.password, this.accountType, "login");
	}

	
	
	
}
