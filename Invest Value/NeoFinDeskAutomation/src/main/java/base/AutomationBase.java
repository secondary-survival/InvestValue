package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static data.DataProvider.dataProvider;
import static utils.Browser.Capability.setOptions;

/**
 * This is an automation base class for all UI automation scripts.
 */
public class AutomationBase {
    static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", dataProvider("chrome.driver.path"));
        driver = new ChromeDriver(setOptions());
        driver.get(dataProvider("url"));
        driver.quit();
    }
}