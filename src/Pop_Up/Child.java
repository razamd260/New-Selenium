package Pop_Up;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Child {
	public static void main(String[] args) {
   WebDriver driver=new EdgeDriver();
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
   driver.get("https://www.irctc.com/board-of-directors.html");
   List<WebElement> list=driver.findElements(By.xpath("//td[@data-title=\"Name\"]"));
		   for(WebElement e:list) {
			   System.out.println(e.getText());
		   }
	}
}
////td[@data-title="Name"]