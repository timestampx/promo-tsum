package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

/**
 * Главная страница
 */
@DefaultUrl("https://www.tsum.ru/")
public class MainPage extends PageObject {

    @FindBy(css = ".container.homepage")
    public WebElementFacade mainPageSelector;

    public String title = "ЦУМ - интернет-магазин одежды, обуви и аксессуаров ведущих мировых брендов";

    /**
     * Проверяем, что главная страница открылась
     */
    public boolean mainPageIsOpened() {
        return mainPageSelector.isVisible();
    }
}
