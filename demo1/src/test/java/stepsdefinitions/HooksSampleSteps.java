package stepsdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class HooksSampleSteps {

	@Before
	public void beforeSteps() {
		System.out.println("Happens before every scenario");
		System.out.println("1. browser launched");
		System.out.println("2.Entered url");
		System.out.println("3. login steps");
	}

	@After
	public void afterSteps() {
		System.out.println("Happens after every scenario");
		System.out.println("3. logout button click");

	}

	@Given("user clicked on the add new client")
	public void user_clicked_on_the_add_new_client() {
		System.out.println("Add new client page");

	}

	@When("user entered necessary details")
	public void user_entered_necessary_details() {
		System.out.println("client page:- added details");

	}

	@Then("user clicked on save button")
	public void user_clicked_on_save_button() {
		System.out.println("Client saved");
	}

	@Given("user clicked on the add new payslip")
	public void user_clicked_on_the_add_new_payslip() {
		System.out.println("Add payslip of new employee");
	}

	@When("user entered necessary details for payslip")
	public void user_entered_necessary_details_for_payslip() {
		System.out.println("Added details of new employee");
	}

	@Then("user clicked on  the payslip save button")
	public void user_clicked_on_the_payslip_save_button() {
		System.out.println("Payslip  generated");

	}

}
