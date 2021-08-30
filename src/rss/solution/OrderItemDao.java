package rss.solution;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class OrderItemDao {
	
	//txt file path
	private String path = "./OrderItem.txt";
	// File object
	private File file = new File(path);
	private PrintWriter pw;
	private Scanner scanner;
	public OrderItem oi;
	
	public OrderItemDao(){
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
	
	// get all order item from the txt file
	public List<OrderItem> getOrderItemList(String orderId){
		// declare a dynamic list
		List<OrderItem> orderItems = new ArrayList<>();
		
		try{
			// declare new Scanner object
			scanner = new Scanner(file);
			
			// declare temporary variables
			String tempOrderId, tempProductId, tempName;
			int tempQuantity;
			double tempPrice;
			Boolean tempFragile;
			
			while(scanner.hasNext()){
				// create a temperory array to store the data of orderItem
				// split String in each line with delimiter
				String[] data = scanner.nextLine().split(";");
				
				// assign values into the temporary variables
				tempOrderId = data[0];
				tempProductId = data[1];
				tempName = data[2];
				tempFragile = Boolean.parseBoolean(data[3]);
				tempQuantity = Integer.parseInt(data[4]);
				tempPrice = Double.parseDouble(data[5]);
				
				// if the orderId in the text file is same
				if(tempOrderId.trim().equals(orderId.trim())){
					oi = new OrderItem(tempOrderId, tempProductId, tempName, tempFragile, tempQuantity, tempPrice);
					orderItems.add(oi);

				}
			}
			// discard the scanner
			scanner.close();
			
		}
		catch(IOException e){
			System.out.println("error");
		}
		// return the order item list
		return orderItems;

	}
	
	// add new orderItem into the text file
	public Boolean addOrderItem(String orderId, String productId, String name, Boolean fragile,
		int quantity, double price){
		Boolean added = false;
		// handle exception
		try{
			// declare new PrintWriter object with new Filewriter as aruguement and allow append
			pw = new PrintWriter(new FileWriter(file, true));
			
			// write into the txt 
			pw.println(orderId + ";" + productId + ";" + name + ";" + fragile + ";" + quantity + ";" + price);
			pw.close();
			added = true;

		}
		catch(IOException e){
			System.out.println(e);
			return added;
		}
		
		return added;
		
	}
	
	// delete user in the text file
	public Boolean deleteOrderItem(String productId){
		List<String> newData = new ArrayList<>();
		Boolean deleted = false;
		try{
			// declare new Scanner object
			scanner = new Scanner(file);
			
			while(scanner.hasNext()){
				
				// store each line of txt file in a String
				String line = scanner.nextLine();
				// split the string with delimiter
				String[] oldData = line.split(";");
				
				// if product id type is not same
				if(!(oldData[0].trim().equals(productId.trim()))){
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

			}
			catch(IOException e){
				System.out.println("Error");
				return deleted;
			}
		}
		
		return deleted;
			
	}
	
}
