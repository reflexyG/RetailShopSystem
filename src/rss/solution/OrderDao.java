package rss.solution;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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

		// set found user to false
		boolean found = false;
		
		try{
			// declare new Scanner object
			scanner = new Scanner(file);
			
			// temporary store product information
			String tempId, tempDateTime, tempPayment, tempAddress, tempStatus;
			
			while(scanner.hasNext() && !found){
				// create a temperory array to store the data of user
				// split String in each line with delimiter
				String[] data = scanner.nextLine().split(";");
				
				// store the value
				tempId = data[0];
				tempDateTime = data[2];
				tempPayment = data[3];
				tempAddress = data[4];
				tempStatus = data[5];
				
				
				// check the id
				if(data[0].trim().equals(orderId.trim())){
					o = new Order(tempId, c,tempDateTime, tempPayment, tempAddress, tempStatus);
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
	
	// get all user details from the txt file
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
	
	public Boolean addOrder(String payment, String address){
		
		Boolean added = false;
		
		// handle exception
		try{
			// declare new PrintWriter object with new Filewriter as aruguement and allow append
			pw = new PrintWriter(new FileWriter(file, true));
			
			String a = address;
			
			// get current time
			LocalDateTime now = LocalDateTime.now();
			
			// format the date time and convert it to String
			DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
			String currentDateTime = now.format(df);
			
			
			while(!added){
				// generate random product id
				// instantiate new Random object
				Random random = new Random();
				// generate id for the product
				int number = random.nextInt(99999);
				// convert the integer into 6 characters format
				String id = "O" + String.format("%05d", number);
				
				// check if the product id is in the txt file
				if(!getOrder(id)){
					// write the product into the txt file
					pw.println(id + ";" + c.getUsername() + ";" + currentDateTime + ";" + payment + ";" + address + ";" + "To Ship");
					pw.close();
					added = true;
				}
			}
			
		}
		catch(IOException e){
			System.out.println(e);
			return added;
		}
		
		return added;
		
	}
	
	
	
}
