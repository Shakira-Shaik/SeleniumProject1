package seleniumpackage1.SeleniumProject1;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Listener_logic.class)
public class Registration_test extends LaunchAndQuit 
{
@Test(dataProvider="inputs")  
public void New_User(String MNum,String Pass)   
{
	Amz_Registration R=new Amz_Registration(driver); 
	R.AccountAndList(driver);
    R.Create_Account(); 
	R.Username();
	R.MobileNum(MNum);  
	R.Password(Pass);  
	R.VerifyMobileNum(); 
	
}
@DataProvider(name="inputs")
public Object[][] method1() throws EncryptedDocumentException, IOException   
{
	  FileInputStream f1=new FileInputStream("H:\\Users\\shaki\\eclipse-workspace\\SeleniumProject1\\DataFetching1\\Shakira1.xlsx");
	    Workbook w1 = WorkbookFactory.create(f1);
	    String MN=NumberToTextConverter.toText(w1.getSheet("Login_details").getRow(1).getCell(0).getNumericCellValue());
	   // System.out.println(UN); 
	    String Pwd=w1.getSheet("Login_details").getRow(1).getCell(1).getStringCellValue();
	    //System.out.println(Pwd);
	//    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    String MN1=NumberToTextConverter.toText(w1.getSheet("Login_details").getRow(2).getCell(0).getNumericCellValue());
	     String Pwd1=w1.getSheet("Login_details").getRow(2).getCell(1).getStringCellValue();
	     Object[][]d2=new Object[2][2];
	      // 2rows 2 columns  
			//1st row
			d2[0][0]=MN;   
			d2[0][1]=Pwd; 
			//2nd row 
			d2[1][0]= MN1; 
			d2[1][1]=Pwd1; 
			 
			return d2;		
}		
	      
}

