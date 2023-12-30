package Window;

import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class A2 {
 
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--headless");
		WebDriver d=new ChromeDriver(options);
		ChromeDriver driver=(ChromeDriver)d;
		driver.get("https://www.google.com");
	    System.out.println(driver.getCurrentUrl());
	    String google=driver.getWindowHandle();
	    Thread.sleep(3000);
	    driver.switchTo().newWindow(WindowType.TAB);
	    driver.get("https://www.facebook.com");
	    System.out.println(driver.getCurrentUrl());
	    String facebook=driver.getWindowHandle();
	    Thread.sleep(3000);
	    driver.switchTo().newWindow(WindowType.WINDOW);
	    driver.get("https://www.amazon.in");
	    System.out.println(driver.getCurrentUrl());
	    Thread.sleep(3000);
	    driver.switchTo().window(google);
	    System.out.println(driver.getCurrentUrl());
	    Thread.sleep(2000);
	    driver.switchTo().window(facebook);
	    System.out.println(driver.getCurrentUrl());
	
		
	
		
		
		
		
	}

}
