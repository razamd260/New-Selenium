package Shadow_root;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A4 {
     public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		driver.get("chrome://Extensions");
		WebElement search=(WebElement)
		js.executeScript("return document.querySelector('extensions-manager').shadowRoot.querySelector('extensions-toolbar').shadowRoot.querySelector('cr-toolbar').shadowRoot.querySelector('cr-toolbar-search-field#search').shadowRoot.querySelector('div#searchTerm > input#searchInput')");
	    js.executeScript("arguments[0].value='Extensions';", search);
     
     
     }
}
