package Screenshots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A2 {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\Set Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File Scr=ts.getScreenshotAs(OutputType.FILE);
		File trg=new File("./Set Chrome/MD.png");
		FileUtils.copyFile(Scr, trg);
	
	}
}
