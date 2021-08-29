package rss.solution;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class OrderDao {
		
	//txt file path
	private String path = "./Order.txt";
	// File object
	private File file = new File(path);
	private PrintWriter pw;
	private Scanner scanner;
	public OrderItem oi;
	
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
	
	
	
}
