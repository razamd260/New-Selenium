package Unknown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Cricbuzz {
   public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.cricbuzz.com/cricket-stats/icc-rankings/men/batting");
	
	List<WebElement> list=driver.findElements(By.xpath("//a[@class=\"text-hvr-underline text-bold cb-font-16\"]"));
	List<WebElement> list1=driver.findElements(By.xpath("//div[@class=\"cb-col cb-col-17 cb-rank-tbl pull-right\"]"));
	
	for(WebElement e:list) {
    	System.out.println(e.getText());
    		
    }
	for(WebElement e1 :list1) {
		System.out.println(e1.getText());
		
	}
}
}
   
