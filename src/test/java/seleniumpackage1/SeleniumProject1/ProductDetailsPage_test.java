package seleniumpackage1.SeleniumProject1;
import org.testng.annotations.Test;

public class ProductDetailsPage_test extends LaunchAndQuit
{
@Test
public void Amazon_ProductInfo() throws InterruptedException
{
	Amz_SearchPage S=new Amz_SearchPage(driver);    
	S.Search();  
Amz_ProductDetailsPage P=new Amz_ProductDetailsPage(driver);  
    P.Product_click();
	P.Product_Information();  
	}
}
