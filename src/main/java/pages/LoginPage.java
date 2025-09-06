package pages;

import org.openqa.selenium.WebDriver;

public class LoginPage extends AbsBasePage{

    public LoginPage(WebDriver driver, String pashLogin){
        super(driver, pashLogin);
    }

    @Override
    public void open() {
        super.open();
    }

    public LoginPage login(String useLogin, String usePassword){

        $(userNameInput).sendKeys(useLogin);
        $(passwordInput).sendKeys(usePassword);
        $(buttonClick).click();

        return null;
    }

}
