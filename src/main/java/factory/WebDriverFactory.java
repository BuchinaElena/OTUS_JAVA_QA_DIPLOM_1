package factory;

import exceptions.BrowserNotSupportedException;
import factory.settings.ChromeDriverSettings;
import factory.settings.FirefoxDriverSettings;
import factory.settings.IntSettings;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import log.Loger;

public class WebDriverFactory extends Loger{

    private final String browser = System.getProperty("base.browser").toLowerCase().trim();
    private final String mode = System.getProperty("base.mode");

    public WebDriver create(){
        switch (browser){
            case "chrome": {
                logger.info("Открытие chrome");
                WebDriverManager.chromedriver().setup();
                IntSettings settings = new ChromeDriverSettings();
                return new ChromeDriver((ChromeOptions) settings.settings(mode));
            }
            case "firefox": {
                logger.info("Открытие firefox");
                WebDriverManager.firefoxdriver().setup();
                IntSettings settings = new FirefoxDriverSettings();
                return new FirefoxDriver((FirefoxOptions) settings.settings(mode));
            }
        }
        throw new BrowserNotSupportedException(browser);
    }

}
