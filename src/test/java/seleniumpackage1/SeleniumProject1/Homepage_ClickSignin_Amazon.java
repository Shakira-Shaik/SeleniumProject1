package seleniumpackage1.SeleniumProject1; 
import org.testng.annotations.Test;

public class Homepage_ClickSignin_Amazon extends LaunchAndQuit 
{
 @Test       //ctl+shift+O to import testng          
 public void Create_New_Account()   
 {  
	 Amz_Homepage a1=new Amz_Homepage(driver); 
	 a1.AccountAndList(driver);
	  a1.SignInClick(); 
 
	 
} 
 


}
