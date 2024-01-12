package BrokenLink;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A7 {
    public static void main(String[] args) {
    	System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\Set Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		int code=0,count=0;
		driver.get("https://www.aliexpress.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		List<WebElement> list=driver.findElements(By.tagName("a"));
		for(WebElement e:list) {
			String url=e.getAttribute("href");
			try {
				URL link=new URL(url);
				HttpURLConnection hc=(HttpURLConnection) link.openConnection();
				hc.connect();

				code=hc.getResponseCode();
				System.out.println(code);
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
		System.out.println("Broken link found : "+count);
	}else {
		System.out.println("No Broken Link");
	}
    
    }
}
