package factory.settings;

import exceptions.ModeNotSupportedException;
import log.Loger;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.AbstractDriverOptions;

public class ChromeDriverSettings extends Loger implements IntSettings {

    @Override
    public AbstractDriverOptions settings(String mode) {
    ChromeOptions chromeOptions = new ChromeOptions();

    switch (mode){
        case "headless": {
            logger.info("Открытие веббраузера в режиме headless");
            return chromeOptions.addArguments("--headless");
        }
        case "fullscreen": {
            logger.info("Открытие веббраузера в режиме киоска");
            return chromeOptions.addArguments("--fullscreen");//режим киоска
        }
        case "maximize": {
            logger.info("Открытие веббраузера в полноэкранный режиме");
            return chromeOptions.addArguments("--start-maximized");//полноэкранный режим
        }
    }
    throw new ModeNotSupportedException(mode);
    }

}
