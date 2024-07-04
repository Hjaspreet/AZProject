package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePackage.BaseAZclass;

public class PomSignPage extends BaseAZclass
{
	@FindBy(id="nav-link-accountList-nav-line-1") WebElement signmsg;
	
	
	public PomSignPage() {
		
		PageFactory.initElements(driver, this);
	}
     
	public void signInMsg() {
		signmsg.isEnabled();
	}
	public void signMsgClk() {
		signmsg.click();
	}
	
}
