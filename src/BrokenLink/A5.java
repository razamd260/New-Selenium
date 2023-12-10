package BrokenLink;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A5 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\Set Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		int code=200; int count=0; 
		List<WebElement> tag=driver.findElements(By.tagName("a"));
		for(WebElement e:tag) {
			String url=e.getAttribute("href");
			try {
				URL link=new URL(url);
				HttpURLConnection hc=(HttpURLConnection) link.openConnection();
				hc.setConnectTimeout(2000);
				hc.connect();
				code=hc.getResponseCode();
				System.out.println(hc.getResponseCode());
				if(code>=300) {
					
					count++;
				}
				
			}
		   catch(MalformedURLException e1) {
			   e1.printStackTrace();
		   }
			catch(Exception e1) {
				e1.printStackTrace();
			}
		
		}
if(count>0) {
	System.out.println("Broken Link = "+count);
}
	}
}
