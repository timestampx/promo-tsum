package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;

/**
 * Страница восстановления пароля
 */
@DefaultUrl("https://www.tsum.ru/password/forgot/")
public class ForgetPage extends PageObject {

    @FindBy(css = "[class=password-form]")
    public WebElement forgetPageSelector;

    /**
     * Проверяем, что страница восстановления пароля открылась
     * @return
     */
    public boolean forgetPageIsOpened() {
        return forgetPageSelector.isDisplayed();
    }
}
