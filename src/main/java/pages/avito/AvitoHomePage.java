package pages.avito;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class AvitoHomePage extends BasePage {

    public AvitoHomePage(WebDriver driver) {
        super(driver);
    }

    private final By LOGO_DIV_XPATH = By.xpath("//div[@class='index-logo-K90gi']");
    private final By SEARCH_INPUT_XPATH = By.xpath("//input[@type='text' and contains(@data-marker, 'search-form')]");
    private final By FIND_BUTTON_XPATH = By.xpath("//button[@type='button' and @data-marker='search-form/submit-button']");

    public AvitoHomePage clickLogo() {
        driver.findElement(LOGO_DIV_XPATH).click();
        return this;
    }

    public AvitoHomePage clickFindButton() {
        driver.findElement(FIND_BUTTON_XPATH).click();
        return this;
    }

    public AvitoHomePage inputSearchString(String searchString) {
        driver.findElement(SEARCH_INPUT_XPATH).sendKeys(searchString);
        return this;
    }
}
