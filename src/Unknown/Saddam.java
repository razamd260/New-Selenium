package Unknown;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Saddam {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		String parantId=driver.getWindowHandle();
		WebElement comp = driver.findElement(By.xpath("//div[text()='Companies']"));
		Actions action = new Actions(driver);
	action.moveToElement(comp).perform();
		driver.findElement(By.xpath("//div[text()='MNC']")).click();
	WebElement service	=driver.findElement(By.xpath("//div[text()='Services']"));
	action.moveToElement(service).perform();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='Contact us']")).click();
	 Set<String> contact1= driver.getWindowHandles();
	  for(String e:contact1) {
		  driver.switchTo().window(e);
	  }
     WebElement d=driver.findElement(By.xpath("//h1[text()='Talk to Us']"));
	System.out.println(d.getText());

	}
}
