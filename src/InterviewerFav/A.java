package InterviewerFav;

import java.time.Duration;
import java.util.List;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		driver.get("https://www.makemytrip.com/");
		String expectedYear="2024";
		 int expectedDay=4;
		String expectedMonth="February";
		String expectedmonthyear="February2024";
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		Thread.sleep(5000);
		action.doubleClick().perform();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
       
		 WebElement return1=driver.findElement(By.xpath("//span[text()='Return']"));
	     wait.until(ExpectedConditions.elementToBeClickable(return1));
	     return1.click();
	     int i=1;
	     while(true) {
	    	 List<WebElement> monthyearlist=driver.findElements(By.xpath("//div[@class=\"DayPicker-Caption\"]"));
	    	   for(WebElement e:monthyearlist) {
	    		   String actualmonthyear=e.getText();
	    		   if(expectedmonthyear.equals(actualmonthyear)) {
	    			   List<WebElement> datelist=driver.findElements(By.xpath("//div[@class=\"dateInnerCell\"]"));
	    			   for(WebElement e1:datelist) {
	    				   if(i>0) {
	    					   System.out.println(i);
	    					   i++;
	    					    break;
	    					    
	    				   }
	    				   
	    			   }
	    		   break;
	    		   }
	    	   }
	     }
	}
}
