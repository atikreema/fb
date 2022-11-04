package test;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import lib.ExcelReader;

public class CreateNewAccountPageTest extends BaseTest {
	
	@Test(dataProvider="person")
	public void createNewAccountPageTest(String firstname,String lastname,String email,String pass,String month,String day,String year,String gender) throws InterruptedException {
		
		getHomePage();
		hp.clickAccount();
		
		
		getCreateNewAccountPage();
		cnap.typeFirstName(firstname);
		cnap.typeLastName(lastname);
		cnap.typeEmail(email);
		cnap.typePass(pass);
		cnap.selectMonth(month);
		cnap.selectDay(day);
		cnap.selectYear(year);
		cnap.selectGender(gender);
		
		
	}
	
	@DataProvider(name="person")
	
	public Object[][]getData() throws IOException {
		
		Object[][] t;
		
		String filename="data/Sample.xls";
		String sheetname="person1";
		ExcelReader er=new ExcelReader(filename,sheetname);
	     t=	er.excelToArray();
	     return t;
		
				
		
	}
	

}
