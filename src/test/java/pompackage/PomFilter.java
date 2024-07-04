package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePackage.BaseAZclass;

public class PomFilter extends BaseAZclass{
	@FindBy(css="#p_123\\/393482 > span > a > div > label > i")WebElement filter;


public PomFilter() {
	PageFactory.initElements(driver, this);
}

public void filteration() {
	filter.click();
}
//public String verify() {

	//return driver.getPageSource();
}
	

