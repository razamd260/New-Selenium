package ScrollBy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UniqueTechnic {
      public static void main(String[] args) {
    		WebDriver driver=new ChromeDriver();
    		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
    		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
    		 Actions action=new Actions(driver);
    		 driver.get("https://www.myntra.com/");
    		 WebElement anyElement = driver.findElement(By.tagName("body"));
    		 WebElement bottomElement = driver.findElement(By.tagName("footer"));
    		// jsExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    	    // action.moveToElement(anyElement).sendKeys(Keys.END).perform();
    		action.moveToElement(bottomElement).perform();
	}
}
