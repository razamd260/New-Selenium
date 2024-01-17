package InterviewerFav;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Myntra1 {
     public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		//option.addArguments("start-maximized");
		WebDriver driver=new ChromeDriver(option);
		driver.get("https://www.myntra.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement men=driver.findElement(By.xpath("//a[@data-group=\"men\"]"));
		Actions action=new Actions(driver);
		action.moveToElement(men).perform();
		action.pause(2000);
		String upto="Sweaters";
		ArrayList<String> a1=new ArrayList<String>();
		List<WebElement> list=driver.findElements(By.xpath("//a[starts-with(@href,\"/men-topwear\")]"));
		int count=0;
		Thread.sleep(2000);
		for(WebElement e:list) {
			System.out.println(e.getText());
		}
	 }
}

