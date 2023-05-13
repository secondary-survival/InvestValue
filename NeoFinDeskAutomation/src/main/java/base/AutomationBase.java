package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import static data.DataProvider.dataProvider;
import static utils.Browser.Capability.setOptions;

/**
 * This is an automation base class for all UI automation scripts.
 */
class AutomationBase {
    static WebDriver driver;

    @BeforeSuite
    public static void suiteSetup() {
        System.setProperty("webdriver.chrome.driver", dataProvider("chrome.driver.path"));
        driver = new ChromeDriver(setOptions());
        driver.get(dataProvider("url"));
    }

    @AfterSuite
    public static void suiteTearDown(){
        driver.quit();
    }
}