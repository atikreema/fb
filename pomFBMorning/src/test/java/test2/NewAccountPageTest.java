package test2;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import lib.ExcelReader;

public class NewAccountPageTest extends BaseTest {
	
	@Test(dataProvider="person")
	
	public void NewAccountPageTest(String firstname,String lastname,String email,String pass,String confirmpass) throws InterruptedException {
		 getAccountPage() ;
		 
		 nap.typeFirstName(firstname);
		 nap.typeLastName(lastname);
		 nap.typeEmail(email);
		 nap.typePassword(pass);
		 nap.typeConfirmPassword(confirmpass);
		 nap.clickBox();
		 nap.clickNext();
		 
	}
	
	@DataProvider(name="person")
	public Object[][] getdata() throws IOException{
		Object[][] t;
		String filename="data/Sample.xls";
		String sheetname="Sheet2";
		ExcelReader er= new ExcelReader(filename,sheetname);
	   t=er.excelToArray();
	    return t;  
	}

}
