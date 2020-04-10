package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;
import pages.ForgetPage;

/**
 * Методы работы со страницей Восстановление пароля
 */
public class ForgetSteps extends ScenarioSteps {

    ForgetPage forgetPage;

    /**
     * Страница восстановления пароля должна быть открыта
     */
    @Step
    public void forgetPageShouldBeOpened() {
        Assert.assertTrue("Страница восстановления пароля не отображается",
                forgetPage.forgetPageIsOpened());
    }

}
