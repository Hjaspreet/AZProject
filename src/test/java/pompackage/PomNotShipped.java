package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePackage.BaseAZclass;

public class PomNotShipped extends BaseAZclass{
	@FindBy(className="a-link-normal")WebElement notshipped;
	

	
	public PomNotShipped() {
		PageFactory.initElements(driver, this);
	}
	
	public void notshipped() {
		notshipped.click();
	}
}
