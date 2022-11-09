package stepsdefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class LoginDataTableStep {
	
	WebDriver driver;
	@Given("User Launch  the Chrome browser")
	public void user_launch_the_chrome_browser() {
		System.out.println("******output1*****");
	    
	}

	@When("User opens URL")
	public void user_opens_url() {
		System.out.println("******output2*****");
	    
	}

	@When("User enters the valid credentials emaiid and pwd")
	public void user_enters_the_valid_credentials_emaiid_and_pwd(DataTable credentials) {
		List<List<String>> data = credentials.cells();
	// driver.findElement(By.name("username")).sendKeys(data.get(0).get(0));
	 System.out.println("******output3*****");
	    
	}

	@When("Click on Login button")
	public void click_on_login_button() {
		System.out.println("******output4*****");
	    
	}

}
