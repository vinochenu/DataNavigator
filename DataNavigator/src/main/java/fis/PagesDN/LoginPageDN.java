package fis.PagesDN;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageDN {
	
	WebDriver driver;
	
	public LoginPageDN(WebDriver driver1) {
		this.driver=driver1;
	}

	@FindBy(how=How.NAME,using="userId")
	WebElement UserID;
	
	@FindBy(how=How.NAME,using="password")
	WebElement Password;
	
	@FindBy(how=How.NAME,using="action")
	WebElement Login;
	
	
	
	public void loginPageDN(String username,String password) {
	
		try {
			
			UserID.sendKeys(username);	
			Password.sendKeys(password);
			Login.click();
			
		} catch (Exception e) {
			
			e.printStackTrace();
			System.out.println("Issue with Login Please check the credential or login related issues");
		}
	
		
		
	}
}
