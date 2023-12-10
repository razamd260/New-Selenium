package Pop_Up;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileUpload {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\Set Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		WebElement target=driver.findElement(By.xpath("//h5[text()='Forms']"));
	   JavascriptExecutor js=(JavascriptExecutor)driver;
	   js.executeScript("arguments[0].scrollIntoView(true);", target);
	   WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	   wait.until(ExpectedConditions.elementToBeClickable(target));
	   target.click();
	   driver.findElement(By.xpath("//span[text()='Practice Form']")).click();
	   driver.findElement(By.id("firstName")).sendKeys("ansari");
	   WebElement date=driver.findElement(By.id("dateOfBirthInput"));
	   js.executeScript("arguments[0].scrollIntoView(true);", date);
	   date.click();
	   Thread.sleep(2000);
	  WebElement select1= driver.findElement(By.xpath("//select[@class=\"react-datepicker__year-select\"]"));
	  
	   Select s1=new Select(select1);
	   s1.selectByValue("1914");
	   Thread.sleep(2000);
	   WebElement select2= driver.findElement(By.xpath("//select[@class=\"react-datepicker__month-select\"]"));
	   Select s2=new Select(select2);
	   s2.selectByIndex(2);
	   driver.findElement(By.xpath("//div[text()='12']")).click();
	   WebElement upload=driver.findElement(By.id("uploadPicture"));
	   js.executeScript("arguments[0].click();", upload);
	   StringSelection file=new StringSelection("C:\\Users\\hii\\OneDrive\\Desktop\\3.3 year\\MD NOUSHAD ANSARI.pdf");
	   
	   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(file, null);
	   Robot r=new Robot();
	   r.keyPress(KeyEvent.VK_CONTROL);
	   r.keyPress(KeyEvent.VK_V);
	   r.keyRelease(KeyEvent.VK_CONTROL);
	   r.keyRelease(KeyEvent.VK_CONTROL);

	   r.keyPress(KeyEvent.VK_ENTER);
	   r.keyRelease(KeyEvent.VK_ENTER);
	   
	   
 
	}
}
