package RobotClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class A1 {
	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\Set Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://www.google.com");
		driver.findElement(By.id("APjFqb")).click();
		List<WebElement> list=driver.findElements(By.xpath("//div[@class=\"lnnVSe\"]"));
		for(WebElement e:list) {
			System.out.println(e.getText());
		}
	
	
	}
}
