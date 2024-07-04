package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import BasePackage.BaseAZclass;

public class PomSort extends BaseAZclass{
	
	@FindBy(id="s-result-sort-select")WebElement sort;

	
public PomSort() {
	PageFactory.initElements(driver, this);
}
public void sorting() {
	
	Select obj= new Select(sort);
	obj.selectByVisibleText("Price: Low to high");
}
	
}
