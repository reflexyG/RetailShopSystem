package rss.solution;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;


public class ProductDao {
	//txt file path
	private String path = "./product.txt";
	// File object
	private File file = new File(path);
	private PrintWriter pw;
	private Scanner scanner;
	public Product p;
	
	// find the product from the txt file
	public Boolean getProduct(String id){

		// set found user to false
		boolean found = false;
		
		try{
			// declare new Scanner object
			scanner = new Scanner(file);
			
			// temporary store product information
			String tempId;
			String tempName;
			String tempDesc;
			Boolean fragile;
			int tempQuantity;
			
			while(scanner.hasNext() && !found){
				// create a temperory array to store the data of user
				// split String in each line with delimiter
				String[] data = scanner.nextLine().split(",");
				
				// store the value
				tempId = data[0];
				tempName = data[1];
				tempDesc = data[2];
				fragile = Boolean.parseBoolean(data[3]);
				tempQuantity = Integer.parseInt(data[4]);
				
				// check the id
				if(data[0].trim().equals(id.trim())){
					p = new Product(tempId, tempName, tempDesc, fragile, tempQuantity);
					found = true;
				
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
	public Boolean addProduct(String name, String description, Boolean fragile, int quantity){
		
		Boolean added = false;
		
		// generate random product id
		// instantiate new Random object
		Random random = new Random();
		// generate id for the product
		int number = random.nextInt(99999);
		// convert the integer into 6 characters format
		String id = "P" + String.format("%05d", number);
		
		
		// handle exception
		try{
			// declare new PrintWriter object with new Filewriter as aruguement and allow append
			pw = new PrintWriter(new FileWriter(file, true));

			// check if the product is in the txt file
			if(!getProduct(id)){
				// write the product into the txt file
				pw.println(id + "," + name + "," + description + "," + fragile + "," + quantity);
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
	public Boolean deleteProduct(String id){
		List<String> newData = new ArrayList<>();
		
		try{
			// declare new Scanner object
			scanner = new Scanner(file);
			
			while(scanner.hasNext()){
				
				// store each line of txt file in a String
				String line = scanner.nextLine();
				// split the string with delimiter
				String[] oldData = line.split(",");
				
				// if product id type is not same
				if(!(oldData[0].trim().equals(id.trim()))){
					// add the row into the list
					newData.add(line);
				}
	
			}
			// discard the scanner
			scanner.close();

		}
		catch(IOException e){
			System.out.println("Error");
		}
		
		// use PrintWriter to overwrite the text file
		try{
			// declare new pw object
			pw = new PrintWriter(path);
			// write the newData into the text file
			for(String str : newData){
				pw.println(str);
			}
			pw.close();
			
			return true;
			
		}
		catch(IOException e){
			System.out.println("Error");
			return false;
		}
		
	}
	
	// update user account
	public Boolean updateProduct(String id, String name, 
		String description, Boolean fragile, int quantity){
		
		// create a dynamic list to store new data
		List<String> newData = new ArrayList<>();
		
		try{
			// declare new Scanner object
			scanner = new Scanner(file);
			
			while(scanner.hasNext()){
				
				// store each line of txt file in a String
				String line = scanner.nextLine();
				// split the string with delimiter
				String[] oldData = line.split(",");
				
				// if product id is same
				if(oldData[0].trim().equals(id.trim())){
					
					//store the new data in the list
					newData.add(
					id + "," + 
					name + "," +
					description + "," +
					fragile + "," +
					quantity);
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
		
		// use PrintWriter to overwrite the text file
		try{
			// declare new pw object
			pw = new PrintWriter(path);
			// write the newData into the text file
			for(String str : newData){
				pw.println(str);
			}
			pw.close();
			
			return true;
			
		}
		catch(IOException e){
			System.out.println("Error");
			return false;
		}
		
	}
	
}

