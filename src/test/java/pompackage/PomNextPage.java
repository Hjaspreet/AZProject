package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePackage.BaseAZclass;

public class PomNextPage extends BaseAZclass{
	@FindBy(css="#search > div.s-desktop-width-max.s-desktop-content.s-opposite-dir.s-wide-grid-style.sg-row > div.sg-col-20-of-24.s-matching-dir.sg-col-16-of-20.sg-col.sg-col-8-of-12.sg-col-12-of-16 > div > span.rush-component.s-latency-cf-section > div.s-main-slot.s-result-list.s-search-results.sg-row > div:nth-child(75) > div > div > span > a.s-pagination-item.s-pagination-next.s-pagination-button.s-pagination-separator")WebElement next;

	public PomNextPage() {
		PageFactory.initElements(driver, this);
		
	}
	public void next() {
		next.click();
		
	}
}
