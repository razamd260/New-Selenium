package InterviewerFav;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Myntra2 {
	public static void main(String[] args) throws IOException {
		
		FileInputStream in=new FileInputStream("G:\\Selenium\\Commondata1.properties");
		Properties property=new Properties();
		property.load(in);
		String start=property.getProperty("start");
		String end=property.getProperty("end");
		WebDriverManager.chromedriver().setup();
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		String version=option.getBrowserVersion();
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.myntra.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement men=driver.findElement(By.xpath("//a[@data-group=\"men\"]"));
		Actions action=new Actions(driver);
		action.moveToElement(men).perform();
		action.pause(2000);
		System.out.println("Version of Browser :"+version);
	
		List<WebElement> list=driver.findElements(By.xpath("//ul[@class=\"desktop-navBlock\"]/li"));
		int count=1;
		for(WebElement e:list) {
			if(!e.getText().equals(start)) {
				count++;
			}else {
				break;
			}
		}
		
		int i=1;
		for(WebElement e:list) {
			if(i>=count) {
				if(!e.getText().equals(end)) {
					System.out.println(e.getText());
				}else {
					System.out.println(e.getText());
					break;
				}
			}
			i++;
		}
	}
}
