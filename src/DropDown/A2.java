package DropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class A2 {
   public static void main(String[] args) throws InterruptedException {
	   ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\Set Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		driver.get("https://www.amazon.in");
		WebElement select=driver.findElement(By.xpath("//select[@aria-describedby=\"searchDropdownDescription\"]"));
        Select s=new Select(select);
        s.selectByIndex(3);
        Thread.sleep(2000);
        s.selectByVisibleText("Baby");
        Thread.sleep(2000);
        s.selectByValue("search-alias=apparel");
        List<WebElement> list=s.getOptions();
        for(WebElement e:list) {
        	System.out.println(e.getText());
        }
   
   }
}
