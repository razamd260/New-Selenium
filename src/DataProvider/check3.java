package DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class check3 {

	@Test(dataProvider  = "dataprovider")
	public void test(String name, int age) {
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\Set Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys(name + " " + age, Keys.ENTER);

	}

	@DataProvider(name = "dataprovider")
	public Object[][] sender() {
		Object[][] values = new Object[3][2];
		values[0][0] = "Salman khan";
		values[0][1] = 55;

		values[1][0] = "Salman khan";
		values[1][1] = 55;

		values[2][0] = "Salman khan";
		values[2][1] = 55;

		return values;

	}
}
