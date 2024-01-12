package OptionsClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Maximized {

	public static void main(String[] args) {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--start-maximized");
		WebDriver driver=new ChromeDriver(option);
		
	}

}
