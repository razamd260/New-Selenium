package DropDown;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class A5 {
    public static void main(String[] args) throws InterruptedException, AWTException {
    	System.setProperty("webdriver.chrome.driver","G:\\Selenium\\Set Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/dropdown/search?scenario=1&sublist=0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[@id=\"react-select-3-placeholder\"]/../..")).click();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
    }
}
