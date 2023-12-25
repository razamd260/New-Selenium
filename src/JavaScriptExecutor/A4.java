package JavaScriptExecutor;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class A4 {
     
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.location=arguments[0]","https://www.google.com");
		Dimension d=new Dimension(800,1080);
		driver.manage().window().setSize(d);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
	    js.executeScript("arguments[0].value='salma';", driver.findElement(By.name("q")));
	    Thread.sleep(2000);
	    js.executeScript("history.go(0);");
	    driver.switchTo().newWindow(WindowType.TAB);
	    driver.get("https://www.amazon.in");
	    js.executeScript("window.scrollBy(0,100);");
	    js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//a[text()='Conditions of Use & Sale']")));
	    System.out.println(js.executeScript("return document.URL")); 
		
	}
}
