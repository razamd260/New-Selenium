package ItestListener;



import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ItestListener.A.class)
public class Script {
	
	public WebDriver driver;
	@BeforeTest
	public void launch() {
		driver=new  ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		
	}

@Test
public void test() {
	driver.get("https://www.google.com");
	Assert.assertTrue(false);
}

@AfterMethod
public void close() {
	driver.close();
    }
}
