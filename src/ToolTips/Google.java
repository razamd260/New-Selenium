package ToolTips;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
	 public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
			driver.get("https://www.google.com/");
			String expected="Search";
			WebElement search=driver.findElement(By.name("q"));
			String tooltip=search.getAttribute("title");
			if(expected.equals(tooltip)) {
				System.out.println("Test Script Pass");
			}
		}
}
