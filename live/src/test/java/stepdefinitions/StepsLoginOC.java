package stepdefinitions;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepsLoginOC {
	static WebDriver driver;

	@Given("User Launch  the required  browser")
	public void user_launch_the_required_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/admin/");

	}

	@When("User opens the  URL")
	public void user_opens_the_url() {
		System.out.println("step 2");
		// driver.get("https://demo.opencart.com/admin/");
		driver.manage().window().maximize();
		// driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("User enters the valid credentials username  and password")
	public void user_enters_the_valid_credentials_username_and_password(DataTable dataTable) {
		for (Map<String, String> data : dataTable.asMaps(String.class, String.class)) {
			driver.findElement(By.name("username")).click();
			driver.findElement(By.name("username")).sendKeys(data.get("username"));
			driver.findElement(By.name("password")).click();
			driver.findElement(By.name("password")).sendKeys(data.get("password"));

		}
		System.out.println("successfully entered credentials");
	}

	@When("Click on Login button")
	public void click_on_login_button() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println("Login Btn clicked");

	}

	@Then("Navigated to home page")
	public void navigated_to_home_page() {
		System.out.println("user navigated to home page");

	}

	@Then("close the  browser")
	public void close_the_browser() {
		//driver.close();
		System.out.println("output page 1");
	   
	}

	@Given("close the important security information")
	public void close_the_important_security_information() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='btn-close']")).click();
	}

	@Then("user can view dashboard")
	public void user_can_view_dashboard() {
		System.out.println("**!dashboard view!**");
	}

	@When("user click on the sales button")
	public void user_click_on_the_sales_button() {
		System.out.println("Sales side tab :");
		driver.findElement(By.xpath("//a[@href='#collapse-4']")).click();
	}

	@Then("user click on the sales orders subtab")
	public void user_click_on_the_sales_orders_subtab() {
		driver.findElement(By.xpath("//a[normalize-space()='Orders']")).click();
		System.out.println("Sales side tab orders :");
	}

	@Then("user can view existing order details")
	public void user_can_view_existing_order_details() {
		System.out.println("View existing orders");
	}

	@Then("user can add new orders")
	public void user_can_add_new_orders() {
		driver.findElement(By.xpath("//a[@data-bs-original-title='Add New']")).click();
		System.out.println("clicked on the add new orders button");
	}

	@Then("user click on the add item tab")
	public void user_click_on_the_add_item_tab() {
		driver.findElement(By.xpath("(//i[@class='fas fa-plus-circle'])[1]")).click();
		System.out.println("user clicked on the add item tab ");
	}

	@Then("user can choose product")
	public void user_can_choose_product() {
		//WebElement btn=driver.findElement(By.xpath("//input[@id='input-product']"));
		List<WebElement> alloption=driver.findElements(By.xpath("//input[@id='input-product']"));
		System.out.println("size is : "+alloption.size());
		for(WebElement option:alloption) {
			if(option.getText().equalsIgnoreCase("iMac")) {
				option.click();
			}
		}
		//btn.click();
		//btn.sendKeys("iMac");
		//Select sc=new Select(btn);
		//sc.selectByIndex(1);
	}

	@Then("user can choose options")
	public void user_can_choose_options() {
	System.out.println("1");	
	}

	@Then("user can save add item")
	public void user_can_save_add_item() {
		System.out.println("2");
		driver.findElement(By.xpath("//button[@id='button-product-add']")).click();
		
	}

	@Then("close the add item tab")
	public void close_the_add_item_tab() {
		System.out.println("3");
		driver.findElement(By.xpath("//div[@id='modal-cart']//button[@type='button']")).click();
	}

}
