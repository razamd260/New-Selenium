package Screenshots;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;


public class A1 {
    public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=new FirefoxDriver();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
    	driver.get("https://www.flipkart.com");
    	TakesScreenshot tc=(TakesScreenshot)driver;
    	File scr=tc.getScreenshotAs(OutputType.FILE);
    	File trg=new File("G:\\Selenium\\Set Chrome\\noushad1.png");
    	Files.copy(scr, trg);
    	Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='✕']")).click();
		WebElement logo=driver.findElement(By.xpath("//img[@title=\"Flipkart\"]"));
		File tc1=logo.getScreenshotAs(OutputType.FILE);
		File trg1=new File("G:\\Selenium\\Set Chrome\\noushad2.png");
		Files.copy(tc1, trg1);
    	
	}
}
