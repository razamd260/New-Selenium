package AutoSuggesion;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A5 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\Set Chrome\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
	    driver.get("https://www.myntra.com/");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
	    driver.findElement(By.xpath("//input[@placeholder=\"Search for products, brands and more\"]")).sendKeys("jeans");
	  //  WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(12));
	   // wait.until(ExpectedConditions.visibilityOf(null));
	    List<WebElement> list=driver.findElements(By.xpath("//ul[@class=\"desktop-group\"]/li"));
	    for(WebElement e:list) {
	    	System.out.println(e.getText());
	    }
	}
}
