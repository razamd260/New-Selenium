package GeoLocation;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A1 {
    public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		DevTools devtool=driver.getDevTools();
		devtool.createSession();
		
		
//		Map<String, Object> coordinates=new HashMap<String,Object>();
//		coordinates.put("latitude", 104);
//		coordinates.put("longitude", 35);
//		coordinates.put("accuracy", 1);
		
		//driver.executeCdpCommand("Emulation.setGeolocationOverride", map);
		
		
		 Map coordinates = new HashMap()
		  {{
		      put("latitude", 40);
		      put("longitude", 3);
		      put("accuracy", 1);
		  }};    
		  driver.executeCdpCommand("Emulation.setGeolocationOverride", coordinates);
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("netflix",Keys.ENTER);
		driver.findElement(By.xpath("//h3[@class=\"LC20lb MBeuO DKV0Md\"]")).click();
		WebElement text=driver.findElement(By.xpath("//h1[@data-uia=\"nmhp-card-hero-text-title\"]"));
	    System.out.println(text.getText());	
    }
}
