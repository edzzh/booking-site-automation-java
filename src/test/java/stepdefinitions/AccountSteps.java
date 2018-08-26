package stepdefinitions;

import cucumber.api.java.en.Then;

public class AccountSteps {
    @Then("^User account page is opened$")
    public void userAccountPageIsOpened() throws Throwable {
        accountPageIsCreated();
    }
}
