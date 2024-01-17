package Emulation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v112.emulation.Emulation;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A1 {
	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\Set Chrome\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();		
		DevTools devtool = driver.getDevTools();
		devtool.createSession();
		Thread.sleep(2000);
		devtool.send(Emulation.setDeviceMetricsOverride(100, 500, 50, true, null, null, null, null, null, null, null,
				null, null));
		driver.get("https://www.google.com");
	}
}
