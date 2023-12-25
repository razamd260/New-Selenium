package DataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class A3 extends DataProvider3{
	public static WebDriver driver;
	@Test(dataProvider ="dataProvider")
	public void test01(String url,String user,String pass) {
		switch(url) {
		case "https://www.google.com": google(url,user,pass);
		break;
		case "https://www.facebook.com": facebook(url,user,pass);
		break;
		                                        
		}
   }
	
	public static void google(String url,String user,String pass) {
		driver=new ChromeDriver();
        driver.get(url);
        driver.findElement(By.name("q")).sendKeys(user);
		
	}
	public static void facebook(String url,String user,String pass) {
		driver=new ChromeDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
    	driver.findElement(By.name("email")).sendKeys(user);
		driver.findElement(By.id("pass")).sendKeys(pass);
		
	}
}
