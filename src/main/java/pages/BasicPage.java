package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class BasicPage {

    public void clickButton(String text) {
        $(By.xpath("//a[text()='" + text + "']")).click();
    }

    public void clickButtonSpan(String text) {
        $(By.xpath("//button[text()='" + text + "']/.")).click();
    }

    public void contentIsVisible(String text) {
        $(By.xpath("//h3[text()='" + text + "']")).shouldBe(Condition.visible);
    }
}
