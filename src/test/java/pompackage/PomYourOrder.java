package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePackage.BaseAZclass;

public class PomYourOrder extends BaseAZclass{
	@FindBy(css="#a-page > div.a-container > div > div:nth-child(2) > div:nth-child(1) > a > div > div > div > div.a-column.a-span9.a-span-last > h2")WebElement yourorder;
	@FindBy(css="#a-page > section > div.your-orders-content-container__content.js-yo-main-content > div.a-section.a-spacing-medium.page-tabs > ul > li:nth-child(2) > a") WebElement buyagain;
   
    
    
    public PomYourOrder () {
    	PageFactory.initElements(driver, this);    }
    
    
    public void yourorder() {
    	yourorder.click();
    }
    
    public void buyagain() {
    	buyagain.click();
    }   	
    	
    		
    		
    
    	
    }
    
    
    
    
    
    
    
    


