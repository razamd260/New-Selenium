package WebElemenetMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValue {
	public static void main(String[] args) {
    	System.setProperty("webdriver.chrome.driver","G:\\Selenium\\Set Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement css=driver.findElement(By.xpath("//a[text()='Create a Page']"));
		System.out.println("Font-Size : "+css.getCssValue("font-size"));
		System.out.println("Style : "+css.getCssValue("font-style"));
		System.out.println("Background-color : "+css.getCssValue("background-color"));
		System.out.println("Width : "+css.getCssValue("font-weight"));
	        System.out.println("background = "+css.getCssValue("background"));
	        System.out.println("line-height = "+css.getCssValue("line-height"));
	        System.out.println("color = "+css.getCssValue("color"));
	        System.out.println("font-family = "+css.getCssValue("font-family"));
    }
}
