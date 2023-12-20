package WebElemenetMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAccesibel {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","G:\\Selenium\\Set Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement css=driver.findElement(By.xpath("//h2[text()='Facebook helps you connect and share with the people in your life.']"));
		System.out.println(css.getAccessibleName());
	}
}
