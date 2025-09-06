package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage extends AbsBasePage{

    public RegistrationPage(WebDriver driver, String pashRegistration){
        super(driver, pashRegistration);
    }

    @Override
    public void open() {
        super.open();
    }

    public void registration(String useLogin, String usePassword){

        $(userNameInput).sendKeys(useLogin);
        $(emailInput).sendKeys("ebushina@test.ru");
        $(passwordInput).sendKeys(usePassword);
        $(buttonInput).click();
    }

}
