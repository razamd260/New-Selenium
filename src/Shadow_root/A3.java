package Shadow_root;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A3 {
     public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("chrome://downloads");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.location=arguments[0]", "chrome://downloads");
      // WebElement search=(WebElement) js .
      //  executeScript("return document.querySelector('downloads-manager').shadowRoot.querySelector('downloads-toolbar#toolbar').shadowRoot.querySelector('cr-toolbar#toolbar').shadowRoot.querySelector('cr-toolbar-search-field#search').shadowRoot.querySelector('div#searchTerm > input#searchInput')");
      // js.executeScript("arguments[0].value='salman';", search);
		WebElement search =(WebElement)js.
	    executeScript("return document.querySelector('downloads-manager').shadowRoot.querySelector('downloads-toolbar#toolbar').shadowRoot.querySelector('cr-toolbar#toolbar').shadowRoot.querySelector('cr-toolbar-search-field#search').shadowRoot.querySelector('div#searchTerm >  input#searchInput')");
		js.executeScript("arguments[0].value='Amir Khan';", search);
	}
}
