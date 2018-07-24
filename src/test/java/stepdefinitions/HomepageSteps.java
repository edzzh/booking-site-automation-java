package stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pages.header.NavigationPageObject;

public class HomepageSteps {

    NavigationPageObject homepage = new NavigationPageObject();

    @Given("^I have opened home page$")
    public void iHaveOpenedHomePage() throws Throwable {
        System.out.println("Open Homepage");
    }

    @When("^I select My account menu$")
    public void iSelectMyAccountMenu() throws Throwable {
        homepage.selectMyAccountButton();
    }

    @And("^I select sign up button$")
    public void iSelectSignUpButton() throws Throwable {
        homepage.selectSignUpButton();
    }

    @And("^I navigate to sign up page")
    public void iNavigateToSignUpPage() throws Throwable {
        iSelectMyAccountMenu();
        iSelectSignUpButton();
    }
}
