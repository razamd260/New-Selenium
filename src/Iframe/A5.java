package Iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A5 {
   public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/nested_frames");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement frame=driver.findElement(By.name("frame-top"));
	driver.switchTo().frame(frame);
	WebElement left= driver.findElement(By.name("frame-left"));
	driver.switchTo().frame(left);
	String textleft=driver.findElement(By.xpath("//body[contains(text(),\"LEFT\")]")).getText();
	System.out.println(textleft);
	//driver.switchTo().defaultContent();//main webPage
	driver.switchTo().parentFrame();
	WebElement middle= driver.findElement(By.name("frame-middle"));
	driver.switchTo().frame(middle);
	String middletext=driver.findElement(By.id("content")).getText();
	System.out.println(middletext);
	driver.quit();
}
}
