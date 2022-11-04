package page2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import model2.VerifyModel;

public class VerifyPage extends VerifyModel {
	
	public VerifyPage (WebDriver driver) {
		super(driver);
	}
	
	public void typePhoneNumber(String phone) throws InterruptedException {
	   WebElement nub=getPhoneNumber();
	   nub.sendKeys(phone);
	}
	
	    public void clickOn() {
		WebElement e=getNextPage();
	    Actions act = new Actions(driver);
	    act.click(e);
		act.perform();
	}
	
	
	
//run it and show me where is the problem?
}
