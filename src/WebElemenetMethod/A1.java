package WebElemenetMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A1 {

	 public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com");
		WebElement password=driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		System.out.println(password.getCssValue("font-style"));
		System.out.println(password.getCssValue("font-size"));
		System.out.println(password.getCssValue("color"));
		System.out.println(password.getCssValue("background-color"));
		System.out.println(password.getCssValue("background"));
	}
}
