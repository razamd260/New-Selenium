package Pop_Up;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Child2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\Set Chrome\\chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notification");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://www.snapdeal.com");
		String parantID=driver.getWindowHandle();
		driver.findElement(By.name("keyword")).sendKeys("kids",Keys.ENTER);
		driver.findElement(By.xpath("//p[@class=\"product-title \"]")).click();
		Set<String> child=driver.getWindowHandles();
		for(String s:child) {
			driver.switchTo().window(s);
		}
		WebElement child1=driver.findElement(By.xpath("//h1[@itemprop=\"name\"]"));
		System.out.println(child1.getText());
	}
}
