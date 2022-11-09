package stepsdefinitions;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class LoginDataDrivenMap {
	
	WebDriver driver;
	@Given("User Launch  the required  browser")
	public void user_launch_the_required_browser() {
		System.out.println("!!!!!!!!out1!!!!!!!!!");
	    
	}

	@When("User opens the  URL")
	public void user_opens_the_url() {
		System.out.println("!!!!!!!!out2!!!!!!!!!");
	    
	}

	@When("User enters the valid credentials username  and password")
	public void user_enters_the_valid_credentials_username_and_password(DataTable dataTable) {
		/*for (Map<String, String> data : dataTable.asMaps(String.class, String.class)) {
			
						driver.findElement(By.name("username")).sendKeys(data.get("username"));
						driver.findElement(By.name("password")).sendKeys(data.get("password"));
			
					}*/
	  System.out.println("out3");  
	}

	@Then("Navigated to home page")
	public void navigated_to_home_page() {
		System.out.println("homepage");
	    
	}

	@Then("close the  browser")
	public void close_the_browser() {
		System.out.println("closed my browser");
	    
	}
}
