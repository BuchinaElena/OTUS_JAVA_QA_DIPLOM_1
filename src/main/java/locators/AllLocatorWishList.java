package locators;

import org.openqa.selenium.By;

public class AllLocatorWishList {
    public By addButtonInput = By.xpath("//*[text()='Добавить подарок']");
    public By checkButtonInput = By.xpath("//*[text()='Просмотр']");
    public By userNameInput = By.xpath("//input[@type='text']");
    public By passwordInput = By.xpath("//input[@type='password']");
    public By buttonClick = By.xpath("//button[@type='submit']");
    public By emailInput = By.xpath("//input[@type='email']");
    public By buttonInput = By.xpath("//button[@type='submit']");
    public By createListButtonInput = By.xpath("//*[text()='Создать новый список']");
    public By nameInput = By.xpath("//input[@type='text']");
    public By descriptionInput = By.xpath("//textarea[@class='form-control']");
    public By createButtonInput = By.xpath("//button[@type='submit']");
    public By deleteButtonInput = By.xpath("//*[text()='Удалить']");
    public By cardInput = By.xpath("//*[@class='card']");
    public By nameGiftInput = By.xpath("//*[@class='card-title h5']");
    public By descriptionGiftInput = By.xpath("//*[@class='card-text']");
    public By urlShop = By.xpath("//input[@placeholder='https://example.com/product']");
    public By urlImage = By.xpath("//input[@placeholder='https://example.com/image.jpg']");
    public By price = By.xpath("//input[@type='number']");
    public By reserveButton = By.xpath("//*[text()='Зарезервировать']");
    public By deleteList = By.xpath("//*[text()='Удалить список']");
}
