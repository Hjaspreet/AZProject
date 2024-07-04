package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePackage.BaseAZclass;

public class PomAddAddress extends BaseAZclass{
@FindBy(css="#ya-myab-address-add-link > div")WebElement addaddress;

public PomAddAddress() {
	
	PageFactory.initElements(driver, this);
}

public void addaddress() {
	addaddress.click();
}
}
