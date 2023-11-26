package JavaScriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class A1 {
   public static void main(String[] args) {
	WebDriver driver=new EdgeDriver();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    String url="https://www.google.com";
    JavascriptExecutor js=(JavascriptExecutor)driver;
    js.executeScript("window.location=arguments[0]", url);
    WebElement search=driver.findElement(By.id("APjFqb"));
   // js.executeScript("arguments[0].click()", search);
    js.executeScript("arguments[0].value='salman';", search);
}
}
