package TestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class FindBys_ {
	//In other words, it can be said that FindBys works with the AND operator, 
	//while FindAll works with the OR operator.
	
	/*
	 * @FindBys and @FindAll
     * The @FindBys annotation is used in case elements need to 
     * match all of the given criteria. 
     * The @FindAll annotation is used in case elements need to 
     * match at least one of the given criteria.
	 */
    WebDriver driver;
//    @FindAll({
//    	@FindBy(xpath="//span[text()='✕']"),
//    	@FindBy(xpath="//span[@role='button']")
//    	
//    })
//       public WebElement all;
    @FindAll({
    	//@FindBy(xpath="//span[text()='✕']"),
    	@FindBy(xpath="//a[text()='Become a Seller']")
    })
    public WebElement bys;
    
//    @FindBy(how=How.NAME,using = "//span[text()='X']")
//    private WebElement list;
    
    public FindBys_() { 
    	  driver=new ChromeDriver();
		PageFactory.initElements(driver, this);
   }
  
     @Test
     public void test01() {
    	
    	 driver.get("https://www.flipkart.com");
    	 driver.findElement(By.xpath("//span[text()='✕']")).click();
    	 driver.findElement(By.xpath("//a[text()='Become a Seller']")).click();
    	 //all.click();
    	//bys.click();
     
    	 
     }
   
      
      
      
}
