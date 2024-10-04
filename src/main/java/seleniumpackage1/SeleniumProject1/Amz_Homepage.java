package seleniumpackage1.SeleniumProject1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amz_Homepage 
{
	WebDriver driver;
	//step1
		@FindBy(xpath="//span[@id='nav-link-accountList-nav-line-1']")
		WebElement Account_List;
		@FindBy(xpath="//span[.='Sign in']") 
		WebElement Sign_In; 
    //step2
		public void  AccountAndList(WebDriver driver) 
		{
			Actions a1=new Actions(driver);  //Hoverover
	//if you r using driver inside the hoverover then the driver should be in the method as a prameter(i.e parameterized)
		     a1.moveToElement(Account_List).perform(); 
		}
		public void SignInClick()
		{
			Sign_In.click();
		}
	//Step3
	   public  Amz_Homepage(WebDriver driver)
	   {
		   PageFactory.initElements(driver, this); 
	 //if you are using driver inside the method  then the same driver must be written in the method as parameter(i.e parameterized)  
	   }
}	
		


