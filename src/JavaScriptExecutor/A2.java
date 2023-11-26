package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\Set Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String url="https://www.snapdeal.com";
		js.executeScript("window.location=arguments[0]", url);
		 String sText1 =  js.executeScript("return document.title;").toString();
		 String sText2 =  js.executeScript("return document.URL;").toString();
		 System.out.println(sText1+"\n"+sText2);
		WebElement search =driver.findElement(By.name("keyword"));
		js.executeScript("arguments[0].value='kids';", search);
		WebElement click=driver.findElement(By.xpath("//div[@class=\"headerBar reset-padding\"]/descendant::a[text()='Gift Cards']"));
		Thread.sleep(2000);
		js.executeScript("arguments[0].click();", click);
		Thread.sleep(2000);
		 js.executeScript("history.go(0)");
		
		
		 driver.close();
	}
}
