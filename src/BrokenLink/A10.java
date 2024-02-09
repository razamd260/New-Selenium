package BrokenLink;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A10 {
     public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		//driver.manage().window().maximize();
		int count=0;
		driver.manage().deleteAllCookies();
		driver.get("https://demoapps.qspiders.com");
		List<WebElement> tag=driver.findElements(By.tagName("a"));
		for(WebElement e:tag) {
			String url=e.getAttribute("href");
			try {
				URL link=new URL(url);
				HttpURLConnection hc=(HttpURLConnection) link.openConnection();
				hc.connect();
				System.out.println(hc.getResponseCode());
				if(hc.getResponseCode()>=300) {
					count++;
				}
			}catch(Exception e1) {
				e1.printStackTrace();
			}
			
		}
		if(count>0) {
			System.out.println("Broken Link ");
		}
		
	}
}
