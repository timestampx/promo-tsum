package tests;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import steps.ForgetSteps;
import steps.SignInSteps;

/**
 * Авторизация. Восстановление пароля. Переход по ссылке "Забыли пароль?”
 */
@RunWith(SerenityRunner.class)
public class OpenForgetPasswordLink_Test {

    @Managed(uniqueSession=true)
    WebDriver driver;

    @Steps
    SignInSteps signInSteps;
    @Steps
    ForgetSteps forgetSteps;

    @Test
    public void openForgetPasswordLink() {
        signInSteps.openPage();
        signInSteps.signInPageShouldBeOpened();

        signInSteps.forgetPasswordLinkShouldBePresent();
        signInSteps.openForgetPasswordLink();

        forgetSteps.forgetPageShouldBeOpened();
    }
}
