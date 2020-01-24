package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test_Steps {

	
	@Given("^User is on Home Page$")
	public void User_is_on_Home_Page() throws Throwable {
	    
		System.out.println("Given");
		
	}
	
	@When("^User Navigate to LogIn Page$")
	public void User_Navigate_to_LogIn_Page() throws Throwable {
		System.out.println("When 1");
	
	}
	
	@When("^User enters UserName and Password$")
	public void User_enters_UserName_and_Password() throws Throwable {
		System.out.println("When 2");
	    
	}
	
	@Then("^Message displayed Login Successfully$")
	public void Message_displayed_Login_Successfully() throws Throwable {
		System.out.println("Then");
	    
	}
	

	
}
