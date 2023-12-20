package Pop_Up;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload1 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\Set Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://tus.io/demo");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement upload=driver.findElement(By.id("P0-0"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", upload);
	    //upload.sendKeys("C:\\Users\\hii\\OneDrive\\Desktop\\3.3 year\\MD NOUSHAD ANSARI.pdf");
	   Thread.sleep(2000);
	   js.executeScript("arguments[0].click();", upload);
	    StringSelection s=new StringSelection("C:\\Users\\hii\\OneDrive\\Desktop\\3.3 year\\MD NOUSHAD ANSARI.pdf");
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s,null);
	    Robot r=new Robot();
	    r.keyPress(KeyEvent.VK_CONTROL);
	    r.keyPress(KeyEvent.VK_V);
	    
	    r.keyRelease(KeyEvent.VK_CONTROL);
	    r.keyRelease(KeyEvent.VK_V);
	    
	    r.keyPress(KeyEvent.VK_ENTER);
	    r.keyRelease(KeyEvent.VK_ENTER);
	}
}
