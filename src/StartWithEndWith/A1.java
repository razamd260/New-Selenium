package StartWithEndWith;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A1 {
    public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\Set Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}
}
