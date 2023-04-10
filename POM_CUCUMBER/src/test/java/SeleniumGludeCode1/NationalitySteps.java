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
import Pages.*;

public class NationalitySteps {
	
	static WebDriver driver;
	LoginPage l1;
	NationalityPage NP;
	

	
	
	
	
	@When("I created Nationality Record1")
	public void i_created_nationality_record1(io.cucumber.datatable.DataTable dataTable) throws Exception {
		
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		 List<Map<String, String>> data1 = dataTable.asMaps(String.class, String.class);
			String NatioanlityText=data1.get(0).get("Nationality");
		
		NP=new NationalityPage();
		NP.NationalityPage();
		NP.AddNatioanlity(NatioanlityText);
		
    	
    	}
	
	
	
	
	
	
	
	
	
	
	
	
	


}
