package Calendar;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sun.xml.bind.v2.runtime.unmarshaller.XsiNilLoader.Single;



public class Practice {
	public static void main(String[] args) {
       WebDriver d=new ChromeDriver();
      ChromeDriver driver=(ChromeDriver)d;
      Actions action=new Actions(driver);
      JavascriptExecutor js=(JavascriptExecutor)driver;
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
      WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
     // wait.until(ExpectedConditions.elementToBeClickable(null));
      driver.get("https://www.Booking.com");
    
      action.pause(5000).perform();
      action.doubleClick().perform();
      String expectedcruncy="Australian Dollar";
      int currentmonth=1;
      String expectedmonthyear="April 2024";
      String expectedDay="27";
      
//      WebElement language=driver.findElement(By.xpath("//button[@data-testid=\"header-currency-picker-trigger\"]/child::span"));
//      action.moveToElement(language).perform();
//      
//      WebElement tooltips=driver.findElement(By.xpath("//div[contains(@id,\"batBeacon\")]/following-sibling::div/div"));
//      wait.until(ExpectedConditions.visibilityOf(tooltips));
//      String tooltipstext=tooltips.getText();
//      System.out.println(tooltipstext);
//      wait.until(ExpectedConditions.elementToBeClickable(language));
//      language.click();
//      js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
//      WebElement money=driver.findElement(By.xpath("//span[text()='"+expectedcruncy+"']"));
//      wait.until(ExpectedConditions.elementToBeClickable(money));
//      money.click();
//      WebElement from=driver.findElement(By.xpath("//div[@data-testid=\"destination-container\"]"));
//      wait.until(ExpectedConditions.elementToBeClickable(from));
//      from.click();
//      action.pause(5000).perform();
//      driver.findElement(By.name("ss")).sendKeys("Bangalore");
//      driver.findElement(By.cssSelector("li#autocomplete-result-0")).click();
//      //action.doubleClick().perform();
//      WebElement date=driver.findElement(By.xpath("//span[text()='26']"));
//      wait.until(ExpectedConditions.elementToBeClickable(date));
//      date.click();
      driver.findElement(By.xpath("//div[@data-testid=\"searchbox-dates-container\"]")).click();
      int i=1;
      	  while(true) {
//      		WebElement actualmonth=driver.findElement(By.xpath("//h3[@aria-live=\"polite\"]"));
//      	  	 System.out.println(actualmonth.getText());
//             if(expectedmonthyear.equals(actualmonth.getText())) {
//            	 System.out.println(actualmonth.getText());
//            	 WebElement day=driver.findElement(By.xpath("//span[text()='"+expectedDay+"']"));
//                 wait.until(ExpectedConditions.elementToBeClickable(day));
//                 js.executeScript("arguments[0].click();", day);
//                 break;
//             }else {
            	 WebElement  singlelist=driver.findElement(By.xpath("//div[@data-testid=\"searchbox-datepicker-calendar\"]/button"));
            	 List<WebElement> alllist =driver.findElements(By.xpath("//div[@data-testid=\"searchbox-datepicker-calendar\"]/button"));
            	 if(i==1) {
            		 singlelist.click();
            	  }
            	 for(WebElement e:alllist) {
            		 System.out.println("hhh");
            		 if(i%2==0) {
            			 e.click();
            			 i++;
            		 }else {
            			 i++;
            		 }
            	 }
             }
	  
      
     
     
      
      
    }
}