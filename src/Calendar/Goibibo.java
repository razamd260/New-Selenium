package Calendar;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Goibibo {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(50));
		driver.get("https://www.goibibo.com/");
	    String expectedmonthyear="August 2024";
	    String expectedday="24";
	    int august=7;
	    driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement clickontext=driver.findElement(By.xpath("//span[contains(@class,\"icClose\")]"));
		wait.until(ExpectedConditions.elementToBeClickable(clickontext));
		js.executeScript("arguments[0].click();", clickontext);
		
		WebElement departure=driver.findElement(By.xpath("//span[text()='Departure']"));
		wait.until(ExpectedConditions.elementToBeClickable(departure));
		js.executeScript("arguments[0].click();", departure);
			for(int i=1;i<=august;i++) {
				WebElement next=driver.findElement(By.xpath("//span[@aria-label=\"Next Month\"]"));
				wait.until(ExpectedConditions.elementToBeClickable(next));
				Thread.sleep(2000);
				js.executeScript("arguments[0].click();", next);
			}
			
		 List<WebElement> list=driver.findElements(By.xpath("//div[@class=\"DayPicker-Caption\"]"));
		for(WebElement e:list) {
			if(e.getText().equals(expectedmonthyear)) {
				WebElement day=driver.findElement(By.xpath("//p[text()='"+expectedday+"']"));
				wait.until(ExpectedConditions.elementToBeClickable(day));
				js.executeScript("arguments[0].click();", day);
				driver.findElement(By.xpath("//span[text()='Done']")).click();
				break;
			}
	
		
			}
	}
}
