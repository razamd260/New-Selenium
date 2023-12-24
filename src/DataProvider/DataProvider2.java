package DataProvider;

import org.testng.annotations.DataProvider;

public class DataProvider2 {

	@DataProvider(name = "dataProvider")
	public Object[][] sender() {
		Object[][] values = new Object[2][4];
        values[0][0]="1";
		values[0][1] = "https://www.google.com/";
        values[0][2]="salman";
        values[0][3]=null;
        
        values[1][0]="2";
        values[1][1]="https://www.facebook.com";
        values[1][2]="razamd260@gmail.com";
        values[1][3]="razamd260@G";
       
		return values;
	}
}
