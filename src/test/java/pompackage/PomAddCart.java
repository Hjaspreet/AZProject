package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import BasePackage.BaseAZclass;

public class PomAddCart extends BaseAZclass{
	@FindBy(id="add-to-cart-button")WebElement AddCart;
	@FindBy(id="quantity")WebElement IncQty;
	public PomAddCart() {
		PageFactory.initElements(driver, this);
	}
	
	public void addcart() {
		AddCart.click();
	}
   public void qty() {
	   Select obj= new Select(IncQty);
	   obj.selectByVisibleText("2");
   }
}
