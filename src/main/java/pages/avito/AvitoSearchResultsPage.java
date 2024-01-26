package pages.avito;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.BasePage;

public class AvitoSearchResultsPage extends BasePage {
    public AvitoSearchResultsPage(WebDriver driver) {
        super(driver);
    }

    private final By SEARCH_RESULTS_PAGE_TITLE_XPATH = By.xpath("//div[@data-marker='page-title']");

    public void checkSearchResultsPageOpened() {

        Assert.assertTrue(waitWebElementIsVisible(driver.findElement(SEARCH_RESULTS_PAGE_TITLE_XPATH)).isDisplayed(),
                "Element " + SEARCH_RESULTS_PAGE_TITLE_XPATH + " not found");
    }
}
