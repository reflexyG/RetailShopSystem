package rss.solution;

import java.util.Scanner;
import java.io.*;

abstract class User {
	private final String username;
	private final String password;
	private String accountType;
	private String email;
	private int phone;
	
	public User(String username, String password, String type){
		this.username = username;
		this.password = password;
		this.setDetails(username, password, type);
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
	
	// set the email and phone for the user
	private void setDetails(String username, String password, String type){
		
		Boolean found = false;
		
		try{
			// declare new Scanner object
			File file = new File("./abx.txt");
			Scanner scanner = new Scanner(file);

			while(scanner.hasNext() && !found){
				// create a temperory array to store the data of user
				// split String in each line with delimiter
				String[] data = scanner.nextLine().split(",");

				if(data[0].trim().equals(username.trim()) && 
				data[1].trim().equals(password.trim()) &&
					data[2].trim().equals(type.trim())){
					
					// set email and phone
					this.email = data[3];
					this.phone = Integer.parseInt(data[4]);
					found = true;
				}
			}
			scanner.close();
		}
		catch(IOException e){
			System.out.println("error");
		}
		
	}
	
	public boolean login(){
		UserDao ud = new UserDao();
		return ud.findUser(this.username, this.password, this.accountType, "login");
	}
}

	

