package SeleniumGlueCode6;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class hooks1 {

	
	@BeforeStep
	public void hooks3()
	{
		System.out.println("Executed before scenario steps");
	}
	
	@AfterStep
	public void hooks4()
	{
		System.out.println("Executed after scenario steps");
	}
	
	
	@Before(value="@Smoke and @Sanity")
	public void hooks1()
	{
		System.out.println("Executed before code");
	}
	
	@Before(value="@Smoke and @Sanity")
	public void hooks6()
	{
		System.out.println("Executed first before code");
	}
	
	@After
	public void hooks2()
	{
		System.out.println("Executed after code");
	}
}
