package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;
import pages.SignUpPage;

/**
 * Шаги для работы со страницей регистрации
 */
public class SignUpSteps extends ScenarioSteps {

    SignUpPage signUpPage;

    /**
     * Открываем страницу регистрации
     */
    @Step
    public void openPage() {
        signUpPage.open();
    }

    /**
     * Страница регистрации должна быть открыта
     */
    @Step
    public void signUpPageShouldBeOpened() {
        Assert.assertTrue("Страница регистрации не отображается",
                signUpPage.signUpPageIsOpened());
    }

    /**
     * Проверка заголовка страницы
     */
    @Step
    public void pageTitleShouldBePresent() {
        Assert.assertEquals("Заголовок страницы отличается от ожидаемого", signUpPage.title, signUpPage.getTitle());
    }

    /**
     * Открыть страницу регистрации с проверкой открытия
     */
    @StepGroup
    public void openSignUpPage() {
        openPage();
        signUpPageShouldBeOpened();
    }

    /**
     * Поле Емейл должно отображаться
     */
    @Step
    public void usernameFieldShouldBeVisible() {
        Assert.assertTrue("Поле Емейл не отображается",
                signUpPage.usernameFieldIsVisible());
    }

    /**
     * Ввести значение в поле Емейл
     * @param email
     */
    @Step
    public void setUsernameField(String email) {
        signUpPage.setUsernameField(email);
    }

    /**
     * Поле Пароль должно отображаться
     */
    @Step
    public void passwordFieldShouldBeVisible() {
        Assert.assertTrue("Поле Пароль не отображается",
                signUpPage.passwordFieldIsVisible());
    }

    /**
     * Ввести значение в поле Пароль
     * @param password
     */
    @Step
    public void setPasswordField(String password) {
        signUpPage.setPasswordField(password);
    }

    /**
     * Кнопка Зарегистрироваться должна отображаться
     */
    @Step
    public void signUpButtonShouldBeVisible() {
        Assert.assertTrue("Кнопка Зарегистрироваться не отображается",
                signUpPage.signUpButtonIsVisible());
    }

    /**
     * Кнопка Зарегистрироваться должна быть активна
     */
    @Step
    public void signUpButtonShouldBeEnabled() {
        Assert.assertTrue("Кнопка Зарегистрироваться не активна",
                signUpPage.signUpButtonIsEnabled());
    }

    /**
     * Кнопка Зарегистрироваться должна быть не активна
     */
    @Step
    public void signUpButtonShouldBeDisabled() {
        Assert.assertTrue("Кнопка Зарегистрироваться активна",
                signUpPage.signUpButtonIsDisabled());
    }

    /**
     * Клик по кнопке Зарегистрироваться
     */
    @Step
    public void clickSignUpButton() {
        signUpPage.clickSignUpButton();
    }
}
