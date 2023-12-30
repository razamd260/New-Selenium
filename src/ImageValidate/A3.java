package ImageValidate;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

public class A3 {
	 WebDriver driver;
     
	    @Test
	    public void imageComaparision() throws IOException{
	        
	        driver = new ChromeDriver();
	        driver.get("http://www.facebook.com");
	         
	        WebElement logoImage = driver.findElement(By.xpath("//img[@alt=\"Facebook\"]"));
	         
	        BufferedImage expectedImage = ImageIO.read(new File(System.getProperty("user.dir") +"\\Images\\ElementScreenshotWithPixle.png"));
	        Screenshot logoImageScreenshot = new AShot().takeScreenshot(driver, logoImage);
	        BufferedImage actualImage = logoImageScreenshot.getImage();
	           
	        ImageDiffer imgDiff = new ImageDiffer();
	        ImageDiff diff = imgDiff.makeDiff(actualImage, expectedImage);
	        Assert.assertTrue(diff.hasDiff(),"Images are Same");
	                 
	        driver.quit();
	    }
}
