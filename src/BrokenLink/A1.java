package BrokenLink;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class A1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\Set Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://ahrefs.com/broken-link-checker");
		int responsecode = 200;
		int count = 0;
		int perfect = 0;
		List<WebElement> Linklist = driver.findElements(By.tagName("a"));
		for (WebElement e : Linklist) {
			String url = e.getAttribute("href");

			try {
				URL urllink = new URL(url);
				HttpsURLConnection huc = (HttpsURLConnection) urllink.openConnection();
				huc.setRequestMethod("HEAD");
				huc.connect();
				responsecode = huc.getResponseCode();
				System.out.println(responsecode);
				if ( responsecode>= 400) {
					count++;
				} else {
					perfect++;
				}
			} catch (MalformedURLException e1) {
				e1.printStackTrace();
			} catch (Exception e1) {
				e1.printStackTrace();
			}

		}
		System.out.println("paerfect url : " + perfect);
		System.out.println("Found Total Broken Link :" + count);
		Assert.assertEquals(Linklist.size(), perfect);
	}
}
