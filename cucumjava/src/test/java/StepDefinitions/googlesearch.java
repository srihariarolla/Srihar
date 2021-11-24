package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class googlesearch {
	
	
	@Given("browser is open")
	public void browser_is_open() {
		System.out.println("clicked on browser is open");
	 
	}

	@And("user on google page")
	public void user_on_google_page() {
		System.out.println("clicked on user on google page");
	   }

	@When("user enters a text in search box")
	public void user_enters_a_text_in_search_box() {
		System.out.println("enters a text in search box");
	 
	}

	@And("hits enter")
	public void hits_enter() {
		System.out.println("clicked on hits ente");
	}

	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() {
		System.out.println("new page open");
	    	}


}
