package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class SignInPage {
    private final SelenideElement emailInput = $(By.cssSelector("#email"));
    private final SelenideElement passwordInput = $(By.cssSelector("#password"));

    public void inputEmail(String text) {
        this.emailInput.val(text);
    }

    public void inputPassword(String text) {
        this.passwordInput.val(text);
    }

}
