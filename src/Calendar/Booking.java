package Calendar;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Booking {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(50));
		driver.get("https://www.booking.com/");
	    String expectedmonthyear="September 2024";
	    String expectedday="16";
	    int august=7;
	    Actions action=new Actions(driver);
	    driver.manage().window().maximize();
	    action.pause(5000);
	    action.doubleClick().perform();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement start=driver.findElement(By.xpath("//button[@data-testid=\"date-display-field-start\"]"));
		wait.until(ExpectedConditions.elementToBeClickable(start));
		js.executeScript("arguments[0].click();", start);
		
//		WebElement departure=driver.findElement(By.xpath("//span[text()='Departure']"));
//		wait.until(ExpectedConditions.elementToBeClickable(departure));
//		js.executeScript("arguments[0].click();", departure);
		int j=1;
			for(int i=1;i<=august;i++) {
				if(i==1) {
					WebElement next1=driver.findElement(By.xpath("//div[@id=\"calendar-searchboxdatepicker\"]/div/div/button"));
					js.executeScript("arguments[0].click();", next1);
				}
				List<WebElement> next=driver.findElements(By.xpath("//div[@id=\"calendar-searchboxdatepicker\"]/div/div/button"));
				for(WebElement e:next) {
					if(j%2==0) {
						Thread.sleep(2000);
						js.executeScript("arguments[0].click();", e);
						j++;
					}else {
						j++;
					}
				}
		  }
				
			
			String year=driver.findElement(By.xpath("//h3[contains(@class,\"e1\")]")).getText();
		    if(expectedmonthyear.equals(year)) {
		    	WebElement day=driver.findElement(By.xpath("//span[text()='"+expectedday+"']"));
				wait.until(ExpectedConditions.elementToBeClickable(day));
				js.executeScript("arguments[0].click();", day);
		    }
	}
}
//