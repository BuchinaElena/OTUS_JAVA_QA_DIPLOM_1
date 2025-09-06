import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import pages.AddGiftPage;
import pages.LoginPage;
import pages.MainPage;
import pages.WishListPage;

import java.util.List;

public class WishBoardTest extends AbsBaseTestSuite{

    String useLogin = System.getProperty("base.login");
    String usePassword = System.getProperty("base.password");
    String number = System.getProperty("base.number");
    String nameGift = System.getProperty("base.nameGift");
    String descriptionGift = System.getProperty("base.descriptionGift");
/*
    private void getQuantities(String command, List<WebElement> quantities) {

            if ((quantities.size() > 0) && (Integer.parseInt(number) <= quantities.size())) {
                String cads = command;
                logger.info(cads);

            } else {
                logger.info("Такого желания нет");
            }

    }*/

    @Test
    public void createGiftWebForm() {

        logger.info("Коннект к к браузеру с помощью выбранного драйвера");
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        logger.info("Авторизация");
        LoginPage loginPage = new LoginPage(driver, "login");
        loginPage.login(useLogin,usePassword);
        logger.info("Добавление позиции в вишлист");
        WishListPage wishListPage = new WishListPage(driver, "wishlists");
        wishListPage.create(nameGift,descriptionGift);
    }

    @Test
    public void checkGiftWebForm() {

        logger.info("Коннект к к браузеру с помощью выбранного драйвера");
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        logger.info("Авторизация");
        LoginPage loginPage = new LoginPage(driver, "login");
        loginPage.login(useLogin,usePassword);
        logger.info("Подсчитывание колличества позиций");
        WishListPage wishListPage = new WishListPage(driver, "wishlists");
        List<WebElement> quantities = wishListPage.quantitiesCard();
        logger.info(quantities);

        if((quantities.size()>0) && (Integer.parseInt(number)<=quantities.size())){
            String cads = wishListPage.check(number);
            logger.info(cads);
        }
        else {
            logger.info("Такого желания нет");
        }
    }

    @Test
    public void deleteGift() {
        logger.info("Коннект к к браузеру с помощью выбранного драйвера");
        MainPage mainPage = new MainPage(driver);
        mainPage.open();

        logger.info("Авторизация");
        LoginPage loginPage = new LoginPage(driver, "login");
        loginPage.login(useLogin,usePassword);

        logger.info("Удаление желания");
        WishListPage wishListPage = new WishListPage(driver,"wishlists");
        wishListPage.delete(number);

    }

    @Test
    public void addGiftWishList() {
        logger.info("Коннект к к браузеру с помощью выбранного драйвера");
        MainPage mainPage = new MainPage(driver);
        mainPage.open();

        logger.info("Авторизация");
        LoginPage loginPage = new LoginPage(driver, "login");
        loginPage.login(useLogin,usePassword);

        AddGiftPage addGiftPage = new AddGiftPage(driver,"wishlists");
        addGiftPage.addGift(number);
    }

    @Test
    public void reserveGiftWishList() {
        logger.info("Коннект к к браузеру с помощью выбранного драйвера");
        MainPage mainPage = new MainPage(driver);
        mainPage.open();

        logger.info("Авторизация");
        LoginPage loginPage = new LoginPage(driver, "login");
        loginPage.login(useLogin,usePassword);

        logger.info("Резервирование подарка");
        AddGiftPage addGiftPage = new AddGiftPage(driver,"wishlists");
        addGiftPage.reserveGift(number);
    }

    @Test
    public void deleteList() {
        logger.info("Коннект к к браузеру с помощью выбранного драйвера");
        MainPage mainPage = new MainPage(driver);
        mainPage.open();

        logger.info("Авторизация");
        LoginPage loginPage = new LoginPage(driver, "login");
        loginPage.login(useLogin,usePassword);

        logger.info("Резервирование подарка");
        AddGiftPage addGiftPage = new AddGiftPage(driver,"wishlists");
        addGiftPage.deleteList(number);
    }
}
