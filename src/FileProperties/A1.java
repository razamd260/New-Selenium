package FileProperties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class A1 {
public static void main(String[] args) throws IOException {
	WebDriver driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
	FileInputStream fis=new FileInputStream("./Common.properties");
	Properties property=new Properties();
	property.load(fis);
	String name=property.getProperty("name");
	System.out.println(name);
	property.setProperty("name", "ANSARI");
	FileOutputStream out=new FileOutputStream("./Common.properties");
	property.store(out, "update");
	
}
}
