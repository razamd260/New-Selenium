package DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class A3 extends A3DataProvider{
   @Test(dataProvider = "dataprovider")
   public void test01(String user,String password) {
	   WebDriver driver=new ChromeDriver();
	   driver.get("https:www.google.com");
	   driver.findElement(By.name("q")).sendKeys(user+""+password);
	   driver.quit();
	   
   }
}
