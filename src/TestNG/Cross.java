package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Cross {
    WebDriver driver;
	@BeforeMethod
	 @Parameters("browser")
	public void browser(String browser) {
		switch(browser.toLowerCase()) {
		case "chrome":driver=new ChromeDriver();
		break;
		case "edge":driver=new EdgeDriver();
		break;
		case "firefox":driver=new FirefoxDriver();
		break;
		default :System.out.println("NO match any browser");
		break;
		}
	}

@AfterMethod
public void end() {
	driver.close();
}

}
