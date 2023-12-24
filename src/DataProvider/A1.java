package DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class A1 extends DataProvider1 {
     @Test(dataProvider="dataProvider")
	public void test01(String key) {
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.google.com");
		 driver.findElement(By.name("q")).sendKeys(key);
	}


}
