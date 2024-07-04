package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePackage.BaseAZclass;

public class PomCancelOr  extends BaseAZclass{
	
	@FindBy(css="#CardInstanceDBCpmLRKiOS8MCPgrMVoRg > div > div:nth-child(3) > ul > li:nth-child(5)")WebElement cancelorder;
	
	
	public PomCancelOr() {
		PageFactory.initElements(driver, this);}
		
		public void cancelorder() {
			cancelorder.click();
		}
	}


