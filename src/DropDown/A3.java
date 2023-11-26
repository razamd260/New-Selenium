package DropDown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A3 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\Set Chrome\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.snapdeal.com");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.findElement(By.xpath("//div[@class=\"col-xs-14 search-box-wrapper\"]/div/following-sibling::input")).sendKeys("Kids",Keys.ENTER);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class=\"sort-drop clearfix\"]")).click();
	Thread.sleep(2000);
	List<WebElement> list=driver.findElements(By.xpath("//ul[@class=\"sort-value\"]/li"));
	for(WebElement e:list) {
		System.out.println(e.getText());
		
	}
	
}
}
//