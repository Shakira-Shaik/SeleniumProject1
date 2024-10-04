package seleniumpackage1.SeleniumProject1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener_logic implements ITestListener  
{
	static WebDriver driver; 
	@Override
	public void onTestStart(ITestResult result) {   //right click-->source-->override implemented methods
		// TODO Auto-generated method stub 
		ITestListener.super.onTestStart(result); 
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSuccess(result);
		Reporter.log("Test case passed"); 
		TakesScreenshot T1= (TakesScreenshot) driver;
		File source=T1.getScreenshotAs(OutputType.FILE); 
		File Destination=new File("H:\\Users\\shaki\\Desktop\\AB44\\Pass Testcase\\Amazonscreenshot"+Math.random()+".png");
		try {
			FileHandler.copy(source, Destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); 
		} 
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailure(result);
		Reporter.log("Test case failed");
		TakesScreenshot T1= (TakesScreenshot) driver;
		File source=T1.getScreenshotAs(OutputType.FILE); 
		File Destination=new File("H:\\Users\\shaki\\Desktop\\AB44\\Fail Testcase\\Amazonscreenshot"+Math.random()+".png");
		try {
			FileHandler.copy(source, Destination); 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
	}

	@Override 
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) { 
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
	}
   
}
