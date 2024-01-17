package InvokWindow;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SendKeys {
    public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/search?q=jeans&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=off&as=off");
	   String parantID=driver.getWindowHandle();
		driver.findElement(By.xpath("//a[@class=\"IRpwTa\"]")).click();
        Set<String> jump=driver.getWindowHandles();
        for(String e:jump) {
        	driver.switchTo().window(e);
        }
		WebElement offer= driver.findElement(By.xpath("//div[text()='Available offers']"));
        String value=offer.getText();
        driver.switchTo().window(parantID);
        
        WebElement search=driver.findElement(By.name("q"));//.sendKeys(value);
        search.clear();
        search.sendKeys(value);
        String check1=search.getAttribute("value");
        File scr=search.getScreenshotAs(OutputType.FILE);
        File trg=new File("G:\\NewFeatureSelenium\\noushad.png");
        FileUtils.copyFile(scr, trg);
    }
}
