package seleniumpackage1.SeleniumProject1;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
@Listeners(Listener_logic.class)
public class LaunchAndQuit extends Listener_logic   
{ 
  	//WebDriver driver;
	@BeforeMethod
	public void launch() 
	{ 
		 driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
	}
	@AfterMethod
	public void logout() 
	{
		/* TakesScreenshot T1= (TakesScreenshot) driver; //upcasting explicitly
			File source=T1.getScreenshotAs(OutputType.FILE);
		   File Destination=new File("H:\\Users\\shaki\\Desktop\\AB44\\Screenshot"+Math.random()+".png");
		   FileHandler.copy(source, Destination); 
		Thread.sleep(3000);
		driver.quit(); //we use driver in this method because it declared as global*/
		
	}
}
