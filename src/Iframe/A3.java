package Iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\Set Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#google_vignette");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement frame=driver.findElement(By.name("globalSqa"));
		Thread.sleep(2000);
		driver.findElement(By.id("iFrame")).click();
		driver.switchTo().frame(frame);
		driver.findElement(By.id("s")).sendKeys("MD NOUSHAD ANSARI");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("s")).sendKeys("MD SARFRAJ ANSARI");
	}
}
