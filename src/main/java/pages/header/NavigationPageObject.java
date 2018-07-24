package pages.header;

import com.codeborne.selenide.SelenideElement;
import pages.signup.SignUpPageObject;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class NavigationPageObject {

    private SelenideElement getMyAccountButton() {
        return $("Test");
    }

    private SelenideElement getSignUpButton() {
        return $("Test");
    }

    public void selectMyAccountButton() {
        getMyAccountButton().click();
    }

    public SignUpPageObject selectSignUpButton() {
        getSignUpButton().click();
        return page(SignUpPageObject.class);
    }
}
