package SeleniumGludeCode1;

import Pages.HomePage1;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Then;

public class LogoutSteps {
	
	static WebDriver driver;
	//LoginPage l1;
	

	
	@Then("User LogOut from the Application2")
	public void user_log_out_from_the_application2() throws Exception {
	  
		
		HomePage1 hp=new HomePage1();
		//hp.HomePage();
		hp.Logout();
	}
}
	
	
	   
	
	
	
	
	
	
	
	
	
	
	
	
	



