package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageobjects.LoginPage;

public class Step {

	
	public WebDriver  driver;
	public LoginPage lp;
	
	@Given("user launch chrome browser")
	public void user_launch_chrome_browser() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		lp=new LoginPage(driver);
		
	    
	}

	@When("user opens the url as {string}")
	public void user_opens_the_url_as(String url) {
	  driver.get(url); 
	}

	@When("user enters email id  as {string} and password as {string}")
	public void user_enters_email_id_as_and_password_as(String email, String pwds) {
		lp.setPassword(email);
		lp.setPassword(pwds);
	    
	}

	@When("Click on login button")
	public void click_on_login_button() {
	    System.out.println("login btn clicked");
	    lp.loginBtnClick();
	}

	@Then("Navigated to the home page")
	public void navigated_to_the_home_page() {
	    System.out.println("Home page!!!!");
	}

	@When("user click on the Logout link")
	public void user_click_on_the_logout_link() {
	    System.out.println("Logout click");
	}

	@Then("page title should be other")
	public void page_title_should_be_other() {
		System.out.println("page title differs");
	   
	}

	@Then("closes the browser")
	public void closes_the_browser() {
	   System.out.println("closing browser");
	}

}
