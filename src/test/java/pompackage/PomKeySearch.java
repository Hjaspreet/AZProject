package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePackage.BaseAZclass;

public class PomKeySearch extends BaseAZclass{
	
	@FindBy(id="twotabsearchtextbox")WebElement keywordSearch;
	@FindBy(id="nav-search-submit-button")WebElement searchbtn;
	@FindBy(id="nav-flyout-searchAjax") WebElement relatedsearch;
	@FindBy(css="#search > div.s-desktop-width-max.s-desktop-content.s-opposite-dir.s-wide-grid-style.sg-row > div.sg-col-20-of-24.s-matching-dir.sg-col-16-of-20.sg-col.sg-col-8-of-12.sg-col-12-of-16 > div > span.rush-component.s-latency-cf-section > div.s-main-slot.s-result-list.s-search-results.sg-row > div:nth-child(9) > div > div > div > div > span > div > div > div.s-product-image-container.aok-relative.s-text-center.s-image-overlay-grey.puis-image-overlay-grey.s-padding-left-small.s-padding-right-small.puis-spacing-small.s-height-equalized.puis.puis-vgvrqzb9qhw04209lhl7wx6b1b > div > span > a > div > img")WebElement tshirt;
	@FindBy(css="#landingImage")WebElement image;
	@FindBy(css="#corePriceDisplay_desktop_feature_div > div.a-section.a-spacing-none.aok-align-center.aok-relative > span.a-price.aok-align-center.reinventPricePriceToPayMargin.priceToPay > span:nth-child(2) > span.a-price-whole")WebElement price;
	
	//@FindBy(className="a-icon a-icon-star a-star-4-5 cm-cr-review-stars-spacing-big") WebElement rating;
	public PomKeySearch() {
		PageFactory.initElements(driver, this);
	}
	
	public void keywordsearch(String keyword) {
		keywordSearch.sendKeys(keyword);
		
	}
	
	public void search() {
		searchbtn.click();
	}
	public void rs() {
		relatedsearch.isEnabled();
	}
	public void tshirt() {
		tshirt.click();
	}
	public void image() {
		image.isEnabled();
		
	}
	public void price() {
		price.isEnabled();
		
	}
	//public void rating() {
		//rating.isEnabled();}
		
	
	
}
