package stepdefinitions;

import cucumber.api.java.en.And;
import general.User;
import pages.signup.SignUpPageObject;

public class SignupSteps {

    private SignUpPageObject signup = new SignUpPageObject();
    private User user = new User();
    private User userTwo = new User("Janis", "Berzins");

    @And("^I enter First name$")
    public void iEnterFirstName() throws Throwable {
        signup.enterFirstName(user.getFirstName());
    }

    @And("^I enter Last name$")
    public void iEnterLastName() throws Throwable {
        signup.enterLastName(user.getLastName());
    }

    @And("^I enter Mobile number$")
    public void iEnterMobileNumber() throws Throwable {
        signup.enterMobileNumber(user.getMobilePhone());
    }

    @And("^I enter Email address$")
    public void iEnterEmailAddress() throws Throwable {
        signup.enterEmailAddress(user.getEmailAddress());
    }

    @And("^I enter Password$")
    public void iEnterPassword() throws Throwable {
        signup.enterPassword(user.getPassword());
    }

    @And("^I confirm Password$")
    public void iConfirmPassword() throws Throwable {
        signup.confirmationPassword(user.getPassword());
    }
}
