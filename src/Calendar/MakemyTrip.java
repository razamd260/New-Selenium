package Calendar;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MakemyTrip {
	public static void main(String[] args) throws InterruptedException {
     WebDriverManager.chromedriver().setup();
     WebDriver driver=new ChromeDriver();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
     driver.get("https://www.makemytrip.com/");
     JavascriptExecutor js=(JavascriptExecutor) driver;
     driver.manage().window().maximize();
     Actions action=new Actions(driver);
     Thread.sleep(5000);
     action.doubleClick().perform();
     WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(50));
     
     WebElement source =driver.findElement(By.id("fromCity"));
     wait.until(ExpectedConditions.elementToBeClickable(source));
     source.click();
     driver.findElement(By.xpath("//input[@aria-autocomplete=\"list\"]")).sendKeys("Mumbai");
     WebElement from=driver.findElement(By.xpath("//div[text()='BOM']"));
     wait.until(ExpectedConditions.elementToBeClickable(from));
     from.click();
     
     
     WebElement destination=driver.findElement(By.id("toCity"));
     wait.until(ExpectedConditions.elementToBeClickable(destination));
     destination.click();
     driver.findElement(By.xpath("//input[@aria-autocomplete=\"list\"]")).sendKeys("Banglore");
     WebElement to=driver.findElement(By.xpath("//div[text()='BLR']"));
     wait.until(ExpectedConditions.elementToBeClickable(to));
     to.click();
    
     WebElement date=driver.findElement(By.xpath("//div[@aria-label=\"Thu Feb 29 2024\"]"));
     wait.until(ExpectedConditions.elementToBeClickable(date));
     date.click();
     
     WebElement return1=driver.findElement(By.xpath("//span[text()='Return']"));
     wait.until(ExpectedConditions.elementToBeClickable(return1));
     return1.click();
     WebElement Next=driver.findElement(By.xpath("//span[@aria-label=\"Next Month\"]"));
     wait.until(ExpectedConditions.elementToBeClickable(Next));
     Next.click();
     WebElement returndate=driver.findElement(By.xpath("//div[@aria-label=\"Mon Mar 04 2024\"]"));
     wait.until(ExpectedConditions.elementToBeClickable(returndate));
     returndate.click();
     
     
     
     
     
     
	}
}
