package Iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class A1 {
	public static void main(String[] args) {
       WebDriver driver=new EdgeDriver();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
       driver.get("https://www.snapdeal.com/");
  
       WebElement singin=driver.findElement(By.xpath("//span[text()='Sign In']"));
       Actions action=new Actions(driver);
       action.moveToElement(singin).perform();
       WebElement login=driver.findElement(By.xpath("//a[text()='login']"));
       login.click();
       WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
       wait.until(ExpectedConditions.elementToBeClickable(login));
     
       WebElement user =driver.findElement(By.id("loginIframe"));
       driver.switchTo().frame(user);
       driver.findElement(By.id("userName")).sendKeys("ansari");
       driver.findElement(By.id("close-pop")).click();
       driver.switchTo().defaultContent();
       WebElement text=driver.findElement(By.xpath("//div[text()='Top Categories']"));
   	   System.out.println(text.getText());
     
	}
}
