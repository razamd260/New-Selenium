package DataProvider;

import org.testng.annotations.DataProvider;

public class DataProvider3 {

	@DataProvider(name="dataProvider")
	public Object[][] sender() {
		Object[][] values=new Object[2][3];
		
		values[0][0]="https://www.google.com";
		values[0][1]="salman khan";
		values[0][2]="";
		
		values[1][0]="https://www.facebook.com";
		values[1][1]="razamd260@gamil.com";
		values[1][2]="razamd260@G";
		
		return values;
	}
	
}
