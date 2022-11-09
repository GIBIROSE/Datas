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

	public void setUserName(String uname) {
		txtEmail.click();
		txtEmail.clear();
		txtEmail.sendKeys(uname);
	}

	public void setPassword(String pwd) {
		txtPwd.click();
		txtPwd.clear();
		txtPwd.sendKeys(pwd);

	}

	public void loginBtnClick() {
		loginBtn.click();
	}

}
