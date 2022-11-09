package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebDriver ldriver;

	public LoginPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(id = "Email")
	WebElement txtEmail;

	@FindBy(id = "Password")
	WebElement txtPwd;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement loginBtn;

	public void setUserName() {
		txtEmail.click();
		txtEmail.clear();
		txtEmail.sendKeys("admin@yourstore.com");
	}

	public void setPassword() {
		txtPwd.click();
		txtPwd.clear();
		txtPwd.sendKeys("admin");

	}

	public void loginBtnClick() {
		loginBtn.click();
	}

}
