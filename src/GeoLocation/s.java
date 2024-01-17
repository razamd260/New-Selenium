package GeoLocation;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class s {
	public ChromeDriver driver;

	@BeforeClass
	public void setUp() {
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@AfterClass
	public void afterClass() {
	    driver.quit();
	}

	@Test
	public void emulateGeolocation() {
	    Map coordinates = new HashMap() {
		{
		     put("latitude", 23.747114);
		     put("longitude", 85.753409);
		     put("accuracy", 1);
		 }
	    };
		
	 	
	    driver.get("https://where-am-i.org/");		
	    System.out.println("-----GeoLocation----");
	    System.out.println("Location:" + driver.findElement(By.id("address")).getText());
	    System.out.println("Latitude:" +     driver.findElement(By.id("latitude")).getText());
	    System.out.println("Longitude:"+ driver.findElement(By.id("longitude")).getText());
	    System.out.println("--------------------");
       }
	}



























/*
driver.executeCdpCommand("Emulation.setGeolocationOverride", coordinates);
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("netflix",Keys.ENTER);
		driver.findElement(By.xpath("//h3[@class=\"LC20lb MBeuO DKV0Md\"]")).click();
		WebElement text=driver.findElement(By.xpath("//h1[@data-uia=\"nmhp-card-hero-text-title\"]"));
	    System.out.println(text.getText());*/