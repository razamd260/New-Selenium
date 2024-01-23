package Calendar;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MakemyTrip1 {
	  
 
      public static void main(String[] args) throws InterruptedException, IOException {
    	  FileInputStream fis=new FileInputStream("G:\\Selenium\\src\\Calendar\\myntra.properties");
    	  Properties property=new Properties();
    	  property.load(fis);
    	  String expectedmonthyear=property.getProperty("expectedmonthyear");
    	  String expectedday=property.getProperty("expectedday");
    	  System.out.println(expectedday+" : "+expectedmonthyear);
    	  WebDriver driver=new ChromeDriver();
    	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
    	     driver.get("https://www.makemytrip.com/");
    	     JavascriptExecutor js=(JavascriptExecutor) driver;
    	     driver.manage().window().maximize();
    	     Actions action=new Actions(driver);
    	     Thread.sleep(8000);
    	     action.doubleClick().perform();
    	     WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(50));
    	     
    	     WebElement return1=driver.findElement(By.xpath("//span[text()='Return']"));
    	     wait.until(ExpectedConditions.elementToBeClickable(return1));
    	     return1.click();
    	    
    	     
    	     WebElement nextclick=driver.findElement(By.xpath("//span[@aria-label=\"Next Month\"]"));
    	     while(true) {
    	    	 WebElement actualmonthyear=driver.findElement(By.xpath("//div[@class=\"DayPicker-Caption\"]"));
    	    	 if(expectedmonthyear.equals(actualmonthyear.getText())) {
    	    		    WebElement actualday=driver.findElement(By.xpath("//p[text()='"+expectedday+"']"));
    	    	    	wait.until(ExpectedConditions.elementToBeClickable(actualday));
    	    	    	actualday.click();
	    	        	 break;
    	    	 }else {
    	    		 action.pause(2000).perform();
    	    		 nextclick.click();
    	    		 
    	    		}
    	        
    	     }
    	    
    	    
      
      
      
      
      }
   
}
