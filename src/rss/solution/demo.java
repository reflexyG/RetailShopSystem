package rss.solution;
import java.util.Scanner;
import java.io.*;

public class demo {
	public static void main(String[] args){
		Customer c = new Customer("user1", "1234");
		System.out.println(c.getEmail() + c.getPhone());
		

		UserDao ud = new UserDao();
		ud.addUser("user2", "fs2k", "Admin", "@gmail.com", 12346123);
		ud.addUser("user1", "fs2k", "Customer", "@gmail.com", 12346123);
		ud.addUser("user13", "f123", "Admin", "@gmail.com", 12346123);
		ud.updateUser("user2", "1234", "Admin", "fk11you@gmail.com", 5431234);
		//ud.deleteUser("user13", "Admin");
		
		ProductDao pd = new ProductDao();
		//pd.addProduct("toysss", "atoys", false, 0, 20);
		//pd.addProduct("pizza", "adult pizza", false, 20);
		//System.out.println(pd.getProduct("P13283"));
		//System.out.println(pd.deleteProduct("P26414"));
		//pd.addProduct("burger", "xxx", false, 20, 2.30);
		//System.out.println(pd.updateProduct("P1123483", "pizza", "cheese", true, 30, 30.00));
		//System.out.println(pd.p.getId()+ pd.p.getName() + pd.p.getDescription() + pd.p.getQuantity());
		
		//ud.addUser("anvegave", "1234567","Admin","email", 123445);
		
		Object[] lines = pd.getProductList();
		
		for(int i = 0; i < lines.length; i++){
                String[] row = lines[i].toString().split(",");
            }
	}
	
}
