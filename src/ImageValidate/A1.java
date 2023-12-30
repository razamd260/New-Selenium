package ImageValidate;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

public class A1 {
     public static void main(String[] args) throws IOException {
      WebDriver driver=new ChromeDriver();
      driver.get("https://www.google.com");
      BufferedImage expected=ImageIO.read(new File("G:\\Selenium\\Set Chrome\\logo.png"));
      WebElement logo=driver.findElement(By.xpath("//img[@alt=\"Google\"]"));
      Screenshot logoimage= new AShot().takeScreenshot(driver, logo);
      BufferedImage actualimage=logoimage.getImage();
      ImageDiffer imgdiff=new ImageDiffer();
      ImageDiff diff= imgdiff.makeDiff(actualimage, expected);
      if(diff.hasDiff()==true) {
    	  System.out.println("Images are Not Same");
      }else {
    	  System.out.println("Images are same");
      }
      
	}
     
     
     
  

}
