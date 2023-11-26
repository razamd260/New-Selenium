package TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class A1 {
	@Test(groups="blackbox")
  public void test1() {
	  WebDriver driver=new EdgeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
	  driver.get("https://www.facebook.com");
  }
	@Test(groups="whitebox")
	  public void test2() {
		  WebDriver driver=new EdgeDriver();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		  driver.get("https://www.flipkart.com");
	  }
	  @Test(groups="graybox")
	  public void test3() {
		  WebDriver driver=new EdgeDriver();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		  driver.get("https://www.amazon.in");
	  }
}
