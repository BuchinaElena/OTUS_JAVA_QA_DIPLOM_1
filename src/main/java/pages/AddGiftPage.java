package pages;

import org.openqa.selenium.WebDriver;

public class AddGiftPage extends WishListPage{

    public AddGiftPage(WebDriver driver, String pashUsers){
        super(driver, pashUsers);
    }

    @Override
    public void open() {
        super.open();
    }

    public void addGift(String number){
        getCard(number);
        $(checkButtonInput).click();
        $(addButtonInput).click();
        $(nameInput).sendKeys("Подарок 1");
        $(descriptionInput).sendKeys("Очень подробное описание подарка");
        $(urlShop).sendKeys("https://www.ozon.ru/product/shevron-na-lipuchke-prikolnyy-zdes-mogla-byt-vasha-reklama-4-5-7-5-sm-1495267768/");
        $(price).sendKeys("123");
        $(urlImage).sendKeys("https://img10.reactor.cc/pics/post/не-реклама-реклама-цветной-текст-на-этом-месте-могла-быть-ваша-реклама-3392312.jpeg");
        $(buttonClick).click();
    }

    public void reserveGift(String number){
        getCard(number);
        $(checkButtonInput).click();
        $(reserveButton).click();
    }

    public void deleteList(String number){
        getCard(number);
        $(checkButtonInput).click();
        $(deleteList).click();
    }

}
