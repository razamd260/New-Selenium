package IretryAnalyzer1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class IRetryClass {
	public WebDriver driver;
	@BeforeMethod
	public void launch() {
	    driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
	}
	@Test(retryAnalyzer = iretrymethod.class)
	public void test() {
		driver.get("https://www.google.com");
		WebElement text=driver.findElement(By.xpath("//a[text()='Images']"));
		String image=text.getText();
		Assert.assertEquals("Image", image);
	}
	@AfterMethod
	public void close() {
	System.err.println("Thank You");
	}
}
