package Iframe;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class A2 {
public static void main(String[] args) {
	WebDriver driver=new EdgeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://demo.automationtesting.in/Frames.html");
	WebElement frameswitch=driver.findElement(By.id("singleframe"));
    driver.switchTo().frame(frameswitch);
    driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("hwll");
    driver.switchTo().defaultContent();
    WebElement text=driver.findElement(By.xpath("//a[text()='Home']"));
    System.out.println(text.getText());
  
}
}
