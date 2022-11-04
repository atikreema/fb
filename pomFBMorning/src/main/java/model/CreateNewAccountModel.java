package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateNewAccountModel extends BaseModel {
	
	public CreateNewAccountModel(WebDriver driver) {
		
		super(driver);
	}
	
	public WebElement getfirstname() throws InterruptedException {
		//Thread.sleep(3000);
	By locator=	By.xpath("//input[@name='firstname']");
	WebDriverWait wait=new WebDriverWait(driver,10);
	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	WebElement first=driver.findElement(locator);
	return first;
	}
	
	public WebElement getlastname() throws InterruptedException {
		WebElement last=driver.findElement(By.xpath("//input[@name='lastname']"));
		return last;
	}
	
		public WebElement getemail() throws InterruptedException {
		WebElement email=driver.findElement(By.xpath("//input[@name='reg_email__']"));
		return email;
	}

		public WebElement getpass() throws InterruptedException {
		WebElement pass=driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		return pass;
	}
		
		public WebElement getmonth() throws InterruptedException {
			WebElement m=driver.findElement(By.xpath("//select[@id='month']"));
			return m;
		}

		public WebElement getday() throws InterruptedException {
			WebElement d=driver.findElement(By.xpath("//select[@id='day']"));
			return d;
		}
		public WebElement getyear() throws InterruptedException {
			WebElement y=driver.findElement(By.xpath("//select[@id='year']"));
			return y;
		}
		public WebElement getgender(String gen) throws InterruptedException {
			WebElement g=driver.findElement(By.xpath("(//label[text()='"+gen+"']/following-sibling::input"));
			return g;
		}


}
