package rss.solution;
import java.util.Scanner;
import java.io.*;


public class UserDao {
	private String path = "./abx.txt";
	private File file = new File(path);
	private PrintWriter pw = null;
	private Scanner scanner;
	
	public UserDao(){
		// create new txt file if the txt file does not exist
		try{
			if(!file.exists()){
				file.createNewFile();
			}
		}
		
		catch(IOException e){
			System.out.println(e);
		}
		
	}
	
	// find the user from the txt file
	public Boolean findUser(String username, String password, String accountType, String purpose){

		// set found user to false
		boolean found = false;
		// declare temporary variables
		String tempUsername;
		String tempPassword;
		String tempAccountType;
		
		try{
			// declare new Scanner object
			scanner = new Scanner(file);
			
			while(scanner.hasNext() && !found){
				// create a temperory array to store the data of user
				// split String in each line with delimiter
				String[] data = scanner.nextLine().split(",");
				
				// temporary store the username, password, accountType in the txt file
				tempUsername = data[0];
				tempPassword = data[1];
				tempAccountType = data[2];
				
				if(tempUsername.trim().equals(username.trim()) && 
					tempAccountType.trim().equals(accountType.trim())){
					// check the purpose for finding user
					if(!purpose.equals("login")){
						found = true;
					}
					// check the password
					else if(tempPassword.trim().equals(password.trim())){
						found = true;
					}
				}
		
			}
		}
		catch(IOException e){
			System.out.println("error");
		}
		return found;
	}
	
	// add new user into the text file
	public Boolean addUser(String username, String password, 
		String type, String email, int phoneNumber){
		
		// handle exception
		try{
			// declare new PrintWriter object with new Filewriter as aruguement and allow append
			pw = new PrintWriter(new FileWriter(file, true));
			// pw = new PrintWriter(file);
			// check if the user is in the txt file
			if(!findUser(username, password, type, "add")){
				// write the user into the txt file
				pw.println(username + "," + password + "," + type + "," + email + "," + phoneNumber);
				pw.close();
				return true;
			}
			else{
				return false;
			}
			
		}
		catch(IOException e){
			System.out.println(e);
			return false;
		}
		
	}
	
	// delete user into the text file
	public void deleteUser(String username, String password, 
		String type, String email, int phoneNumber){
		
	}
	
	// update user account
	public void updateUser(String username, String password, String type){
		
	}
	
}
