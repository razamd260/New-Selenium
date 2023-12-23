package Incognito;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Practice {
    public static void main(String[] args) {
		EdgeOptions option=new EdgeOptions();
		option.addArguments("Inprivate");
		WebDriver driver=new EdgeDriver(option);
	}
}
