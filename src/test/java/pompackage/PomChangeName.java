package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePackage.BaseAZclass;

public class PomChangeName extends BaseAZclass{
	@FindBy(id="ap_customer_name") WebElement changename;
	@FindBy(id="cnep_1C_submit_button") WebElement savename;
	
	
	public PomChangeName() {
		PageFactory.initElements(driver, this);
	}
	public void namecahnge(String newname) {
		changename.sendKeys(newname);}
		
		public void savename() {
			savename.click();
			
		}
		
	}

