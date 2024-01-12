package BrokenLink;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A8 {
	public static void main(String[] args) {
      WebDriver driver=new ChromeDriver();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
      driver.get("https://www.instagram.com");
      int code,count=0;
      List<WebElement> tag=driver.findElements(By.tagName("a"));
      for(WebElement e:tag) {
    	     String url=e.getAttribute("href");
    	     try {
    	    	 URL link=new URL(url);
    	    	 HttpURLConnection hc=(HttpURLConnection) link.openConnection();
    	    	 hc.connect();
    	    	 code=hc.getResponseCode();
    	    	 if(code>=300) {
    	    		 count++;
    	    	 }else {
    	    		 System.out.println(hc.getResponseCode());
    	    	 }
    	     }catch(Exception e1) {
    	    	 e1.printStackTrace();
    	     }
    	     
      }
      driver.quit();
	}
}
