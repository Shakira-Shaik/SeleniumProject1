package seleniumpackage1.SeleniumProject1;

import org.testng.annotations.Test; 

public class SearchPage_test extends LaunchAndQuit 
{
@Test
public void Search_Product()
{
	Amz_SearchPage S=new Amz_SearchPage(driver);    
	S.Search();  
	S.Search_category();
	S.Seach_Price();
}   
}
