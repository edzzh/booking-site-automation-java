package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignupSteps {
    @Given("^I have opened home page$")
    public void iHaveOpenedHomePage() throws Throwable {
        System.out.println("Open Homepage");
    }

    @When("^I select My account menu$")
    public void iSelectMyAccountMenu() throws Throwable {
        selectMyAccountMenu();
    }

    @And("^I select sign up button$")
    public void iSelectSignUpButton() throws Throwable {
        selectSignupButton();
    }

    @And("^I enter First name$")
    public void iEnterFirstName() throws Throwable {
        enterFirtName();
    }

    @And("^I enter Last name$")
    public void iEnterLastName() throws Throwable {
        enterLastName();
    }

    @And("^I enter Mobile number$")
    public void iEnterMobileNumber() throws Throwable {
        enterMobileNumber();
    }

    @And("^I enter Email address$")
    public void iEnterEmailAddress() throws Throwable {
        enterEmailAddress();
    }

    @And("^I enter Password$")
    public void iEnterPassword() throws Throwable {
        enterPassword();
    }

    @And("^I confirm Password$")
    public void iConfirmPassword() throws Throwable {
        confirmPassword();
    }

    @Then("^User account page is opened$")
    public void userAccountPageIsOpened() throws Throwable {
        accountPageIsCreated();
    }
}