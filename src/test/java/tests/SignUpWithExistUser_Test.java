package tests;

import helpers.Helper;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import steps.HeaderSteps;
import steps.NoticeSteps;
import steps.SignUpSteps;

/**
 * Регистрация существующим пользователем.
 */
@RunWith(SerenityRunner.class)
public class SignUpWithExistUser_Test {

    @Managed(uniqueSession=true)
    WebDriver driver;

    @Steps
    SignUpSteps signUpSteps;
    @Steps
    Helper helper;
    @Steps
    NoticeSteps noticeSteps;
    @Steps
    HeaderSteps headerSteps;

    @Test
    public void signUpWithExistUser() {
        signUpSteps.openPage();
        helper.waitForLoad(driver);
        signUpSteps.signUpPageShouldBeOpened();

        String email = "myautotests@mail.ru";
        signUpSteps.usernameFieldShouldBeVisible();
        signUpSteps.setUsernameField(email);

        String password = "youautotest";
        signUpSteps.passwordFieldShouldBeVisible();
        signUpSteps.setPasswordField(password);

        signUpSteps.signUpButtonShouldBeVisible();
        signUpSteps.signUpButtonShouldBeEnabled();
        signUpSteps.clickSignUpButton();

        noticeSteps.noticeShouldBePresent();
        noticeSteps.noticeOldUserShouldBePresent();
    }
}
