package Calendar;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Practice {
	public static void main(String[] args) throws InterruptedException {
	  String actualmonthyear="June 2024";
	  String actualday="15";
      WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
      Actions action=new Actions(driver);
      JavascriptExecutor js=(JavascriptExecutor) driver;
      WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(29));
      driver.get("https://www.booking.com/");
      action.pause(3000).perform();
      action.doubleClick().perform();
   
      WebElement clickonsearch = driver.findElement(By.name("ss"));
      wait.until(ExpectedConditions.elementToBeClickable(clickonsearch));
      clickonsearch.click();
      clickonsearch.sendKeys("Ranchi");
      action.pause(4000).perform();
      
      WebElement destinationclick = driver.findElement(By.cssSelector("li#autocomplete-result-0"));
      wait.until(ExpectedConditions.elementToBeClickable(destinationclick));
      destinationclick.click();
      
     int i=1;
   	        while(true) {
   	        	String expectedmonthyour =driver.findElement(By.xpath("//div[@data-testid=\"searchbox-datepicker-calendar\"]/descendant::h3")).getText();
   	              if(actualmonthyear.equals(expectedmonthyour)) {
   	            	  WebElement day = driver.findElement(By.xpath("//span[text()='17']"));
   	            	  js.executeScript("arguments[0].click();", day);
   	            	  break;
   	              }else {
   	            	  if(i==1) {
   	            		WebElement next1=driver.findElement(By.xpath("//div[@data-testid=\"searchbox-datepicker-calendar\"]/button"));
   	            		js.executeScript("arguments[0].click();", next1);
   	            	  }
   	            	List<WebElement> next=driver.findElements(By.xpath("//div[@data-testid=\"searchbox-datepicker-calendar\"]/button"));
   	            	  for(WebElement e:next) {
   	            		  if(i%2==0) {
   	            			  Thread.sleep(3000);
   	            			js.executeScript("arguments[0].click();", e);
   	            			i++;
   	            		  }else {
   	            			i++;
   	            		  }
   	            	  }
   	            	  
   	                   
   	              }
   	        }
	}
 }
