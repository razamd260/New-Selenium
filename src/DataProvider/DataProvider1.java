package DataProvider;

import org.testng.annotations.DataProvider;

public class DataProvider1 {
  
	@DataProvider(name="dataProvider")
	public Object[] sender() {
		Object[] values=new Object[2];
		
		values[0]="salman";
		
		values[1]="shahrukh kahan";
		return values;
	}
}
