package OptionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headless {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		WebDriver d = new ChromeDriver(options);
		d.get("https://www.google.com");
		WebElement search = d.findElement(By.name("q"));
		search.sendKeys("Salman Khan");
		String value = search.getAttribute("value");
		System.out.println(value);
	}

}
