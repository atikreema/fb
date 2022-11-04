package model2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewAccountModel  extends BaseModel{
	
public NewAccountModel(WebDriver driver) {
	super(driver);
}
   
        public WebElement getFirstName() throws InterruptedException {
        	
      //  By locator=	By.xpath("//input[@name='firstName']")	;
     //   WebDriverWait wait=new WebDriverWait(driver,15);
    //     wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        WebElement first=driver.findElement(By.xpath("//input[@name='firstName']"));
	    return first;
	    
 }
      
         public WebElement getLastName() throws InterruptedException {
        	 Thread.sleep(3000);
	     WebElement last=driver.findElement(By.xpath("//input[@name='lastName']"));
	     return last;
 }
         public WebElement getEmail() {
    	 WebElement email=driver.findElement(By.xpath("//input[@id='username']"));
    	 return email;
}
    	 public WebElement getPass() {
    	 WebElement pas=driver.findElement(By.xpath("//input[@type='password']"));
    	 return pas;
}

    	 public WebElement getConfirmPass() {
    	 WebElement confirm=driver.findElement(By.xpath("//input[@name='ConfirmPasswd']"));
    	 return confirm;
    		 }
    		  
    	 public WebElement getCheckbox() {
    	 WebElement box=driver.findElement(By.xpath("//input[@type='checkbox']"));
    	 return box;
    		 }
    	 public WebElement getNext() {
    		 WebElement n=driver.findElement(By.xpath("//span[text()='Next']"));
    		 return n;
    	 }
}
