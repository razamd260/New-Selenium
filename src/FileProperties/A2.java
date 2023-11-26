package FileProperties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class A2 {
	public static void main(String[] args) throws IOException {
    
     FileInputStream in=new FileInputStream("./Commondata.properties");
     Properties property=new Properties();
     property.load(in);
     String url=property.getProperty("url");
     long time=Long.parseLong(property.getProperty("time"));
     WebDriver driver=new EdgeDriver();
     driver.get(url);
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
     property.setProperty("time", "15");
     FileOutputStream out=new FileOutputStream("./Commondata.properties");
     property.store(out, "Updated Succesfully");
	}
}
