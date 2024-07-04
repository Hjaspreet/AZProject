package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePackage.BaseAZclass;

public class PomSignInClk extends BaseAZclass{
	
	//object repository
	
	@FindBy(id="nav-link-accountList-nav-line-1") WebElement SignIn;
	
	//initiate page elements
	//creating constructor
	public PomSignInClk() {
		PageFactory.initElements(driver, this);
		
		}
	
	
	public void SignInClick() {
		SignIn.click();
	} 

}
