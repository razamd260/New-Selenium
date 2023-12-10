package DropDown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A4 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\Set Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	   WebElement select=driver.findElement(By.xpath("//div[@class=\"information closable\"]/following-sibling::p/select"));
	   Select s=new Select(select);
	   s.selectByIndex(4);
	   List<WebElement> list=s.getOptions();
	   for(WebElement e:list) {
		   System.out.println(e.getText());
	   }
	}
}
