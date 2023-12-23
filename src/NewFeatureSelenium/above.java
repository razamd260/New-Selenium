package NewFeatureSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class above {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
	    driver.get("https://www.facebook.com");
	    WebElement pwd=driver.findElement(By.id("pass"));
	   WebElement user=driver.findElement(RelativeLocator.with(By.tagName("input")).above(pwd));
	   user.sendKeys("razamd260@gmail.com");
	}
	
}
