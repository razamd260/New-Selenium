package JavaScriptExecutor;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A3 {
    public static void main(String[] args) throws AWTException {
    	System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\Set Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.location=arguments[0];","https://www.google.com" );
		js.executeScript("arguments[0].value='slaman';", driver.findElement(By.id("APjFqb")));
		WebElement click=driver.findElement(By.id("APjFqb"));
		click.click();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		js.executeScript("arguments[0].click();",driver.findElement(By.xpath("//h3[contains(@class,'MBeuO')]")));
		js.executeScript("history.go(0)");
		
		
	}
}
