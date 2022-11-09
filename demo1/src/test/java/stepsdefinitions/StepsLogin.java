package stepsdefinitions;

import io.cucumber.java.en.*;

public class StepsLogin {
	
	@Given("user launch chrome browser")
	public void user_launch_chrome_browser() {
		System.out.println("Chrome browser launched");
	    
	}
	@When("user opens the url")
	public void user_opens_the_url() {
		System.out.println("opens with the specified URL");
	    
	}
	@When("user enters valid credentials")
	public void user_enters_valid_credentials() {
		System.out.println("Entered vald UN and PWD");
	    
	}
	@Then("Click on login button")
	public void click_on_login_button() {
		System.out.println("clicked on the login button");
	    
	}
	@Then("closes the browser")
	public void closes_the_browser() {
		System.out.println("closed the browser");
	   
	}

}
