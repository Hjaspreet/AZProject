package testLayer;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePackage.BaseAZclass;
import pompackage.PomAddCart;
import pompackage.PomDiffItem;
import pompackage.PomFilter;
import pompackage.PomKeySearch;
import pompackage.PomNextPage;
import pompackage.PomSort;

public class AZguestTestcases extends BaseAZclass {
	
	PomKeySearch key;
	PomNextPage next;
	PomFilter filter;
	PomSort sorting;
	PomAddCart cart;
	PomDiffItem diff;
	public AZguestTestcases() {
		super(); // to read properties from config file
	}
	
	
	
	
	
	@BeforeMethod
	public void initSetup() {
		BaseAZclass.initiation(); //calling method of base class
	key=new PomKeySearch();	
	next= new PomNextPage();
	filter= new PomFilter();
	sorting=new PomSort();
	cart=new PomAddCart();
	diff=new PomDiffItem();
	}
	
	@Test
	public void keysearch() throws InterruptedException {
	        key.keywordsearch(prop.getProperty("key"));
	       Thread.sleep(4000);
	        key.search();
		   Thread.sleep(3000); 
		   key.rs();
			
		}
	
	@Test
	public void srp() throws InterruptedException {
		
		key.keywordsearch(prop.getProperty("itemsearch"));
		key.search();
		Thread.sleep(3000);
		key.tshirt();
		Thread.sleep(4000);
		key.image();
		key.price();
		//key.rating();
		
	}
	@Test
	public void nextpage() {
		key.keywordsearch(prop.getProperty("itemsearch"));
		key.search();
		next.next();
		
	}
	@Test
	public void filteration() {
		key.keywordsearch(prop.getProperty("itemsearch"));
		key.search();
		filter.filteration();
		
		//String actual=filter.verify();
		
		//Assert.assertEquals(actual, "https://www.amazon.ca/s?k=tshirts+for+womens&rh=n%3A21204935011%2Cp_123%3A393482&dc&ds=v1%3Aow9LIaDx4uMX5QweK34PgkRTbs5RD8m1P215p3MZSeg&crid=2ACRLUEAKTOGV&qid=1720034707&sprefix=%2Caps%2C97&ref=sr_nr_p_123_1");
	}
	
	@Test
	public void sort() {
		key.keywordsearch(prop.getProperty("itemsearch"));
		key.search();
		sorting.sorting();
	}
	
	@Test
	public void FilterSortPagination() {
		key.keywordsearch(prop.getProperty("itemsearch"));
		key.search();
		next.next();
		filter.filteration();
		sorting.sorting();
	}
	
	@Test
	public void addcart() {
		key.keywordsearch(prop.getProperty("itemsearch"));
		key.search();
		key.tshirt();
		cart.addcart();
		
	}
	
	@Test
	public void IncQty() {
		key.keywordsearch(prop.getProperty("itemsearch"));
		key.search();
		key.tshirt();
		cart.qty();
	}
	@Test
	public void diffitem() {
		diff.type(prop.getProperty("Fshirt"));
		diff.search();
		diff.tshirt();
		diff.addcart();
		diff.typediff(prop.getProperty("Mshirt"));
		diff.msearch();
		diff.mtshirt();
		diff.maddcart();
		
	}
	@Test
	public void removeitem() throws InterruptedException {
	key.keywordsearch(prop.getProperty("itemsearch"));
		diff.search();
		key.tshirt();
		cart.addcart();
        Thread.sleep(3000);
		diff.cart();
		//diff.remove();
	
	}
	@Test
	public void removeall() {
		diff.type(prop.getProperty("Fshirt"));
		diff.search();
		key.tshirt();
		cart.addcart();
		diff.typediff(prop.getProperty("Mshirt"));
		diff.msearch();
		diff.mtshirt();
		diff.maddcart();
		diff.cart();
		//diff.remove();
		
		
	}
	@Test
	public void Closewindow() throws InterruptedException {
		diff.type(prop.getProperty("Fshirt"));
		diff.search();
		key.tshirt();
		cart.addcart();
		diff.typediff(prop.getProperty("Mshirt"));
		diff.msearch();
		diff.mtshirt();
		diff.maddcart();
		Thread.sleep(3000);
		//driver.close();
		//Thread.sleep(3000);
		//driver.get(prop.getProperty("url"));
		
	}
	
	
	
	@AfterMethod
	 public void close() {
		 driver.close();
		  }
	
	
	}
