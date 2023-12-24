package DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class A2 extends DataProvider2 {

	@Test(dataProvider = "dataProvider")
	public void reciever(String num,String url,String user,String password) {
		WebDriver driver;
		if(num.equals("1")) {
		    driver = new ChromeDriver();
	        driver.get(url);
	        driver.findElement(By.name("q")).sendKeys(user);
		}
		else if(num.equals("2")) {
			driver=new ChromeDriver();
			driver.get(url);
			driver.findElement(By.name("email")).sendKeys(user);
			driver.findElement(By.name("pass")).sendKeys(password);
		}
		
	}
}
