package MouseHouvering;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
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
	 String ParantID =driver.getWindowHandle();
	 driver.findElement(By.xpath("//a[@target=\"_blank\"]/ancestor::div[@data-id=\"SNDFT22BAKJGZ4UA\"]")).click();
	 Set<String> childID=driver.getWindowHandles();
	 for(String s:childID) {
		 driver.switchTo().window(s);
	 }
	 WebElement price =driver.findElement(By.xpath("//div[@class=\"_30jeq3 _16Jk6d\"]"));
	 System.out.println(price.getText());
	 driver.switchTo().window(ParantID);

	 
	 
	}
}
