package steps;

import config.UserConfig;
import io.cucumber.java.en.Then;
import pages.SignInPage;

public class SignInPageDef {
    SignInPage signInPage = new SignInPage();


    @Then("Input email")
    public void inputemail() {
        signInPage.inputEmail(UserConfig.USER_EMAIL);
    }

    @Then("Input password")
    public void inputPassword() {
        signInPage.inputPassword(UserConfig.USER_PASSWORD);
    }
}
