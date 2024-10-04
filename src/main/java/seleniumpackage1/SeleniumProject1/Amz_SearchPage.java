package seleniumpackage1.SeleniumProject1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Amz_SearchPage 
{
   WebDriver driver;
   @FindBy(id="twotabsearchtextbox")
   WebElement Search;
   @FindBy(linkText="Boys' Casual Shoes")
   WebElement Category;
   @FindBy(id="s-result-sort-select")
   WebElement Price;
   
  public void Search()
  {
	  Search.sendKeys("Shoe"+Keys.ENTER);  
  }
  public void Search_category()
  {
	  Category.click();  
  }
  public void Seach_Price()
  {
    Select S1=new Select(Price);
    S1.selectByIndex(1);
  }
  public  Amz_SearchPage (WebDriver driver)  
  {
	   PageFactory.initElements(driver, this);  
  }
}
