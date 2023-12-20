package Shadow_root;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A2 {
    public static void main(String[] args) {
    	System.setProperty("wedriver.chrome.driver", "G:\\Selenium\\Set Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("chrome://Extensions/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement args1=(WebElement) js.executeScript("return document.querySelector('extensions-manager').shadowRoot.querySelector('extensions-toolbar').shadowRoot.querySelector('div.more-actions > cr-toggle#devMode')");
		js.executeScript("arguments[0].click();", args1);
	}
}
