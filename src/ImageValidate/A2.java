package ImageValidate;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

public class A2 {
	
	
	
  @Test
  public void imageComparisonProcessing() throws IOException, InterruptedException {

	 WebDriver driver = new ChromeDriver();
	  driver.get("https://www.inviul.com");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  
	  //Get WebElement reference of logo
	  WebElement logoElement = driver.findElement(By.xpath("//h1[@id='logo']//a//img"));
	  
	  Thread.sleep(3000);
	  
	  //Capture and store logo image
	  Screenshot shot = new AShot().takeScreenshot(driver, logoElement);
	  File file = new File(System.getProperty("user.dir")+"\\ImageFolder\\logo.png");
	 
  }

}
