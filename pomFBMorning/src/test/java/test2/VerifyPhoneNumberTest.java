package test2;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import lib.ExcelReader;

public class VerifyPhoneNumberTest extends BaseTest {
	


		
		@Test(dataProvider="person")
		
		public void VerifyNumber(String firstname,String lastname,String email,String pass,String confirmpass,String phone) throws InterruptedException {
			 getAccountPage() ;
			 
			 nap.typeFirstName(firstname);
			 nap.typeLastName(lastname);
			 nap.typeEmail(email);
			 nap.typePassword(pass);
			 nap.typeConfirmPassword(confirmpass);
			 nap.clickBox();
			 nap.clickNext();
			 
			  getVerifyPage();
			  vp.typePhoneNumber(phone);
			  vp.clickOn();
			  
		 getVerifyPhoneNumberPage();
		 String actual=	vpn.getVerifyPhone();
		 String expected= phone;
		 Assert.assertEquals(actual, expected);
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


