package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePackage.BaseAZclass;

public class PomEmail extends BaseAZclass {
	
	@FindBy(id="ap_email") WebElement email;
	@FindBy(id="continue") WebElement continuebtn;


public PomEmail() {
	PageFactory.initElements(driver, this);
	
	}

public void typeEmail(String emailid) {
	email.sendKeys(emailid);
}

public void continuebtn() {
	continuebtn.click();
}


}