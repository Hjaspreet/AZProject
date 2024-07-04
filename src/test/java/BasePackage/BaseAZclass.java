package BasePackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseAZclass {

	
	public static Properties prop=new Properties();
	public static WebDriver driver;
	
	//constructor of this class
	
	
	
	public BaseAZclass() {
		
		try {
		FileInputStream file=new FileInputStream("C:\\Users\\1Onkar\\eclipse-workspace\\Amazon\\src\\test\\java\\environmentvariable\\Config.properties" );
		
		prop.load(file);}
		
		catch(FileNotFoundException e) {e.printStackTrace();}
		catch(IOException a) {a.printStackTrace();}
	}
	
	//method for keeping all common commands
		
		
		public static void initiation() {
			
			//driver path
			//maximize pageload, implicit, getting url
			
			String browsername=prop.getProperty("browser");
			
			if(browsername.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver","chromedriver.exe");
			 driver=new ChromeDriver();
			}
			
			else if (browsername.equals("firefox")) {
				System.setProperty("webdriver.gecko.driver","geckodriver.exe");
				driver=new FirefoxDriver();}
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(prop.getProperty("url"));
			
			
			
			
		}
	
		
			
	}
	


