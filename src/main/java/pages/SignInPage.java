package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;

/**
 * Страница авторизации
 */
@DefaultUrl("https://www.tsum.ru/login/?")
public class SignInPage extends PageObject {

    @FindBy(css = "auth-login .auth-form")
    public WebElementFacade signInPageSelector;
    @FindBy(css = ".auth-form .login-input")
    public WebElementFacade usernameField;
    @FindBy(css = ".auth-form .pwd-input")
    public WebElementFacade passwordField;
    @FindBy(css = ".auth-form [type='submit']")
    public WebElementFacade signInButton;
    @FindBy(css = ".auth-form [type='submit'].ui-button_disabled")
    public WebElementFacade disabledSignInButton;
    @FindBy(css = ".auth-form [type='submit']:not([class*='ui-button_disabled'])")
    public WebElement enabledSignInButton;
    @FindBy(css = ".auth-form .forget-pwd")
    public WebElementFacade forgetPasswordLink;
    @FindBy(css = ".ui-spinner")
    public WebElementFacade spinnerSelector;

    public String title = "Онлайн каталог интернет магазина ЦУМ - Вход";

    /**
     * Проверяем, что страница авторизации открылась
     */
    public boolean signInPageIsOpened() {
        return signInPageSelector.isVisible();
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
     * Проверяем, что кнопка Войти отображается
     * @return
     */
    public boolean signInButtonIsVisible() {
        return signInButton.isVisible();
    }

    /**
     * Проверяем, что кнопка Войти активна
     * @return
     */
    public boolean signInButtonIsEnabled() {
        signInButton.waitUntilEnabled();
        return enabledSignInButton.isEnabled();
    }

    /**
     * Проверяем, что кнопка Войти неактивна
     * @return
     */
    public boolean signInButtonIsDisabled() {
        return disabledSignInButton.isPresent();
    }

    /**
     * Нажимаем на кнопку Войти
     */
    public void clickSignInButton() {
        signInButton.click();
    }

    /**
     * Проверяем, что ссылка "Забыли пароль?" отображается
     * @return
     */
    public boolean forgetPasswordLinkIsVisible() {
        return forgetPasswordLink.isVisible();
    }

    /**
     * Нажимаем ссылку "Забыли пароль?"
     */
    public void clickForgetPasswordLink() {
        forgetPasswordLink.click();
    }

    /**
     * Проверяем, что спинер кнопки Войти отображается
     * @return
     */
    public boolean spinnerSignInButtonIsVisible() {
        return spinnerSelector.isPresent();
    }
}
