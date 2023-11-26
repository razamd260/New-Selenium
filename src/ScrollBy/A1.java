package ScrollBy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class A1 {
public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.flipkart.com");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
    driver.manage().window().maximize();
    driver.findElement(By.xpath("//span[text()='✕']")).click();
    WebElement men = driver.findElement(By.xpath("//div[@aria-label=\"Fashion\"]"));
	 Actions action=new Actions(driver);
	 action.moveToElement(men).perform();
	 driver.findElement(By.xpath("//a[text()='Men Footwear']")).click();
	 WebElement select =driver.findElement(By.xpath("//span[text()='Help Center']"));
	Point target =select.getLocation();
	int x=target.getX();
	int y=target.getY();
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(" + x + ", " + y + ");");
	select.click();
}
}
