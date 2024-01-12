package TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class A2 {
	
	@Test(groups="sanity")
	 public void test1() {
		  WebDriver driver=new EdgeDriver();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		  System.out.println("A2 ####11111 [threadNumber:-----"+Thread.currentThread().getId());
	  }
	@Test(groups={"regresion","smoke"})
		public void test2() {
			  WebDriver driver=new EdgeDriver();
			 System.out.println("A2 ####22222 [threadNumber:------"+Thread.currentThread().getId());
		  }
		 
}
