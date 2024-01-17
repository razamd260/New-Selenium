package Unknown;

import java.text.SimpleDateFormat;
import java.util.Date;


public class raza7 {
	public static void main(String[] args) {
	
		 Date currentDate = new Date(); 
		 SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		 String currentDateTime = dateFormat. format(currentDate);
		 System.out.println(currentDateTime);
		
//		long currentTimeInMillis = System.currentTimeMillis();
//
//		Date currentDate = new Date(currentTimeInMillis);
//
//		String currentDateTime = currentDate.toString();
//		System.out.println(currentDateTime);
		
	}
}
