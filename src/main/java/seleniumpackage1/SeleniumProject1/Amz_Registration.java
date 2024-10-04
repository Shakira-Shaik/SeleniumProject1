package seleniumpackage1.SeleniumProject1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
@Listeners(Listener_logic.class)
public class Amz_Registration extends Listener_logic
{    
	//WebDriver driver; 
	@FindBy(xpath="//span[@id='nav-link-accountList-nav-line-1']")
	WebElement Account_List;
	@FindBy(linkText="Start here.") 
	WebElement CreateAC; 
	@FindBy(name="customerName")
	WebElement CName;
	@FindBy(id="ap_phone_number") 
	WebElement PhNumber;
	@FindBy(name="password") 
	WebElement Password;  
	@FindBy(id="continue") 
	WebElement Verify;
	public void  AccountAndList(WebDriver driver) 
	{
		Actions a1=new Actions(driver);  //Hoverover
//if you r using driver inside the hoverover then the driver should be in the method as a prameter(i.e parameterized)
	     a1.moveToElement(Account_List).perform();  
	}
	public void Create_Account()
	{
		CreateAC.click();
	}
	public void Username()
	{
		CName.sendKeys("Swati"); 
	}
	public void MobileNum(String MNum) 
	{
		PhNumber.sendKeys(MNum);  
	}
	public void Password(String Pass)  
	{
		Password.sendKeys(Pass);    
	}
	public void VerifyMobileNum()
	{
		Verify.click();
	}
	 public  Amz_Registration (WebDriver driver) 
	   {
		   PageFactory.initElements(driver, this); 
	 //if you are using driver inside the method  then the same driver must be written in the method as parameter(i.e parameterized)  
	   }
	
}