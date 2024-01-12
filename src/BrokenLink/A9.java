package BrokenLink;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A9 {
    public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		List<WebElement> tag=driver.findElements(By.tagName("a"));
		int count=0;
		for(WebElement e:tag) {
			String url=e.getAttribute("href");
			try {
				URL link=new URL(url);
				HttpURLConnection hc=(HttpURLConnection) link.openConnection();
				hc.connect();
				int code=hc.getResponseCode();
				if(code>=300) {
					count++;
				}
			}catch(Exception e1) {
				e1.printStackTrace();
			}
		}
	if(count>0) {
	  System.out.println("Broken Link : "+count);	
	}else {
		System.out.println("No Broken Link");
	}
    
    }
}
