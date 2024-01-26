package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import java.time.Duration;

import static common.Config.*;

public class CommonActions {
    private static WebDriver driver = null;

    private CommonActions() {
    }

    public static WebDriver createDriver() {
        if (driver == null) {
            switch (PLATFORM_AND_BROWSER) {
                case "win_chrome" -> driver = new ChromeDriver();
                case "win_firefox" -> driver = new FirefoxDriver();
                default -> Assert.fail("WebDriver could not be created! Check setting: " + PLATFORM_AND_BROWSER);
            }
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IMPLICITLY_WAIT));
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(PAGELOAD_TIMEOUT));
        }
        return driver;
    }
}
