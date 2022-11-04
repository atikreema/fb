package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import model.HomeModel;

public class HomePage extends HomeModel {
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	public void clickAccount() {
    WebElement e=createButton();
              e.click();
		
	}

}
