package seleniumpackage1.SeleniumProject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amz_Loginpage 
{
	WebDriver driver; 
	@FindBy(name="email")
	WebElement Email;
	@FindBy(id="continue")
	WebElement Continue;
	@FindBy(name="password")
	WebElement Password; 
	@FindBy(id="signInSubmit")
	WebElement SignIn; 
 public void EmailId() 
 {
	 Email.sendKeys("shakira.shaik@outlook.com"); 
	 }
 public void ContButton()
 {
	 Continue.click();
 }
 public void Password()  
 {
	 Password.sendKeys("Amzpwd@10138789");   
 }
 public void login()
 {
	 SignIn.click();
 }
 public Amz_Loginpage(WebDriver driver) 
 {
 	PageFactory.initElements(driver, this);   
 }
}
