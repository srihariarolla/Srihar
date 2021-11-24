package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login_steps {
	
	
	@Given("^user is on login page$")
	public void user_is_on_login_page() {
		System.out.println("entered login page");
	}

	@When("^user entered username and password$")
	public void user_entered_username_and_password() {
	   System.out.println("entered user and pass");
		
	}

	@And("^clicks on login button$")
	public void clicks_on_login_button() {
		System.out.println("clicked on login button");
	}

	@Then("^user is navigated to home page$")
	public void user_is_navigated_to_home_page() {
		System.out.println("entered into homr page");
	}

	
	
	

}
