package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;

/**
 * Страница Регистрации
 */
@DefaultUrl("https://www.tsum.ru/registration/?")
public class SignUpPage extends PageObject {

    @FindBy(css = "auth-register")
    public WebElementFacade signUpPageSelector;
    @FindBy(css = "auth-register [type='email']")
    public WebElementFacade usernameField;
    @FindBy(css = "auth-register [type='password']")
    public WebElementFacade passwordField;
    @FindBy(css = "auth-register [type='submit']")
    public WebElementFacade signUpButton;
    @FindBy(css = "auth-register [type='submit'].ui-button_disabled")
    public WebElementFacade disabledsignUpButton;
    @FindBy(css = "auth-register [type='submit']:not([class*='ui-button_disabled'])")
    public WebElement enabledsignUpButton;

    public String title = "Регистрация";

    /**
     * Проверяем, что страница регистрации открылась
     */
    public boolean signUpPageIsOpened() {
        return signUpPageSelector.isVisible();
    }

    /**
     * Проверяем, что поле Емейл отображается
     */
    public boolean usernameFieldIsVisible() {
        return usernameField.isVisible();
    }

    /**
     * Ввести значение в поле "Емейл"
     */
    public void setUsernameField(String email) {
        usernameField.clear();
        usernameField.sendKeys(email);
    }

    /**
     * Проверяем, что поле Пароль отображается
     * @return
     */
    public boolean passwordFieldIsVisible() {
        return passwordField.isVisible();
    }

    /**
     * Ввести значение в поле Пароль
     * @param password
     */
    public void setPasswordField(String password) {
        passwordField.click();
        passwordField.sendKeys(password);
    }

    /**
     * Проверяем, что кнопка Зарегистрироваться отображается
     * @return
     */
    public boolean signUpButtonIsVisible() {
        return signUpButton.isVisible();
    }

    /**
     * Проверяем, что кнопка Зарегистрироваться активна
     * @return
     */
    public boolean signUpButtonIsEnabled() {
        signUpButton.waitUntilEnabled();
        return enabledsignUpButton.isEnabled();
    }

    /**
     * Проверяем, что кнопка Зарегистрироваться неактивна
     * @return
     */
    public boolean signUpButtonIsDisabled() {
        return disabledsignUpButton.isPresent();
    }

    /**
     * Нажимаем на кнопку Зарегистрироваться
     */
    public void clickSignUpButton() {
        signUpButton.click();
    }

}
