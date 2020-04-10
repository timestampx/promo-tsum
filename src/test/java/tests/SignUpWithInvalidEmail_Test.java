package tests;

import helpers.Helper;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import steps.NoticeSteps;
import steps.SignUpSteps;

/**
 * Регистрация пользователем с некорректным Емейл
 */
@RunWith(SerenityRunner.class)
public class SignUpWithInvalidEmail_Test {
    @Managed(uniqueSession=true)
    WebDriver driver;

    @Steps
    SignUpSteps signUpSteps;
    @Steps
    Helper helper;
    @Steps
    NoticeSteps noticeSteps;

    @Test
    public void signUpWithInvalidEmail() {
        signUpSteps.openPage();
        helper.waitForLoad(driver);
        signUpSteps.signUpPageShouldBeOpened();

        String email = "myautotests";
        signUpSteps.usernameFieldShouldBeVisible();
        signUpSteps.setUsernameField(email);

        String password = "youautotest";
        signUpSteps.passwordFieldShouldBeVisible();
        signUpSteps.setPasswordField(password);

        signUpSteps.signUpButtonShouldBeVisible();
        signUpSteps.signUpButtonShouldBeEnabled();
        signUpSteps.clickSignUpButton();

        noticeSteps.noticeShouldBePresent();
        noticeSteps.noticeInvalidEmailShouldBePresent();
    }
}
