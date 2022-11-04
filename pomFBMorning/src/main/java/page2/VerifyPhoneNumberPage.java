package page2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import model2.VerifyPhoneNumber;

public class VerifyPhoneNumberPage extends  VerifyPhoneNumber {
	
	public VerifyPhoneNumberPage(WebDriver driver) {
		 super(driver);
		
	}
	public String getVerifyPhone() throws InterruptedException {
	 WebElement e=	getVerifyNumber();
     String actual=	  e.getText();
     return actual;
	}

}
