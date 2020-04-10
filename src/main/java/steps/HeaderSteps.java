package steps;

import element.HeaderElement;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

/**
 * Методы работы с хедером
 */
public class HeaderSteps {

    HeaderElement headerElement;

    /**
     * Хедер должен отображаться на странице
     */
    @Step
    public void headerShouldBePresent() {
        headerElement.headerIsPresent();
    }

    /**
     * Авторизованный емейл должен отображаться
     * @param email
     */
    @Step
    public void emailShouldBePresent(String email) {
        headerElement.waitFor(headerElement.emailElement);
        headerElement.emailIsPresent();
        Assert.assertEquals("Емейл отличается от ожидаемого", email, headerElement.emailElement.getText());
    }

}
