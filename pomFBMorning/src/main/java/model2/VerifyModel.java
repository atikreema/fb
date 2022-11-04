package model2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VerifyModel extends BaseModel {
	public VerifyModel(WebDriver driver) {
		
		super(driver);
	}
	
	  public WebElement getPhoneNumber() throws InterruptedException {
		  Thread.sleep(3000);
    // By locator=By.xpath("//input[@id='phoneNumberId']");
     // WebDriverWait wait=new WebDriverWait(driver,15);
   //wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	 WebElement phone=driver.findElement(By.xpath("//input[@id='phoneNumberId']"));
	 
		return phone;
	}
	  
	
	public WebElement getNextPage() {
	WebElement np=driver.findElement(By.xpath("//*[text()='Next']"));
		return np;
		}

}
