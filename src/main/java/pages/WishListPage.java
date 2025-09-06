package pages;

import org.openqa.selenium.By;
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
        String getName = card.findElement(By.xpath(".//div[@class='card-title h5']")).getText();
        String getDescription = card.findElement(By.xpath("(.//p[@class='card-text'])[1]")).getText();
        return String.format("Название: %s \n Описание: %s", getName, getDescription);
    }

    public void delete(String number){
        getCard(number);
        $(deleteButtonInput).click();
    }

    public List<WebElement> quantitiesCard(){
        return $$$(cardInput);
    }

    public WebElement getCard(String number){
        return quantitiesCard().get(Integer.parseInt(number));
    }

}
