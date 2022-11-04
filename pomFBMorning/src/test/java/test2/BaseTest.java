package test2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

import page2.NewAccountPage;
import page2.VerifyPage;
import page2.VerifyPhoneNumberPage;

public class BaseTest {
	
	
	static WebDriver driver;
	static NewAccountPage nap;
	static VerifyPage vp;
	static VerifyPhoneNumberPage vpn;
	@BeforeSuite
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://accounts.google.com/signup");
		
	}
	public void getAccountPage() {
	nap=new NewAccountPage(driver);
		
	}
	public void getVerifyPage() {
	vp=new VerifyPage(driver);
	}
	public void getVerifyPhoneNumberPage() {
		vpn=new VerifyPhoneNumberPage(driver);
	}

}
