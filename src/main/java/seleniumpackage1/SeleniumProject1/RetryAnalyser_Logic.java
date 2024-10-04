package seleniumpackage1.SeleniumProject1;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyser_Logic implements IRetryAnalyzer
{
     int Current_Count=0;
     int No_Of_Retry=1;
	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		if(Current_Count<No_Of_Retry)
		{ 
			Current_Count++;
		return true;
		
	}
	return false;
}
}

