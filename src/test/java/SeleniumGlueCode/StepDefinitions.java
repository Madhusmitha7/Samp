package SeleniumGlueCode;

import org.openqa.selenium.WebDriver;

import CommonUtil.TestBrowser;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.SkillsPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {
	
	
	WebDriver driver;
	
	LoginPage l1=new LoginPage();
	SkillsPage S1=new SkillsPage();
	HomePage H1=new HomePage();
	
	
	@Given("User launch chrome browser")
	public void user_launch_chrome_browser() throws Exception {
		
		driver=TestBrowser.OpenChromeBrowser();
	   
	}
	
	
	
	@When("User opens URL {string}")
	public void user_opens_url(String TestURL1) {
		
		l1.LoginPage(driver);
		l1.OpenOrangeHRM(TestURL1);


	}
	
	
	
	@When("User Navigate to LogIn Page2")
	public void user_navigate_to_log_in_page2(io.cucumber.datatable.DataTable dataTable) throws Exception {
	   
		l1.LoginPage(driver);
		l1.LoginCredentials(dataTable);
		
	}
	
	
	
	@Then("Creted Skills Record3")
	public void creted_skills_record3(io.cucumber.datatable.DataTable dataTable) throws Exception {

		S1.SkillsPage(driver);
		S1.AddSkills(dataTable);

	}
	
	
	@When("Click on logout button")
	public void click_on_logout_button() throws Exception {

		H1.HomePage(driver);
		H1.Logout();
		
	}
	
	
	
	@Then("Close Browser")
	public void close_browser() {
		
		H1.HomePage(driver);
		H1.CloseBrowser();
	   
	}

	

}
