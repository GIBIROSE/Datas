package stepsdefinitions;

import io.cucumber.java.en.*;

public class StepsDataDrvnEg {
	
	
	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {
		System.out.println("******output1**********");
	    
	}

	@When("User opens URL {string}")
	public void user_opens_url(String a) {
		System.out.println("******output2**********");
		System.out.println(a);
	    
	}

	@When("User enters Email as {string} and Password as {string}")
	public void user_enters_email_as_and_password_as(String value1, String value2) {
		System.out.println("******output3**********");
		System.out.println(value1);
		System.out.println(value2);
	    
	}

	@When("Click on Login")
	public void click_on_login() {
		System.out.println("******output4**********");
	    
	}

	@When("close browser")
	public void close_browser() {
		System.out.println("******output5**********");
	   
		
	}

}
