package Stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginMultipleDataSets {
	WebDriver driver=null;
	@Given("Launch the browser")
	public void launch_the_browser() {
		System.out.println("Launch Browser");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://example.testproject.io/web/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	}

	@When("^User entered the valid (.*) and (.*)$")
	public void user_entered_the_valid_username_and_password(String username, String password)
			throws InterruptedException {
		Thread.sleep(2000);		
		driver.findElement(By.xpath("//input[@id='name']")).click();
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='password']")).click();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(Keys.ENTER);
	    
	}

	@Then("user navigated to the home page")
	public void user_navigated_to_the_home_page() {
		
		WebElement btnSubmit = driver.findElement(By.xpath("//button[@id='logout']"));
		System.out.println("Status is" + btnSubmit.isDisplayed());
		//driver.quit();
	    
	}


}
