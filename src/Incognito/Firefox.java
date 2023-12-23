package Incognito;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Firefox {
	public static void main(String[] args) {
       FirefoxOptions option=new FirefoxOptions();
       option.addArguments("-private");
       FirefoxDriver driver=new FirefoxDriver(option);
       
	}
}
