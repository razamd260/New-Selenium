package InterviewerFav;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipakrt1 {
	public static void main(String[] args) throws InterruptedException {
	    WebDriverManager.chromedriver().setup();
	     WebDriver driver=new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
	     driver.get("https://www.wipo.int/patinformed/");
//	     JavascriptExecutor js=(JavascriptExecutor) driver;
//	     driver.manage().window().maximize();
//	     Actions action=new Actions(driver);
//	     String expectedmodule="Furniture";
//	     WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(50));
//	     WebElement module=driver.findElement(By.xpath("//span[text()='"+expectedmodule+"']"));
	     driver.findElement(By.xpath("//div[@class=\"c-search flex fullWidth center-all\"]/child::input[@type=\"text\"]")).sendKeys("rilpivirine"+Keys.ENTER);
	     driver.findElement(By.xpath("//div[.=\"HIV INHIBITING PYRIMIDINES DERIVATIVES (38)\"]")).click();
	     
	     
	}
}
//