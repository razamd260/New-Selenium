package DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class A1 {
   @Test(dataProvider="dataprovider1")
	public void test01(String user,String password) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	    WebElement email= driver.findElement(By.id("email"));
	    email.sendKeys(user);
	   WebElement pwd=driver.findElement(RelativeLocator.with(By.tagName("input")).below(email));
        pwd.sendKeys(password);
   }
	@DataProvider(name="dataprovider1")
   public Object[][] sender() {
	   Object[][] values=new Object[3][2];
		values[0][0]="razamd260";
		values[0][1]="razamd260";
		
		values[1][0]="alinoushad";
		values[1][1]="alinoushad";
		
		values[2][0]="graza4645";
		values[2][1]="grazamd260";
		return values;
   }
}
