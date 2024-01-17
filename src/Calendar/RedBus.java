package Calendar;

import java.time.Duration;

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

public class RedBus {
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
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement clickontext=driver.findElement(By.xpath("//i[contains(@class,\"sc-cSHVUG\")]"));
		wait.until(ExpectedConditions.elementToBeClickable(clickontext));
		clickontext.click();
     
	
	   

    }
}
