package Stepdefinitions;

import io.cucumber.java.en.*;

public class LoginSteps {
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
	   System.out.println("User entered login page");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
	    System.out.println("Entered UN and Pwd");
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
	    System.out.println("submitted login");
	}

	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() {
	    System.out.println("Entered home page");
	}

}
