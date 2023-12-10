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

public class A2 {
     public static void main(String[] args) {
    	 System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\Set Chrome\\chromedriver.exe");
 		WebDriver driver = new ChromeDriver();
 		driver.get("https://demoqa.com/broken");
 		int code=0,count=0,perfect=0;
 		driver.manage().deleteAllCookies();
 		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
 		List<WebElement> linklist=driver.findElements(By.tagName("a"));
 		for(WebElement e:linklist) {
 		String	url=e.getAttribute("href");
 		   try {
 			    URL urllink=new URL(url);
 			    HttpURLConnection connection=(HttpURLConnection) urllink.openConnection();
 			    connection.setRequestMethod("HEAD");
 			    connection.connect();
 			    code=connection.getResponseCode();
 			    if(code>=300) {
 			    	count++;
 			    }
 			    else {
 			    	perfect++;
 			    }
 			 }
 		  catch (MalformedURLException e1) {
				e1.printStackTrace();
			}
 		   catch (Exception e1){
 			   e1.printStackTrace();
 		   }
 		}
	System.out.println("Broken Link = "+count);
	
     }
}
