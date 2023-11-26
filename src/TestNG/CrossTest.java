package TestNG;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class CrossTest extends Cross {
	WebDriver driver;
   @Test
   public void test1() {
	  driver.get("https://www.google.com");
   }
}
