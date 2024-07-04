package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePackage.BaseAZclass;

public class PomDiffItem extends BaseAZclass{
	
	@FindBy(id="twotabsearchtextbox")WebElement type;
	@FindBy(id="nav-search-submit-button")WebElement searchbtn;
	@FindBy(css="#search > div.s-desktop-width-max.s-desktop-content.s-opposite-dir.s-wide-grid-style.sg-row > div.sg-col-20-of-24.s-matching-dir.sg-col-16-of-20.sg-col.sg-col-8-of-12.sg-col-12-of-16 > div > span.rush-component.s-latency-cf-section > div.s-main-slot.s-result-list.s-search-results.sg-row > div:nth-child(11) > div > div > span > div > div > div.s-product-image-container.aok-relative.s-text-center.s-image-overlay-grey.puis-image-overlay-grey.s-padding-left-small.s-padding-right-small.puis-spacing-small.s-height-equalized.puis.puis-vgvrqzb9qhw04209lhl7wx6b1b > div > span > a > div > img")WebElement tshirt;
	@FindBy(id="add-to-cart-button")WebElement addcart;
	@FindBy(css="#search > div.s-desktop-width-max.s-desktop-content.s-opposite-dir.s-wide-grid-style.sg-row > div.sg-col-20-of-24.s-matching-dir.sg-col-16-of-20.sg-col.sg-col-8-of-12.sg-col-12-of-16 > div > span.rush-component.s-latency-cf-section > div.s-main-slot.s-result-list.s-search-results.sg-row > div:nth-child(9) > div > div > div > div > span > div > div > div.s-product-image-container.aok-relative.s-text-center.s-image-overlay-grey.puis-image-overlay-grey.s-padding-left-small.s-padding-right-small.puis-spacing-small.s-height-equalized.puis.puis-vgvrqzb9qhw04209lhl7wx6b1b > div > span > a > div > img")WebElement mtshirt;
	@FindBy(id="nav-cart-count")WebElement cart;
	@FindBy(name="submit.delete.4b12b0ec-12c6-40bf-9cd6-51c4a0d64694")WebElement del;
	
	
public PomDiffItem() {
	PageFactory.initElements(driver, this);
}


public void type(String Fshirt) {
	type.sendKeys(Fshirt);
}
	public void search() {
		searchbtn.click();
	}
	public void tshirt() {
		tshirt.click();
	}
	public void addcart() {
		addcart.click();
	}
	public void typediff(String Mshirt) {
		type.sendKeys(Mshirt);
	}
	public void msearch() {
		searchbtn.click();
		
	}
	public void mtshirt() {
		mtshirt.click();
		
	}
	public void maddcart() {
		addcart.click();
	}
	public void cart() {
		cart.click();
	}
	public void remove() {
		del.click();
	}
}
