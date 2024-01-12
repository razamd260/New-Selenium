package DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class check5 extends DataProvider5 {

	@Test(dataProvider="dataProvider")
	public void recieve(String value1,String value2) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys(value1+value2);
	}
}
