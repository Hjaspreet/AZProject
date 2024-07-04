package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePackage.BaseAZclass;

public class PomAddress extends BaseAZclass{
	@FindBy(css="#a-page > div.a-container > div > div:nth-child(3) > div:nth-child(1) > a > div > div > div > div.a-column.a-span3 > img")WebElement yourAddress;

	
	 public PomAddress () {
	    	PageFactory.initElements(driver, this);    }
	    
	    
	    public void yourAdd() {
	    	yourAddress.click();
	    }
}
