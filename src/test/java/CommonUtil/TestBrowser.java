package CommonUtil;

// Added new changes  on feb25 2020

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
public class TestBrowser

{
	 public static String ChromedriverPath = "C:\\chromedriver_win32\\chromedriver.exe";
	 public static String IEdriverPath = "C:\\Users\\sudhakar\\Desktop\\seleni\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe";
	 public static String FirefoxdriverPath = "C:\\FireFoxDriver\\geckodriver.exe";
		

	//public static  WebDriver driver;
	 //TestBrowser T1=new TestBrowser();
	 //T1.driver=driver;
		  
		  public   static    WebDriver OpenChromeBrowser()throws Exception
			 {
			
				
	 			WebDriver driver ; 
	 		
	 			// System.setProperty("webdriver.chrome.driver",ChromedriverPath);
	 			System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\Drivers\\chromedriver.exe");
			     driver=new ChromeDriver();
		
				 driver.manage().window().maximize() ;	
				 
				// T1=new TestBrowser();
				  //T1.driver=driver;
				// this.driver5=driver;
				 return driver;
	 			 
			
			}
		  
		  
		//  @Test  
		  public  static WebDriver OpenIEBrowser()throws Exception
			 {
				 WebDriver driver ; 
				 System.setProperty("webdriver.ie.driver",IEdriverPath);
				 driver = new InternetExplorerDriver();
				 driver.manage().window().maximize() ;
				 return driver;
			}
		  
		  
		//  @Test  
		  public  static   WebDriver FirefoxBrowser()throws Exception
			 {
			     WebDriver driver ;
				 System.setProperty("webdriver.gecko.driver",FirefoxdriverPath);
				 driver = new FirefoxDriver();
				 
				 Thread.sleep(6000);
				 driver.manage().window().maximize() ;	
				 return driver;
			 }

		  
		  
		//  @Test  
		  public  static void   CloseBrowser(WebDriver driver)throws Exception
			 {
			  
				driver.quit();	
			 
			 }
		  
		  
		  
		  
  
		  

}
	  
		  
		  
		  
		  
		  
		  
			
	  



/*  public  String baseUrl1 = "http://www.newtours.demoaut.com/";
 public String baseUrl2 = "https://www.facebook.com/";
 public String baseUrl3 = "https://www.amazon.in/";*/





