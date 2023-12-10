package Unknown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeDownload {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\Set Chrome\\chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		WebDriver driver = new ChromeDriver();
		driver.get("chrome://downloads/");
		driver.switchTo().newWindow(WindowType.TAB);
		//driver.get("chrome://history/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.location=arguments[0]","chrome://history/" );
		//driver.findElement(By.id("icon")).click();
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("chrome://bookmarks/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("chrome://Extensions/");
	}
}
