package stepsdefinitions;

import io.cucumber.java.en.*;

public class LoginParameter {

	@Given("user launched browser")
	public void user_launched_browser() {
		System.out.println("*********output1*********");

	}

	@When("user opens the url as {string}")
	public void user_opens_the_url_as(String string) {
		System.out.println("*********output2*********");

	}

	@When("user enters email id  as {string} and password as {string}")
	public void user_enters_email_id_as_and_password_as(String a, String b) {
		System.out.println("*********output3*********");
		System.out.println(a);
		System.out.println(b);

	}

	@Then("Click on the login button")
	public void click_on_the_login_button() {
		System.out.println("*********output4*********");

	}

}
