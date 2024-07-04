package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePackage.BaseAZclass;

public class PomLoginSc extends BaseAZclass{
	
	@FindBy(css="#a-page > div.a-container > div > div:nth-child(2) > div:nth-child(2) > a")WebElement LoginSc;
	
	public void PomLogicSc() {
		PageFactory.initElements(driver, this);
		
		
	}
	
	public void Login() {
		LoginSc.click();
		
	}

}
