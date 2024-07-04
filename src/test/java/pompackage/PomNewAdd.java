package pompackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import BasePackage.BaseAZclass;

public class PomNewAdd extends BaseAZclass{
	
	@FindBy(id="address-ui-widgets-countryCode-dropdown-nativeId")WebElement country;
	@FindBy(id="address-ui-widgets-enterAddressFullName")WebElement fullname;
	@FindBy(id="address-ui-widgets-enterAddressPhoneNumber")WebElement phone;
	@FindBy(id="address-ui-widgets-enterAddressLine1")WebElement address;
	@FindBy(id="address-ui-widgets-enterAddressCity")WebElement city;
	@FindBy(id="address-ui-widgets-enterAddressStateOrRegion-dropdown-nativeId")WebElement province;
	@FindBy(id="address-ui-widgets-enterAddressPostalCode")WebElement postalcode;
	@FindBy(id="address-ui-widgets-use-as-my-default")WebElement defaultaddress;
	@FindBy(id="address-ui-widgets-form-submit-button")WebElement addbtn;
	
	
	public PomNewAdd() {
		PageFactory.initElements(driver, this);
	}
	
public void country() throws InterruptedException {
	Select obj=new Select(country);
	obj.selectByIndex(37);
	Thread.sleep(3000);
}
public void fullname(String fname) throws InterruptedException {
	fullname.sendKeys(fname);
	Thread.sleep(3000);
}

public void phone(String phon) {
	phone.sendKeys(phon);
}
public void address(String Address) {
	address.sendKeys(Address);
}
public void city(String ct) {
	city.sendKeys(ct);
}
public void province() throws InterruptedException {
	Select obj=new Select(province);
	obj.selectByVisibleText("Ontario");
	Thread.sleep(3000);
}
public void postal(String code) {
	postalcode.sendKeys(code);
}
public void defaultadd() {
	defaultaddress.click();
}
public void addbtn() {
	addbtn.click();
}











}
