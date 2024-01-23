package InterviewerFav;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Myntra1 {
     public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		String version=option.getBrowserVersion();
		System.out.println(version);
		//option.addArguments("start-maximized");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.myntra.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement men=driver.findElement(By.xpath("//a[@data-group=\"men\"]"));
		Actions action=new Actions(driver);
		action.moveToElement(men).perform();
		action.pause(2000);
		String start="Topwear";
		String end="Rain Jackets";
		ArrayList<String> a1=new ArrayList<String>();
		//List<WebElement> list=driver.findElements(By.xpath("//a[@href=\"/men-footwear\" and @class=\"desktop-categoryName\"]/parent::li/parent::ul"));
		List<WebElement> list=driver.findElements(By.xpath("//ul[@class=\"desktop-navBlock\"]/li"));//all
		
		int count=1;
		Thread.sleep(2000);
		for(WebElement e:list) {
			if(!e.getText().equals(start)) {
				count++;
			}else {
				break;
			}
		 }
		int startnumber=count;
		int j=1;
		for(WebElement e:list) {
			if(j>=startnumber) {
				if(!e.getText().equals(end)) {
					System.out.println(e.getText());
					j++;
				}else {
					System.out.println(e.getText());
					break;
				}
			}
			j++;
		 }
		
	 }
}

