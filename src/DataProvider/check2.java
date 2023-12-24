package DataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class check2 {
	
	
    @Test(dataProvider="dataprovider")
	 public void datareciever(String user1,CharSequence password) {
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.instagram.com");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		 
		 WebElement user=driver.findElement(By.xpath("//input[@aria-label=\"Phone number, username, or email\"]"));
		 user.sendKeys(user1);
		 driver.findElement(RelativeLocator.with(By.tagName("input")).below(user)).sendKeys(password);
	    System.out.println(user.getText());
		 driver.quit();
    }

    @DataProvider(name="dataprovider")
    public Object[][] sender() {
    	Object[] [] values=new Object[2][2];
    	
    	values[0][0]="alinoushad";
    	values[0][1]="alinoushad";
    	
    	values[1][0]="razamd260";
    	values[1][1]="razamd260";
    	
    	return values;
    }


}
