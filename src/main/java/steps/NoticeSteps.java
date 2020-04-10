package steps;

import element.NoticeElement;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * Методы работы с уведомлениями
 */
public class NoticeSteps extends ScenarioSteps {

    NoticeElement noticeElement;

    /**
     * Уведомление должно отображаться на странице
     */
    @Step
    public void noticeShouldBePresent() {
        noticeElement.noticeIsVisible();
    }

    /**
     * Уведомление не должно отображаться на странице
     */
    @Step
    public void noticeShouldNotBePresent() {
        noticeElement.shouldNotBeVisible(noticeElement.noticeErrorElement);
    }

    /**
     * Уведомление об ошибке должно отображаться на странице
     */
    @Step
    public void noticeErrorShouldBePresent() {
        assertThat(noticeElement.noticeErrorElement.getText(), is(noticeElement.errorMessage));
    }

    /**
     * Уведомление о некорректном емейл должно отображаться на странице
     */
    @Step
    public void noticeInvalidEmailShouldBePresent() {
        assertThat(noticeElement.noticeErrorElement.getText(), is(noticeElement.invalidEmailMessage));
    }

    /**
     * Уведомление о существующем пользователе должно отображаться на странице
     */
    @Step
    public void noticeOldUserShouldBePresent() {
        assertThat(noticeElement.noticeErrorElement.getText(), is(noticeElement.oldUserMessage));
    }

}
