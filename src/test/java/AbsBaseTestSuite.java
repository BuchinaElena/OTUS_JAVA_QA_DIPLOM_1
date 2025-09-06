import factory.WebDriverFactory;
import log.Loger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public abstract class AbsBaseTestSuite extends Loger{

    protected WebDriver driver;

    @BeforeEach
    public void init() {
        logger.info("Инициализация подключения");
        this.driver = new WebDriverFactory().create();
    }

    @AfterEach
    public void endDriver() {
        if (driver != null) {
            logger.info("Драйвер офф");
            driver.quit();
        }
    }

}
