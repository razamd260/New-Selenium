package BrokenLink;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\Set Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		driver.get("https://www.facebook.com");	
		int count=0,code=200;
	    List<WebElement> list=driver.findElements(By.tagName("a"));
	    for(WebElement e:list) {
	    	String url=e.getAttribute("href");
	    	
	    	try {
	    	
	    		URL link=new URL(url);
	    		HttpURLConnection hc=(HttpURLConnection) link.openConnection();
	    		Thread.sleep(2000);
	    		hc.setConnectTimeout(3000);
	    		hc.connect();
	    		code=hc.getResponseCode();
	    		if(code>=300) {
	    			count++;
	    		}
	    	}
	    	catch(MalformedURLException e1) {
	    		e1.printStackTrace();
	    	}
	    	catch(Exception e2) {
	    		e2.printStackTrace();
	    	}
	    }
if(count>0)
	System.out.println("Broken link = "+count);
else
	System.out.println("No Broken Link");
	
	}
}
