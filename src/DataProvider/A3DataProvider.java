package DataProvider;

import org.testng.annotations.DataProvider;

public class A3DataProvider {
   
	@DataProvider(name="dataprovider")
	public Object[][] sender(){
		Object[][] values=new Object[2][2];
		values[0][0]="razamd260@gmail.com";
		values[0][1]="razamd260@G";
		
		values[1][0]="alinoushad260@gmail.com";
		values[1][1]="alinoushad260@G";
		
		
		
		
		
		return values;
	}
}
