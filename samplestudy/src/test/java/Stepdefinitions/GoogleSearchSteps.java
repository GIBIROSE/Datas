package Stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchSteps {

//	WebDriver driver=null;
//	@Given("Browser is open")
//	public void browser_is_open() {
//	    System.out.println("Launch Browser");
//	    WebDriverManager.chromedriver().setup();
//	    driver=new ChromeDriver();
//	    driver.get("https://www.google.com/");
//	    driver.manage().window().maximize();
//	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//	}
//
//	@When("User is on the google search page")
//	public void user_is_on_the_google_search_page() {
//	 System.out.println("Google search box is shown and entered text");   
//	 
//	 WebElement searchBtn=driver.findElement(By.xpath("//input[@name='q']"));
//	 searchBtn.click();
//	 searchBtn.sendKeys("Automation testing");
//	 searchBtn.sendKeys(Keys.ENTER);
//	 
//	}
//
//	@Then("Search results should be ready")
//	public void search_results_should_be_ready() {
//	   System.out.println("search results appeared"); 
//	   driver.getPageSource().contains("Software Training Institutes");
//	}
}
