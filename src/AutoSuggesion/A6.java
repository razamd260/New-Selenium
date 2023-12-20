package AutoSuggesion;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class A6 {
    public static void main(String[] args) {
    	System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\Set Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.aliexpress.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement dont=driver.findElement(By.xpath("//div[text()='Allow']/following-sibling::div"));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(40));
		wait.until(ExpectedConditions.elementToBeClickable(dont));
		driver.findElement(By.xpath("//div[text()='Allow']/following-sibling::div")).click();
		WebElement search=driver.findElement(By.id("search-words"));
		search.click();
		List<WebElement> list=driver.findElements(By.xpath("//span[contains(@class,\"src--listTitle\")]"));
	    for(WebElement e:list) {
	    	System.out.println(e.getText());
	    }
    }
}
