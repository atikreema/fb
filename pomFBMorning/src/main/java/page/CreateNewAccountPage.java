package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import model.CreateNewAccountModel;

public class CreateNewAccountPage extends CreateNewAccountModel {
	
	public CreateNewAccountPage(WebDriver driver) {
		
		super(driver);
	}
	
	public void typeFirstName(String name) throws InterruptedException {
	WebElement e= getfirstname();
	e.sendKeys(name);
		
	}
	public void typeLastName(String name) throws InterruptedException {
     WebElement  l=getlastname();
     l.sendKeys(name);
	}
	public void typeEmail(String email) throws InterruptedException {
   WebElement em=getemail();
    em.sendKeys(email);
	}
	public void typePass(String pass) throws InterruptedException {
	WebElement p=getpass();
	p.sendKeys(pass);
	}
	
	public void selectMonth(String month) throws InterruptedException {
	 WebElement mo=	getmonth();
	 Select s=new Select(mo);
	 s.selectByVisibleText(month);
	}
	 public void selectDay(String day) throws InterruptedException {
	WebElement da=	 getday();
	 Select s=new Select(da);
	 s.selectByVisibleText(day);
	
	 }
	 public void selectYear(String year) throws InterruptedException {
			WebElement y=	 getyear();
			 Select s=new Select(y);
			 s.selectByVisibleText(year);
			
}
	 public void selectGender(String gen) throws InterruptedException {
			WebElement gender=getgender( gen);
			gender.click();
	 }
}

