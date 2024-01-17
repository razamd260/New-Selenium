package Calendar;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

// https://jqueryui.com/datepicker/
public class jqueryui {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50));
		driver.get("https://jqueryui.com/datepicker/");
		String expectedYear="2024";
		String expectedDay="4";
		String expectedMonth="February";
		driver.switchTo().frame(0);
		WebElement clickontext =driver.findElement(By.xpath("//input[@id=\"datepicker\"]"));
		wait.until(ExpectedConditions.elementToBeClickable(clickontext));
		clickontext.click();
		while(true) {
			String actualmonth=driver.findElement(By.xpath("//span[@class=\"ui-datepicker-month\"]")).getText();
			String actualyear=driver.findElement(By.xpath("//span[@class=\"ui-datepicker-year\"]")).getText();
			
			if(expectedMonth.equals(actualmonth) && expectedYear.equals(actualyear)) {
				List<WebElement> dateList =driver.findElements(By.xpath("//table/thead/following-sibling::tbody/tr/td"));
			    for(WebElement e:dateList) {
			    	String actualdate=e.getText();
			    	if(actualdate.equals(expectedDay)) {
			    		e.click();
			    		break;
			    	   }
			       }
			   break;
			}else {
				driver.findElement(By.xpath("//a[@title=\"Next\"]")).click();
			}
		}
		
		
		
	}
}
