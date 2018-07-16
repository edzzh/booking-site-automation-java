package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;

public class LoginSteps {
    @And("^I select Login button from drop-down menu$")
    public void iSelectLoginButtonFromDropDownMenu() throws Throwable {
        selectLoginButtonFromDropDownMenu();
    }

    @And("^I select Login button$")
    public void iSelectLoginButton() throws Throwable {
        selectLoginButton();
    }
}
