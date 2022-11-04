package page2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import model2.NewAccountModel;

public class NewAccountPage extends NewAccountModel {
	public NewAccountPage(WebDriver driver) {
		super(driver);
	}
	
	public void typeFirstName(String name) throws InterruptedException {
     WebElement fn=	getFirstName();
         fn.sendKeys(name);
	}
	public void typeLastName(String name) throws InterruptedException {
		WebElement ln=getLastName();
		ln.sendKeys(name);
	}
	public void typeEmail(String email) {
		WebElement em=getEmail();
		em.sendKeys(email);
	}
	public void typePassword(String pass) {
		WebElement p=getPass();
		p.sendKeys(pass);
	}
	public void typeConfirmPassword(String confirmpass) {
		WebElement tcp=getConfirmPass();
		tcp.sendKeys(confirmpass);
		
		
	}
	public void clickBox() {
		WebElement cl=getCheckbox();
		cl.click();
	}
	public void clickNext() {
     WebElement c=getNext();
       c.click();
	}

}
