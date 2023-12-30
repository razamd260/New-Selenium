package Screenshots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A3 {
     public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		  WebElement logoImage = driver.findElement(By.xpath("//img[@alt=\"Facebook\"]"));
		  File scr=logoImage.getScreenshotAs(OutputType.FILE);
		  File trg=new File("G:\\Selenium\\Set Chrome\\facebook.png");
		  FileUtils.copyFile(scr, trg);
	}
}
