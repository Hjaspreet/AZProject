package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePackage.BaseAZclass;

public class PomUpdateInfo extends BaseAZclass{
	@FindBy(id="NAME_BUTTON") WebElement NameEdit;
	@FindBy(id="EMAIL_BUTTON") WebElement EmailEdit;
	
	
	
	public PomUpdateInfo() {
		PageFactory.initElements(driver, this);
		
	}
	 public void editname() {
		 NameEdit.click();
	 }
  
}
