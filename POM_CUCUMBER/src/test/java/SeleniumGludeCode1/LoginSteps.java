package SeleniumGludeCode1;

import java.util.List;

import Pages.*;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	WebDriver driver;
	LoginPage l1;
	
	@Given("I open OpenOrangeHRM website")
	public void i_open_open_orange_hrm_website() throws Exception {
	   
		l1=new LoginPage();
		l1.Login_Orange();
		
	}
	
	
	@When("User Navigate to LogIn Page1")
	public void user_navigate_to_log_in_page1(io.cucumber.datatable.DataTable dataTable) throws Exception {
		
		 List<Map<String, String>> data1 = dataTable.asMaps(String.class, String.class);
		
		String username=data1.get(0).get("Username");
		String Password=data1.get(0).get("Password");
		
		l1.Login(username, Password);
		
	    
	}
	
	
	
	   
	
	
	
	
	


}
