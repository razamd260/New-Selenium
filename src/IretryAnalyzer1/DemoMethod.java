package IretryAnalyzer1;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class DemoMethod implements IRetryAnalyzer{

	private int max=5;
	private int count=1;
	@Override
	public boolean retry(ITestResult arg0) {
		if(max>count) {
			count++;
			return true;
		}
		else {
			return false;
		}
	}

	
	
}
