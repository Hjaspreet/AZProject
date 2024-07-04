package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePackage.BaseAZclass;

public class PomPassw extends BaseAZclass{
	
	@FindBy(id="ap_password") WebElement password;
	@FindBy(name="rememberMe") WebElement keepme;
	@FindBy(id="signInSubmit") WebElement signin;
	
	public PomPassw() {
		
		PageFactory.initElements(driver, this);
	
	}
	
	public void pass(String pssword) {
		
		password.sendKeys("password");
	}
	
	public void keep() {
		keepme.click();
	}
    
	public void signinbtn() {
		signin.click();
	}
}
