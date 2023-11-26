package AutoSuggesion;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class A3 {
	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\Set Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		
		driver.get("https://www.google.com");
		driver.findElement(By.id("APjFqb")).click();
		List<WebElement> list=driver.findElements(By.xpath("//div[@class=\"lnnVSe\"]"));
		ArrayList a1=new ArrayList();		
		for(WebElement e:list) {
			a1.add(e.getText());
		}
	Iterator itr=a1.iterator();
	while(itr.hasNext()) {
		Object obj=itr.next();
		System.out.println(obj.toString());
	}
	
	}
	
}
