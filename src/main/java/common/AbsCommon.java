package common;

import locators.AllLocatorWishList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public abstract class AbsCommon extends AllLocatorWishList {

    protected WebDriver driver;

    public AbsCommon(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement $(By locator){
        return driver.findElement(locator);
    }

    protected Select $$(By locator) {
        return new Select(driver.findElement(locator));
    }

    public List<WebElement> $$$(By locator){
        return driver.findElements(locator);
    }

}
