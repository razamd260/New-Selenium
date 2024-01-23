package InterviewerFav;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Myntra3 {
    public static void main(String[] args) throws EncryptedDocumentException, IOException {
    	FileInputStream fis=new FileInputStream("G:\\Selenium\\src\\InterviewerFav\\Myntra.xlsx");
    	Workbook wb=WorkbookFactory.create(fis);
    	Sheet s=wb.getSheet("Sheet2");
    	WebDriverManager.chromedriver().setup();
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		String version=option.getBrowserVersion();
		System.out.println(version);
		//option.addArguments("start-maximized");
		WebDriver driver=new ChromeDriver(option);
		driver.get("https://www.myntra.com");
		String parentID=driver.getWindowHandle();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement men=driver.findElement(By.xpath("//a[@data-group=\"men\"]"));
		Actions action=new Actions(driver);
		action.moveToElement(men).perform();
		List<WebElement> list=driver.findElements(By.xpath("//ul[@class=\"desktop-navBlock\"]/li"));
		int i=0;
		int count=0;
		for(WebElement e:list) {
			Row r=s.getRow(i++);
			Cell c=r.getCell(0);
		  if(e.getText().equals(c.getStringCellValue())) {
			  count++;
		  }
			
		}
		if(count==354) {
			System.out.println("No Missing SubModule");
		}
		FileOutputStream out=new FileOutputStream("G:\\Selenium\\src\\InterviewerFav\\Myntra.xlsx");
		wb.write(out);
	}
}
