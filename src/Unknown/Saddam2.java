package Unknown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Saddam2 {
    public static void main(String[] args) {
    	System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\Set Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		

		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-left");
		String left=driver.findElement(By.xpath("//body[contains(text(),'LEFT')]")).getText();
		System.out.println(left);
		driver.switchTo().parentFrame();
		driver.switchTo().frame("frame-middle");
		
		String left1=driver.findElement(By.id("content")).getText();
		System.out.println(left1);
	}
}
