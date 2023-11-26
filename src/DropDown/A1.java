package DropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class A1 {
	
 public static void main(String[] args) {
	 WebDriver driver=new FirefoxDriver();
     driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
     WebElement select1 =driver.findElement(By.id("first"));
     Select s=new Select(select1);
     s.selectByIndex(2);

	
}
}
