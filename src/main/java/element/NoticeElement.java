package element;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;

/**
 * Описание элементов для работы с уведомлениями
 */
public class NoticeElement extends PageObject {

    @FindBy(css=".notice .error")
    public WebElementFacade noticeErrorElement;

    public String errorMessage = "Операция невозможна, обратитесь в   Колл-центр";
    public String invalidEmailMessage = "Указан некорректный email";
    public String oldUserMessage = "Пользователь с таким email уже существует.";

    /**
     * Проверяем, что уведомление об ошибке отображается
     */
    public boolean noticeIsVisible() {
        noticeErrorElement.waitUntilPresent();
        return noticeErrorElement.isVisible();
    }

}
