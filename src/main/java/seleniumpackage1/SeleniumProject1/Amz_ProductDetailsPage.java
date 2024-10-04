package seleniumpackage1.SeleniumProject1;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amz_ProductDetailsPage  
{
	WebDriver driver;
 @FindBy(xpath="//span[@class='a-size-base-plus a-color-base a-text-normal']")
 WebElement Product;
 @FindBy(xpath="//div[@id='averageCustomerReviews']")  
  WebElement Review;
 @FindBy(xpath="//div[@id='corePriceDisplay_desktop_feature_div']")
 WebElement Price;
 @FindBy(xpath="//h3[.=' Product details ']")
 WebElement ProductDetails;
 @FindBy(xpath="(//h3[@class='product-facts-title'])[2]")
 WebElement AboutProduct;
 @FindBy(xpath="//div[@id='productDescription_feature_div']")
 WebElement ProductDescription;
 
/*public void Review()
{
  boolean R=Review.isDisplayed();
  System.out.println("Review of the product is displayed"+ R); 
 }
public void Price()
{
	boolean P=Price.isDisplayed();
	System.out.println("Price of the product is displayed"+ P);  
}
public void ProductDescription()
{
    boolean PD=ProductDescription.isDisplayed();
    System.out.println("Product Description is displayed"+ PD);
}
public void ProductDetails() 
{
    boolean D=ProductDescription.isDisplayed();
    System.out.println("Product Description is displayed"+ D);
}
public void AboutProduct() 
{
    boolean A=ProductDescription.isDisplayed();
    System.out.println("Product Description is displayed"+ A); 
}*/
 public void Product_click() 
 {
	 Product.click();
	 Set <String> S1=  driver.getWindowHandles(); 
	 Iterator <String> i1=S1.iterator();
	 String parentid=			i1.next();
		String 	childid=	i1.next();
       System.out.println(parentid);
       System.out.println(childid);
       driver.switchTo().window(childid);
 }
  public void Product_Information()
 {
	 
	if(Review.isDisplayed()&& Price.isDisplayed()&&ProductDetails.isDisplayed()&&AboutProduct.isDisplayed()&&ProductDescription.isDisplayed())
	{
		System.out.println("All necessary information displayed on the product detail page");
	}
	else
	{
		System.out.println("Sorry");
	}
 }
  public  Amz_ProductDetailsPage (WebDriver driver)   
  {
	   PageFactory.initElements(driver, this); 

  }
}
