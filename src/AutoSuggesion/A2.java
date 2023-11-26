package AutoSuggesion;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class A2 {
	public static void main(String[] args) throws InterruptedException {
	     WebDriver driver=new FirefoxDriver();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
	     driver.get("https://www.flipkart.com");
	     driver.findElement(By.xpath("//span[text()='✕']")).click();
	     driver.findElement(By.name("q")).click();
	    List<WebElement> list= driver.findElements(By.xpath("//div[@class=\"YGcVZO\"]"));
	    ArrayList a1=new ArrayList();
	    for(WebElement e:list) {
	    	a1.add(e.getText());
	    }
	     Iterator itr1=a1.iterator();
	     while(itr1.hasNext()) {
	    	 Thread.sleep(2000);
	    	 Object obj=itr1.next();
	    	 System.out.println(obj.toString());
	     }
		driver.close();
		}
}
