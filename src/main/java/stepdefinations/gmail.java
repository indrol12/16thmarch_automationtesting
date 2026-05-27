package stepdefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class gmail {

	
	@Given("user should be registered with valid credentials")
	public void first()
	{
		System.out.println("Precondition:User should be registered!!");
	}
	@When("user enters email and password")
	public void second()
	{
		System.out.println("Email:shruti@gmail.com");
		System.out.println("Password:shruti@123");
	}
	@Then("Gmail Login Successfull")
	public void third()
	{
		System.out.println("Login successfull");
	}
}
