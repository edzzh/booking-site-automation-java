package pages.signup;

import com.codeborne.selenide.SelenideElement;
import pages.account.AccountPageObject;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class SignUpPageObject {

    private SelenideElement getFirstNameField() {
        return $("Test");
    }

    private SelenideElement getLastNameField() {
        return $("Test");
    }

    private SelenideElement getMobileNumberField() {
        return $("Test");
    }

    private SelenideElement getEmailField() {
        return $("Test");
    }

    private SelenideElement getPasswordField() {
        return $("Test");
    }

    private SelenideElement getConfirmPasswordField() {
        return $("Test");
    }

    private SelenideElement getSignUpButton() {
        return $("Test");
    }

    public void enterFirstName(String firstName) {
        getFirstNameField().sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        getLastNameField().sendKeys(lastName);
    }

    public void enterMobileNumber(String mobileNumber) {
        getMobileNumberField().sendKeys(mobileNumber);
    }

    public void enterEmailAddress(String email) {
        getEmailField().sendKeys(email);
    }

    public void enterPassword(String password) {
        getPasswordField().sendKeys(password);
    }

    public void confirmationPassword(String password) {
        getConfirmPasswordField().sendKeys(password);
    }

    public AccountPageObject selectSignUpButton() {
        getSignUpButton().click();
        return page(AccountPageObject.class);
    }
}
