package Window;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Traverse1_10thwindow {
     public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String parentID=driver.getWindowHandle();
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.facebook.com");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.amazon.com");
		driver.switchTo().window(parentID);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.flipkart.com");
		String firstwindo=driver.getWindowHandle();
		driver.switchTo().newWindow(WindowType.TAB);
		driver.switchTo().newWindow(WindowType.TAB);
		Thread.sleep(3000);
		Set<String> s=driver.getWindowHandles();
		ArrayList<String> tabs = new ArrayList<String>(s);
		System.out.println("No. of tabs: " + tabs.size());
		driver.switchTo().window(firstwindo);
		
//		int size=tabs.size();
//		int upto=size-3;
//		int i=1;
//		            for(String str:s) {
//			          if(i<=upto) {
//				         driver.switchTo().window(str);
//				            i++;
//			            }
//		           }
	}
}
