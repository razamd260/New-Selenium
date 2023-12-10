package FileProperties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class A3 {
  public static void main(String[] args) throws IOException {
	FileInputStream fis=new FileInputStream("G:\\Selenium\\Set Chrome\\Common.properties");
    Properties property=new Properties();
    property.load(fis);
    String url=property.getProperty("url");
    WebDriver driver=new EdgeDriver();
    driver.get(url);
    long time=Long.parseLong(property.getProperty("time"));
    System.out.println(time);
  }
}
