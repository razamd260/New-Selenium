package DataProvider;

import org.testng.annotations.DataProvider;

public class DataProvider5 {
    @DataProvider(name="dataProvider" ,parallel=true)
	public Object[][] sender() {
		Object[][] value=new Object[2][2];
		value[0][0]="salman";
		value[0][1]="Khan";
		
		value[1][0]="Amir Khan";
		value[1][1]="Son";
		
		return value;
	}
}
