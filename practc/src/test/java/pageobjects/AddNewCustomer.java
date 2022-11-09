package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewCustomer {

	public WebDriver ldriver;

	public AddNewCustomer(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//a[@href='#']//p[contains(text(),'Customers')]")
	WebElement customersSideBar;

	@FindBy(xpath = "//a[@href='/Admin/Customer/List']//p[contains(text(),'Customers')]")
	WebElement customersSubElement;

	@FindBy(xpath = "//a[@href='/Admin/Customer/Create']")
	WebElement addNewCustomer;

	@FindBy(xpath = "//input[@id='Email']")
	WebElement txtEmail;

	@FindBy(xpath = "//input[@id='Password']")
	WebElement txtPassword;

	@FindBy(xpath = "//input[@id='FirstName']")
	WebElement txtFirstName;

	@FindBy(xpath = "//input[@id='LastName']")
	WebElement lastName;

	@FindBy(xpath = "//input[@id='Gender_Male']")
	WebElement genderStatus;
	
	
	@FindBy(xpath = "//input[@id='DateOfBirth']")
	WebElement DOB;
	
	@FindBy(xpath="//span[@class='k-icon k-i-calendar']")
	WebElement calendarDatePicker;
	
	@FindBy(xpath="//input[@id='Company']")
	WebElement companyName;
	
	
	@FindBy(xpath="//input[@id='IsTaxExempt']")
	WebElement isTaxExempt;
	
	
	@FindBy(xpath="//div[@class='input-group-append']//div[@role='listbox']")
	WebElement newsLetter;
	
	@FindBy(xpath="//select[@id='VendorId']")
	WebElement manageOfVendor;
	
	
	@FindBy(xpath="//textarea[@id='AdminComment']")
	WebElement adminComment;
	
	
	@FindBy(xpath="//button[@name='save']")
	WebElement saveBtn;
	
	
	public void createNewCustomer() {
		txtEmail.click();
		txtEmail.sendKeys("acd@gmail.com");
		txtPassword.click();
		txtPassword.sendKeys("1234");
		txtFirstName.click();
		txtFirstName.sendKeys("Rani");
		lastName.click();
		lastName.sendKeys("Maria");
		genderStatus.click();
		DOB.click();
		DOB.sendKeys("19/10/1991");
		companyName.click();
		companyName.sendKeys("Boniviard");
		adminComment.click();
		adminComment.sendKeys("ok");
		saveBtn.click();
		
		
		
		
		
		
	}
	
	
	
	

}
