package IretryAnalyzer1;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class ITestListener implements IRetryAnalyzer {
  
	private int retrycount=0;
	private static int max=5;
	@Override
	public boolean retry(ITestResult arg0) {
		if(retrycount<max) {
			retrycount++;
			return true;
		}
		return false;
	}

}
