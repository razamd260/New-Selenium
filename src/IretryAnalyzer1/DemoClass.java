package IretryAnalyzer1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoClass {

	@Test(retryAnalyzer=DemoMethod.class)
	public void test01() {
		
		Assert.assertTrue(false);
	}
}
