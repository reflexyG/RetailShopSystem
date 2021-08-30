package rss.solution;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class demo {
	
	public static void main(String[] args) {
		LocalDateTime time = LocalDateTime.now();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String formatDateTime = time.format(formatter);
		
		System.out.println(formatDateTime);
		
		
		//OrderItemDao oid = new OrderItemDao();
		//OrderDao od = new OrderDao();
		//od.setCustomer("1234", "1234");
		Customer c = new Customer("1234", "1234");
		c.login();
		//System.out.println(c.placeOrder("4556", "512town", 1234));
		
		
			
		//oid.addOrderItem("12345", "12345", "toys", true, 1, 0, 0);
		//oid.addOrderItem("12345", "123115", "pizza", true, 1, 0, 0);
		//oid.addOrderItem("12346", "123115", "tools", true, 1, 0, 0);
		//oid.addOrderItem("12345", "123115", "toys", true, 1, 0, 0);
		//oid.addOrderItem("1234", "123115", "toys", true, 1, 0, 0);
		
		
		
		
	}
	
}
