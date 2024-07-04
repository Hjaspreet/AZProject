package testLayer;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import BasePackage.BaseAZclass;
import pompackage.PomAddAddress;
import pompackage.PomAddress;
import pompackage.PomCancelOr;
import pompackage.PomChangeName;
import pompackage.PomEmail;
import pompackage.PomLoginSc;
import pompackage.PomNewAdd;
import pompackage.PomNotShipped;
import pompackage.PomPassw;
import pompackage.PomSignInClk;
import pompackage.PomSignPage;
import pompackage.PomUpdateInfo;
import pompackage.PomYourOrder;
import testdata.Excelsheet;

public class AZTestCases extends BaseAZclass{
	
	PomSignInClk log;
	PomEmail email;
	PomPassw passw;
	PomSignPage msg;
	PomYourOrder order;
	PomNotShipped ship;
	PomCancelOr cancel;
	PomAddress address;
	PomAddAddress add;
	PomNewAdd newadd;
    PomLoginSc LogSc;
    PomUpdateInfo edit;
    PomChangeName newname;
	//constructor of this class
	public AZTestCases() {
		super(); // to read properties from config file
	}
	
	@BeforeMethod
	public void initSetup() throws InterruptedException {
		BaseAZclass.initiation(); //calling method of base class
		
		log=new PomSignInClk();
	    email= new PomEmail();
	    passw= new PomPassw();
	    msg= new PomSignPage();
	    order=new PomYourOrder();
	    ship= new PomNotShipped();
	    cancel=new PomCancelOr();
        address=new PomAddress();  
	    add=new PomAddAddress();
	    newadd=new PomNewAdd();
	    LogSc=new PomLoginSc();
	    edit=new  PomUpdateInfo();
	    newname= new PomChangeName();
	    
	    
	    
         
	    
	    log.SignInClick();
         
		
	    email.typeEmail(prop.getProperty("Email"));
	    Thread.sleep(3000);
	    
	    email.continuebtn();
	    
	    passw.pass(prop.getProperty("Password"));
	    Thread.sleep(3000);
	    
	    passw.keep();
	    
	    
	    passw.signinbtn();
	    msg.signInMsg();
	    msg.signMsgClk();
	   
	}
	
	
	
	/*
	 * @DataProvider public Object[][] Details(){ Object result[][]=
	 * Excelsheet.readdata("Sheet1"); return result; }
	 */
	
	
	  @Test(priority=1) 
	  public void yourorder() { 
      order.yourorder();
	  order.buyagain(); 
	  ship.notshipped(); 
	 // cancel.cancelorder();
	  }
	 
	
	   @Test
	   public void yourAddress() throws InterruptedException {
	   address.yourAdd();
	   add.addaddress();
	    newadd.country();
		newadd.fullname(prop.getProperty("fullName"));
		newadd.phone(prop.getProperty("phone"));
		newadd.address(prop.getProperty("address"));
		newadd.city(prop.getProperty("city"));
		newadd.province();
		newadd.postal(prop.getProperty("postal"));
		newadd.defaultadd();
		newadd.addbtn();
		}
	
	@Test
	public void updatename() {
		
		LogSc.Login();
		edit.editname();
		newname.namecahnge(prop.getProperty("newname"));
		newname.savename();
		}
	
	
      @AfterMethod 
	  public void close() {
		 driver.close();
		  }
	 
	 }
	

