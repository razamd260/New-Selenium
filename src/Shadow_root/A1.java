package Shadow_root;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class A1 {
	public static void main(String[] args) {
		System.setProperty("wedriver.chrome.driver", "G:\\Selenium\\Set Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("chrome://Extensions/");
        JavascriptExecutor js=(JavascriptExecutor)driver;
        WebElement text=(WebElement) js .executeScript("return document.querySelector('extensions-manager').shadowRoot.querySelector('extensions-toolbar').shadowRoot.querySelector('cr-toolbar').shadowRoot.querySelector('div#leftContent >div#leftSpacer >cr-icon-button#menuButton')");
 	   js.executeScript("arguments[0].click();", text);
       
		

	}
}
//      WebElement text=(WebElement) js .executeScript("return document.querySelector('downloads-manager').shadowRoot.querySelector('downloads-toolbar#toolbar').shadowRoot.querySelector('cr-toolbar#toolbar').shadowRoot.querySelector('cr-toolbar-search-field#search').shadowRoot.querySelector('div#searchTerm > input#searchInput')");
//      js.executeScript("arguments[0].value='salman';", text);