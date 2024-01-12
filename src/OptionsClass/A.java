package OptionsClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class A {
     public static void main(String[] args) {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("disable-infobars");
		//option.addArguments("--remote-allow-origins=*");
        WebDriver driver=new ChromeDriver(option);
        driver.get("https://meet.google.com/vsx-hooj-hyy?pli=1");
	}
}
