package Iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A4 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\Set Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		WebElement target=driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", target);
		target.click();
		WebElement frame=driver.findElement(By.xpath("//span[text()='Frames']"));
		js.executeScript("arguments[0].scrollIntoView(true);", frame);	
	    frame.click();
	    driver.switchTo().frame("iframeLogin");
	    WebElement text=driver.findElement(By.id("sampleHeading"));
	    System.out.println(text.getText());
	}
}
