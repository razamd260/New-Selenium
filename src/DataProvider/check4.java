package DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class check4 extends DataProvider4{

	@Test(dataProvider = "dataProvider")
	public void test(String user, String pwd) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys(user,Keys.TAB+pwd);
		
	}
}
