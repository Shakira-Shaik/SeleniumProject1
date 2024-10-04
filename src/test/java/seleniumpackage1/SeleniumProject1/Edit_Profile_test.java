package seleniumpackage1.SeleniumProject1;

import org.testng.annotations.Test;

public class Edit_Profile_test extends LaunchAndQuit 
{ 
	
@Test
public void Edit_Profile() 
{
	Amz_Homepage a1=new Amz_Homepage(driver); 
	 a1.AccountAndList(driver); 
	  a1.SignInClick(); 
   Amz_Loginpage a2=new Amz_Loginpage(driver);
	    a2.EmailId();
	    a2.ContButton();
	    a2.Password(); 
	    a2.login();    
	Amz_Edit_Profile P= new Amz_Edit_Profile(driver);  
	P.Account_List(driver);
	P.Account_Click();
	P.Edit();
	P.Edit_name();
	P.Change();
	P.Save_Change();
	
	
	
}
}
