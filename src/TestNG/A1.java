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
	  System.out.println("A1 ####11111 [threadNumber:-------"+Thread.currentThread().getId());
  }
	@Test(groups="whitebox")
	  public void test2() {
		  WebDriver driver=new EdgeDriver();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		  System.out.println("A1 ####2222 [threadNumber:-------"+Thread.currentThread().getId());
	  }
	 
}
