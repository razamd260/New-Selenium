package Emulation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v112.emulation.Emulation;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A2 {
	public static void main(String[] args) throws InterruptedException {
     //WebDriverManager.chromedriver().setup();
     ChromeDriver driver=new ChromeDriver();
     DevTools devtool = driver.getDevTools();
     devtool.createSession();
     Thread.sleep(2000);
	 devtool.send(Emulation.setDeviceMetricsOverride(600, 1000, 50, true, java.util.Optional.empty(), java.util.Optional.empty(), java.util.Optional.empty(), java.util.Optional.empty(), java.util.Optional.empty(), java.util.Optional.empty(), java.util.Optional.empty(), java.util.Optional.empty(), java.util.Optional.empty()));
     driver.get("https://www.flipkart.com");
     driver.manage().window().maximize();
	}
}
