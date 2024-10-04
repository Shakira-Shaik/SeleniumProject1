package seleniumpackage1.SeleniumProject1;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login_To_Amazon_test extends LaunchAndQuit    
{
 
@Test(retryAnalyzer=RetryAnalyser_Logic.class) 
public void Login()   
{     
  Amz_Homepage a1=new Amz_Homepage(driver);    
	 a1.AccountAndList(driver); 
	  a1.SignInClick(); 
    Amz_Loginpage a2=new Amz_Loginpage(driver);
	    a2.EmailId();
	    a2.ContButton();
	    a2.Password(); 
	    a2.login();  
 	Assert.assertEquals(driver.getTitle(), "Amazon_login","sorry");     
}
 
	      
  }
		


