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

public class A6 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\Set Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.get("https://www.myntra.com/");
	    int statuscode=0,count=0;
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
	    List<WebElement> tag =driver.findElements(By.tagName("a"));
	    for(WebElement e:tag) {
	    	String url=e.getAttribute("href");
	    	try {
	    		URL link=new URL(url);
	    		HttpURLConnection hc= (HttpURLConnection) link.openConnection();
	    		hc.getContent();
	    		statuscode=hc.getResponseCode();
	    		System.out.println(statuscode);
	    		if(statuscode>=300) {
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
	if(count==0) {
		System.out.println("No Broken Link ");
	}else {
		System.out.println("Broken link :- "+count);
	}
	
	}
}
