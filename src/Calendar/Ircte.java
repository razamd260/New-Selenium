package Calendar;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ircte {
    public static void main(String[] args) {
    	//WebDriverManager.chromedriver().setup();
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(50));
		driver.get("https://www.irctc.co.in/nget/train-search");
	    String expectedmonthyear="April2024";
	    String expectedday="24";
	    driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement clickontext=driver.findElement(By.xpath("//p-calendar[@formcontrolname=\"journeyDate\"]"));
		wait.until(ExpectedConditions.elementToBeClickable(clickontext));
		clickontext.click();

		for(int i=1;i<=4;i++) {
			WebElement datpick=driver.findElement(By.xpath("//div[@class=\"ui-datepicker-title ng-tns-c58-10\"]"));
			wait.until(ExpectedConditions.visibilityOf(datpick));
			if(datpick.getText().equals(expectedmonthyear)) {
				WebElement day=driver.findElement(By.xpath("//a[@class=\"ui-state-default ng-tns-c58-10 ng-star-inserted\" and text()='"+expectedday+"']"));
				wait.until(ExpectedConditions.elementToBeClickable(day));
				day.click();
				break;
			}else {
				WebElement next=driver.findElement(By.xpath("//a[@class=\"ui-datepicker-next ui-corner-all ng-tns-c58-10 ng-star-inserted\"]"));
				wait.until(ExpectedConditions.visibilityOf(next));
				try {
					js.executeScript("arguments[0].click();", next);

				}catch(Exception e1) {
					e1.printStackTrace();
				}
			}
			
		}
		
		
		
	}
}
