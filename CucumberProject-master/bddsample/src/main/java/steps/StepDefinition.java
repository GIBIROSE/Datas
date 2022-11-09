package steps;
import cucumber.api.java.en.*;
public class StepDefinition {

    @Given("User Launch Chrome browser")
    public void user_launch_chrome_browser() {
        System.out.println("TC1");
    }
    @When("User opens URL {string}")
    public void user_opens_url(String string) {
        System.out.println("TC2");
        System.out.println(string);

    }
    @When("User enters Email as {string} and Password as {string}")
    public void user_enters_email_as_and_password_as(String string, String string2) {
        System.out.println("TC3");
        System.out.println(string);
       //System.out.println("TC2");
        System.out.println(string2);

    }
    @When("Click on Login")
    public void click_on_login() {
        System.out.println("TC4");

    }
    @Then("Page Title should be opencartdemo")
    public void page_title_should_be_opencartdemo() {
        System.out.println("TC4");

    }


    @And("User should close the browser")
    public void userShouldCloseTheBrowser() {
        System.out.println("TC5");
    }
}
