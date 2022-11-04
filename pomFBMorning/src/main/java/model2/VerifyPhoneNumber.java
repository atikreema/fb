package model2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VerifyPhoneNumber extends BaseModel {
	
	public VerifyPhoneNumber(WebDriver driver) {
		
		super(driver);
	}
	
	public WebElement getVerifyNumber() throws InterruptedException {
		Thread.sleep(3000);
	//By locator=	By.xpath("//*[@jsname='wKtwcc']");
	// WebDriverWait wait=new WebDriverWait(driver,15);
     //wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	WebElement ph=	driver.findElement(By.xpath("//*[@jsname='wKtwcc']"));
	return ph;
	}

}
