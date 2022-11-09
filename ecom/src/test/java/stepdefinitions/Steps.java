package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageobjects.LoginPage;

public class Steps {

	public WebDriver driver;
	public LoginPage lp;

	@Given("user launch chrome browser")
	public void user_launch_chrome_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		lp = new LoginPage(driver);
	}

	@When("user opens the url")
	public void user_opens_the_url() {
		driver.get("http://admin-demo.nopcommerce.com/");

	}

	@When("user enters email id and password")
	public void user_enters_email_id_and_password() {
		lp.setUserName();
		lp.setPassword();
	}

	@When("Click on login button")
	public void click_on_login_button() {
		lp.loginBtnClick();
	}

	@Then("Navigated to the home page")
	public void navigated_to_the_home_page() {
		System.out.println("Homepage!!!");
	}

	@When("user click on the Logout link")
	public void user_click_on_the_logout_link() {
		System.out.println("logout");
	}

	@Then("page title should be other")
	public void page_title_should_be_other() {
		System.out.println("Title ");
	}

	@Then("closes the browser")
	public void closes_the_browser() {
		
		driver.close();

	}

}
