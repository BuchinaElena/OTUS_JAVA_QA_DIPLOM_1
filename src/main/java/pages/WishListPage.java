package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class WishListPage extends AbsBasePage{

    public WishListPage(WebDriver driver, String pashWishList){
        super(driver, pashWishList);
    }

    public void create(String nameGift, String descriptionGift){
        $(createListButtonInput).click();
        $(nameInput).sendKeys(nameGift);
        $(descriptionInput).sendKeys(descriptionGift);
        $(createButtonInput).click();
    }

    public String check(String number){
        WebElement card = getCard(number);
        String getName = card.findElement(nameGiftInput).getText();
        String getDescription = card.findElement(descriptionGiftInput).getText();
        return String.format("Название: %s \n Описание: %s", getName, getDescription);
    }

    public void delete(String number){
        getCard(number);
        $(deleteButtonInput).click();
    }

    public List<WebElement> quantitiesCard(){
        List<WebElement> cards = $$$(cardInput);
        return cards;
    }

    public WebElement getCard(String number){
        return quantitiesCard().get(Integer.parseInt(number));
    }


    //     driver.switchTo().alert().accept();

}
