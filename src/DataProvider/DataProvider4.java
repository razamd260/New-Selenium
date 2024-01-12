package DataProvider;

import org.testng.annotations.DataProvider;

public class DataProvider4 {

	@DataProvider(name="dataProvider")
	public Object[][] sender(){
		Object[][] values=new Object[2][2];
		values[0][0]="razamd260@gmail.com";
		values[0][1]="razamd260";
		
		values[1][0]="alinoushad260@gmail.com";
		values[1][1]="alinoushad";
		
		return values;
	}
	
}
