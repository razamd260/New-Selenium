package AutoSuggesion;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A4 {
    public static void main(String[] args) {
    	System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\Set Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class=\"col-xs-14 search-box-wrapper\"]/div/following-sibling::input")).click();
		List<WebElement> list =driver.findElements(By.xpath("//div[@class=\"searchAutoSuggstn open\"]/descendant::ul/following-sibling::ul/div/following-sibling::li"));
		ArrayList a1=new ArrayList();
		for(WebElement e:list) {
			a1.add(e.getText());
		}
		Iterator itr1=a1.iterator();
		while(itr1.hasNext()) {
			Object obj=itr1.next();
			System.out.println(obj.toString());
		}
	}
}
