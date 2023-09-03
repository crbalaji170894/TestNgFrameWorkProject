package testng;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {
	int min = 0;
	int max = 10;
	
	//failed till max count

	@Override
	public boolean retry(ITestResult result) {

		if (min <= max) {  
			
			min++;			
			return true;
		}

		return false;
	}

}
