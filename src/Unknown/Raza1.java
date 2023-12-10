package Unknown;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Raza1 {
	public static void main(String[] args) throws InterruptedException {
	  	System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\Set Chrome\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.flipkart.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='✕']")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("q")).sendKeys("iphone", Keys.ENTER);
			Thread.sleep(2000);
			List<WebElement> price = driver.findElements(By.xpath("//div[@class=\"_30jeq3 _1_WHN1\"]"));//_4rR01T
			List<WebElement> name = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
	        for(WebElement e:price) {
	        	 StringBuilder numbers = new StringBuilder();
	        	 for (char c : e.getText().toCharArray()) {
		 	            if (Character.isDigit(c)) {
		 	                numbers.append(c);
		 	            }
		 	    }
		 	       long i=Long.parseLong(numbers.toString());
		 	       if(i>=60000) {
		 	    	   System.out.println(i);
		 	       }
	        }
	    }
	}
	         
	

