package factory.settings;

import exceptions.ModeNotSupportedException;
import log.Loger;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.AbstractDriverOptions;

public class FirefoxDriverSettings extends Loger implements IntSettings {

    @Override
    public AbstractDriverOptions settings(String mode) {
        FirefoxOptions firefoxOptions = new FirefoxOptions();

        switch (mode){
            case "headless": {
                logger.info("Открытие веббраузера в режиме headless");
                return firefoxOptions.addArguments("--headless");
            }
            case "fullscreen": {
                logger.info("Открытие веббраузера в режиме киоска");
                return firefoxOptions.addArguments("--fullscreen");//режим киоска
            }
            case "maximize": {
                logger.info("Открытие веббраузера в полноэкранный режиме");
                return firefoxOptions.addArguments("--start-maximized");//полноэкранный режим
            }
        }
        throw new ModeNotSupportedException(mode);
    }

}
