package tests.search;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;
import pages.avito.AvitoHomePage;
import pages.avito.AvitoSearchResultsPage;
import tests.BaseTest;

public class SearchTests extends BaseTest {

    protected AvitoHomePage avitoHomePage = new AvitoHomePage(driver);
    protected AvitoSearchResultsPage avitoSearchResultsPage = new AvitoSearchResultsPage(driver);

    /*
    @AfterSuite(alwaysRun = true)

    public void afterTest() {
        System.out.println("Closing the WebDriver...");
        driver.close();
    }
    */

    @Test
    public void searchTest() {
        avitoHomePage
                .navigateToUrl("https://www.avito.ru/");

        avitoHomePage
                .inputSearchString("ball")
                .clickFindButton();

        avitoSearchResultsPage
                .checkSearchResultsPageOpened();
    }




}
