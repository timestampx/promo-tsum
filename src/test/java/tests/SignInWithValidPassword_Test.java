package tests;

import helpers.Helper;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import steps.HeaderSteps;
import steps.MainSteps;
import steps.SignInSteps;

/**
 * Авторизация. Вход аккаунтом с верным паролем
 */
@RunWith(SerenityRunner.class)
public class SignInWithValidPassword_Test {

    @Managed(uniqueSession=true)
    WebDriver driver;

    @Steps
    SignInSteps signInSteps;
    @Steps
    MainSteps mainSteps;
    @Steps
    HeaderSteps headerSteps;
    @Steps
    Helper helper;

    @Test
    public void signInWithValidPassword() {
        signInSteps.openPage();
        helper.waitForLoad(driver);
        signInSteps.signInPageShouldBeOpened();

        String email = "petr.mail.1970@mail.ru";
        signInSteps.usernameFieldShouldBeVisible();
        signInSteps.setUsernameField(email);

        String password = "autotest";
        signInSteps.passwordFieldShouldBeVisible();
        signInSteps.setPasswordField(password);

        signInSteps.signInButtonShouldBeVisible();
        signInSteps.signInButtonShouldBeEnabled();
        signInSteps.clickSignInButton();
        signInSteps.spinnerSignInButtonShouldBePresent();

        mainSteps.mainPageShouldBeOpened();
        headerSteps.headerShouldBePresent();
        headerSteps.emailShouldBePresent(email);
    }
}
