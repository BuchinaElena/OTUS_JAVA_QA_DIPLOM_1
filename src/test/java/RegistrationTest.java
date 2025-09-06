import org.junit.jupiter.api.Test;
import pages.LoginPage;
import pages.MainPage;
import pages.RegistrationPage;

public class RegistrationTest extends AbsBaseTestSuite{

    String useLogin = System.getProperty("base.login");
    String usePassword = System.getProperty("base.password");

    @Test
    public void registrationWebForm() {

        logger.info("Коннект к к браузеру с помощью выбранного драйвера");
        RegistrationPage registrationPage = new RegistrationPage(driver, "register");
        registrationPage.open();
        logger.info("Заполнение полей формы регистрации");
        registrationPage.registration(useLogin, usePassword);

    }

    @Test
    public void loginWebForm() {

        logger.info("Коннект к к браузеру с помощью выбранного драйвера");
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        logger.info("Авторизация");
        LoginPage loginPage = new LoginPage(driver, "login");
        loginPage.login(useLogin,usePassword);
    }
}
