package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;
import pages.SignInPage;

/**
 * Шаги для работы со страницей авторизации
 */
public class SignInSteps extends ScenarioSteps {

    SignInPage signInPage;

    /**
     * Открываем страницу авторизации
     */
    @Step
    public void openPage() {
        signInPage.open();
    }

    /**
     * Страница авторизации должна быть открыта
     */
    @Step
    public void signInPageShouldBeOpened() {
        Assert.assertTrue("Страница авторизации не отображается",
                signInPage.signInPageIsOpened());
    }

    /**
     * Проверка заголовка страницы
     */
    @Step
    public void pageTitleShouldBePresent() {
        Assert.assertEquals("Заголовок страницы отличается от ожидаемого", signInPage.title, signInPage.getTitle());
    }

    /**
     * Открыть страницу авторизации с проверкой открытия
     */
    @StepGroup
    public void openSignInPage() {
        openPage();
        signInPageShouldBeOpened();
    }

    /**
     * Поле Емейл должно отображаться
     */
    @Step
    public void usernameFieldShouldBeVisible() {
        Assert.assertTrue("Поле Емейл не отображается",
                signInPage.usernameFieldIsVisible());
    }

    /**
     * Ввести значение в поле Емейл
     * @param email
     */
    @Step
    public void setUsernameField(String email) {
        signInPage.setUsernameField(email);
    }

    /**
     * Поле Пароль должно отображаться
     */
    @Step
    public void passwordFieldShouldBeVisible() {
        Assert.assertTrue("Поле Пароль не отображается",
                signInPage.passwordFieldIsVisible());
    }

    /**
     * Ввести значение в поле Пароль
     * @param password
     */
    @Step
    public void setPasswordField(String password) {
        signInPage.setPasswordField(password);
    }

    /**
     * Кнопка Войти должна отображаться
     */
    @Step
    public void signInButtonShouldBeVisible() {
        Assert.assertTrue("Кнопка Войти не отображается",
                signInPage.signInButtonIsVisible());
    }

    /**
     * Кнопка Войти должна быть активна
     */
    @Step
    public void signInButtonShouldBeEnabled() {
        Assert.assertTrue("Кнопка Войти не активна",
                signInPage.signInButtonIsEnabled());
    }

    /**
     * Кнопка Войти должна быть не активна
     */
    @Step
    public void signInButtonShouldBeDisabled() {
        Assert.assertTrue("Кнопка Войти активна",
                signInPage.signInButtonIsDisabled());
    }

    /**
     * Клик по кнопке Войти
     */
    @Step
    public void clickSignInButton() {
        signInPage.clickSignInButton();
    }

    /**
     * Ссылка "Забыли пароль" должна отображаться
     */
    @Step
    public void forgetPasswordLinkShouldBePresent() {
        Assert.assertTrue("Ссылка 'Забыли пароль?' не отображается",
                signInPage.forgetPasswordLinkIsVisible());
    }

    /**
     * Открыть ссылку "Забыли пароль?"
     */
    @Step
    public void openForgetPasswordLink() {
        signInPage.clickForgetPasswordLink();
    }

    /**
     * Спиннер кнопки Войти должен отображаться
     */
    @Step
    public void spinnerSignInButtonShouldBePresent() {
        Assert.assertTrue("Спиннер кнопки Войти не отображается",
                signInPage.spinnerSignInButtonIsVisible());
    }
}
