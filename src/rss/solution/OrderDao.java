package rss.solution;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class OrderDao {
		
	//txt file path
	private String path = "./Order.txt";
	// File object
	private File file = new File(path);
	private PrintWriter pw;
	private Scanner scanner;
	public Order o;
	private Customer c;
	
	public OrderDao(){
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
	
	// set the customer object for this Dao
	public void setCustomer(String username, String password){
		// instantiate a customer class in this Dao
		c = new Customer(username, password);
	}
	
	// find the order from the txt file based on id
	public Boolean getOrder(String orderId){

		// set found order to false
		boolean found = false;
		
		try{
			// declare new Scanner object
			scanner = new Scanner(file);
			
			// temporary store order information
			String tempId, tempDateTime, tempPayment, tempAddress, tempStatus, tempPrice;
			
			while(scanner.hasNext() && !found){
				// create a temperory array to store the data of order
				// split String in each line with delimiter
				String[] data = scanner.nextLine().split(";");
				
				// store the value
				tempId = data[0];
				tempDateTime = data[2];
				tempPayment = data[3];
				tempAddress = data[4];
				tempPrice = data[5];
				tempStatus = data[6];
				
				
				// check the id
				if(data[0].trim().equals(orderId.trim())){
					o = new Order(tempId, c,tempDateTime, tempPayment, tempAddress, Double.parseDouble(tempPrice), tempStatus);
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
	
	// get all order details from the txt file
	public Object[] getOrderList(){
		Object[] lines = null;
		
		try{
			FileReader fr = new FileReader(file);
			BufferedReader bf = new BufferedReader(fr);
			lines = bf.lines().toArray();
			return lines;
		}
		
		catch(IOException e){
			return lines;
		}

	}
	
	public String addOrder(String payment, String address, double price){
		
		Boolean added = false;
		String id = "";
		
		// handle exception
		try{
			// declare new PrintWriter object with new Filewriter as aruguement and allow append
			pw = new PrintWriter(new FileWriter(file, true));
			
			String a = address;
			
			// get current time
			LocalDateTime now = LocalDateTime.now();
			
			// format the date time and convert it to String
			DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			String currentDateTime = now.format(df);
			
			
			while(!added){
				// generate random order id
				// instantiate new Random object
				Random random = new Random();
				// generate id for the order
				int number = random.nextInt(99999);
				// convert the integer into 6 characters format
				id = "O" + String.format("%05d", number);
				
				// check if the order id is in the txt file
				if(!getOrder(id)){
					// write the order into the txt file
					pw.println(id + ";" + c.getUsername() + ";" + currentDateTime + ";" + payment + ";" + address + ";" + price + ";" + "To Ship");
					pw.close();
					added = true;
				}
			}
			
		}
		catch(IOException e){
			System.out.println(e);
			return id;
		}
		
		return id;
		
	}
	
	// update order details
	public Boolean updateOrder(String orderId, String customerId, 
		String currentDateTime, String payment, String address, double price, String status){
		
		// create a dynamic list to store new data
		List<String> newData = new ArrayList<>();
		
		Boolean updated = false;
		
		try{
			// declare new Scanner object
			scanner = new Scanner(file);
			
			while(scanner.hasNext()){
				
				// store each line of txt file in a String
				String line = scanner.nextLine();
				// split the string with delimiter
				String[] oldData = line.split(";");
				
				// if order id is same
				if(oldData[0].trim().equals(orderId.trim())){
					
					//store the new data in the list
					newData.add(
					orderId + ";" + 
					currentDateTime + ";" +
					payment + ";" +
					address + ";" +
					price + ";" +
					status);
					
					// set update to true
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
