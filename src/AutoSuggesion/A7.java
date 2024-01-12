package AutoSuggesion;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class A7 {
   public static void main(String[] args) throws InterruptedException {
	ChromeOptions option=new ChromeOptions();
	//option.addArguments("--incognito");
	//option.addArguments("--headless");
	option.addArguments("start-maximized");
	option.addArguments("--remote-allow-origin=*");
	WebDriver driver=new ChromeDriver(option);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
	driver.navigate().to("https://zapier.com/blog/best-ecommerce-shopping-cart-software/#woocommerce");
	WebElement searchlogo=driver.findElement(By.name("magnifyingGlass"));
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(25));
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@aria-label=\"Manage your account and search apps\"]/div/div/label/span")).click();
	WebElement send=driver.findElement(By.id("universal-nav-app-search"));
	send.sendKeys("Home");
	List<WebElement> list=driver.findElements(By.xpath("//span[@class=\"css-1eugfbp-FloatingMenu__menuItemText\"]"));
	for(WebElement e:list) {
		System.out.println(e.getText());
	}
	
	
	
}
}
