package element;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

/**
 * Описание элементов для работы с хедером
 */
public class HeaderElement extends PageObject {

    @FindBy(css = ".header .header__top")
    public WebElement headerElement;
    @FindBy(css = ".header__private [href='/personal/orders/']")
    public WebElement emailElement;

    /**
     * Проверяем, что хедер отображается
     */
    public boolean headerIsPresent() {
        return headerElement.isDisplayed();
    }

    /**
     * Проверяем, что пользователь авторизован
     */
    public boolean emailIsPresent() {
        return emailElement.isDisplayed();
    }

}
