package Incognito;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class A5 {
	public static void main(String[] args) {
		EdgeOptions options = new EdgeOptions();
		options.addArguments("InPrivate");
		WebDriver driver = new EdgeDriver(options);
	}
}
