package rss.solution;
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class UserDao {
	//txt file path
	private String path = "./abx.txt";
	// File object
	private File file = new File(path);
	private PrintWriter pw;
	private Scanner scanner;
	public Customer c;
	public Admin a;
	
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
					
					// instantiate object for admin or customer
					if(tempAccountType.equals("Customer")){
						c = new Customer(data[0], data[1]);
					}
					else{
						a = new Admin(data[0], data[1]);
					}
					
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
			// discard the scanner
			scanner.close();
			
		}
		catch(IOException e){
			System.out.println("error");
		}
		return found;
	}
	
	// add new user into the text file
	public Boolean addUser(String username, String password, 
		String type, String email, int phoneNumber){
		Boolean added = false;
		// handle exception
		try{
			// declare new PrintWriter object with new Filewriter as aruguement and allow append
			pw = new PrintWriter(new FileWriter(file, true));

			// check if the user is in the txt file
			if(!findUser(username, password, type, "add")){
				// write the user into the txt file
				pw.println(username + "," + password + "," + type + "," + email + "," + phoneNumber);
				pw.close();
				added = true;
			}
			
		}
		catch(IOException e){
			System.out.println(e);
			return added;
		}
		
		return added;
		
	}
	
	// delete user in the text file
	public Boolean deleteUser(String username, String type){
		List<String> newData = new ArrayList<>();
		
		Boolean deleted = false;
		
		try{
			// declare new Scanner object
			scanner = new Scanner(file);
			
			while(scanner.hasNext()){
				
				// store each line of txt file in a String
				String line = scanner.nextLine();
				// split the string with delimiter
				String[] oldData = line.split(",");
				
				// if username and account type is not same
				if(!(oldData[0].trim().equals(username.trim()) && 
					oldData[2].trim().equals(type.trim()))){
					// add the row into the list
					newData.add(line);
				}
				else{
					deleted = true;
				}
	
			}
			// discard the scanner
			scanner.close();

		}
		catch(IOException e){
			System.out.println("Error");
		}
		
		if(deleted){
			// use PrintWriter to overwrite the text file
			try{
				// declare new pw object
				pw = new PrintWriter(path);
				// write the newData into the text file
				for(String str : newData){
					pw.println(str);
				}
				pw.close();

				deleted = true;


			}
			catch(IOException e){
				System.out.println("Error");
				return deleted;
			}
		}
		
		return deleted;
		
	}
	
	// update user account
	public Boolean updateUser(String username, String password, 
		String type, String email, int phoneNumber){
		
		// create a dynamic list to store new data
		List<String> newData = new ArrayList<>();
		Boolean updated = true;
		
		try{
			// declare new Scanner object
			scanner = new Scanner(file);
			
			while(scanner.hasNext()){
				
				// store each line of txt file in a String
				String line = scanner.nextLine();
				// split the string with delimiter
				String[] oldData = line.split(",");
				
				// if username and accounttype is same
				if(oldData[0].trim().equals(username.trim()) && 
					oldData[2].trim().equals(type.trim())){
					
					//store the new data in the list
					newData.add(
					username + "," + 
					password + "," +
					type + "," +
					email + "," +
					phoneNumber);
					
					// set updated to true
					updated = true;
				}
				else{
					// store the same data in the list
					newData.add(line);
				}
				
			}
			// discard the scanner
			scanner.close();

		}
		catch(IOException e){
			System.out.println("Error");
		}
		
		if(updated){
			// use PrintWriter to overwrite the text file
			try{
				// declare new pw object
				pw = new PrintWriter(path);
				// write the newData into the text file
				for(String str : newData){
					pw.println(str);
				}
				pw.close();

			}
			catch(IOException e){
				System.out.println("Error");
				updated = false;
				return updated;
			}
			
		}
		
		return updated;

		
	}
	
}
