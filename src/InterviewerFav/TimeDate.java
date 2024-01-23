package InterviewerFav;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TimeDate {
      public static void main(String[] args) {
    	  WebDriverManager.chromedriver().setup();
 	     WebDriver driver=new ChromeDriver();
 	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
 	     driver.get("https://www.timeanddate.com/worldclock/india/new-delhi");
 	     WebElement datetime=driver.findElement(By.id("qlook"));
 	     System.out.println(datetime.getText());
	}
}
