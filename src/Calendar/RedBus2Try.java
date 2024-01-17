package Calendar;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBus2Try {
    public static void main(String[] args) throws InterruptedException {
    	WebDriverManager.chromedriver().setup();
		ChromeOptions option=new ChromeOptions();
		StringBuilder result=new StringBuilder();
		option.addArguments("--disable-notifications");
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(50));
		driver.get("https://www.redbus.in/"); 
	
		WebElement clickontext=driver.findElement(By.xpath("//i[contains(@class,\"sc-cSHVUG\")]"));
		wait.until(ExpectedConditions.elementToBeClickable(clickontext));
		clickontext.click();
		 String expectedmonthyear="September 2024";
		    String expectedday="16";
		    int august=7;
		int j=1;
		for(int i=1;i<=august;i++) {
			if(i==1) {
				WebElement next1=driver.findElement(By.xpath("//*[name()='svg'][@id=\"Layer_1\"]"));
				next1.click();
			}
			List<WebElement> next=driver.findElements(By.xpath("//*[name()='svg'][@id=\"Layer_1\"]"));
			for(WebElement e:next) {
				if(j%2==0) {
					Thread.sleep(2000);
					e.click();
					j++;
				}else {
					j++;
				}
			}
	  }
			

    	WebElement day=driver.findElement(By.xpath("//span[text()='"+expectedday+"']"));
		wait.until(ExpectedConditions.elementToBeClickable(day));
		day.click();
//		String year=driver.findElement(By.xpath("//h3[contains(@class,\"e1\")]")).getText();
//	    if(expectedmonthyear.equals(year)) {
//	    	WebElement day=driver.findElement(By.xpath("//span[text()='"+expectedday+"']"));
//			wait.until(ExpectedConditions.elementToBeClickable(day));
//			js.executeScript("arguments[0].click();", day);
//	    }
     
	
	   

    }
}
