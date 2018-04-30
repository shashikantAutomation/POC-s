package test.test1;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class listener implements IRetryAnalyzer {

	int count=0, retry=2;
	
	
	
	@Override
	public boolean retry(ITestResult resulttest) {

		System.out.println(resulttest.getStatus());	
		if(count<retry)
		{			
			count++;	
			return true;
		
		}
		return false;
		
	
	}
	
	

	
}
