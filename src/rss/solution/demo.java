package rss.solution;
import java.util.Scanner;
import java.io.*;

public class demo {
	public static void main(String[] args){
		Customer c = new Customer("user", "123", "@gmail.com", 12346123);
		System.out.println(c.getUsername() +c.getEmail() + c.getPassword() + c.getPhone() + c.getaccountType());	

		c.login();
		UserDao ud = new UserDao();
		ud.addUser("user1", "fsk", "Customer", "@gmail.com", 12346123);	
		ud.updateUser("user1", "1234", "Customer", "fuckyou@gmail.com", 5431234);
		
	}
	
}
