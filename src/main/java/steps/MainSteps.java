package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;
import pages.MainPage;

/**
 * Методы работы с главной страницей
 */
public class MainSteps extends ScenarioSteps {

    MainPage mainPage;

    /**
     * Открываем главную страницу
     */
    @Step
    public void openPage() {
        mainPage.open();
    }

    /**
     * Главная страница должна быть открыта
     */
    @Step
    public void mainPageShouldBeOpened() {
        mainPage.waitForTitleToAppear(mainPage.title);
        mainPage.waitFor(mainPage.mainPageSelector);
        Assert.assertTrue("Главная страница не отображается",
                mainPage.mainPageIsOpened());
    }

}
