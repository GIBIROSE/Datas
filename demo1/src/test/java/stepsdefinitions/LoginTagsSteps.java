package stepsdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class LoginTagsSteps {
	
//	@Before
//  public void beforeScenario(){
//      System.out.println("This will run before the Scenario");
//  }	
//	
//	@After
//  public void afterScenario(){
//      System.out.println("This will run after the Scenario");
//  }
	
	
	@Given("This is a valid login test")
	public void this_is_a_valid_login_test() {
		System.out.println("******Valid Login***********");
	    
	}

	@Given("This is a invalid login test")
	public void this_is_a_invalid_login_test() {
		System.out.println("**********Invalid login**********");
	    
	}

}
