package pages;

import driverManager.PropertyReader;
import locators.enumFactory.LoginEnum;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utils.Utilities;

import java.io.IOException;

public class LoginPage {

    public LoginPage(WebDriver driver) throws IOException {
        PageFactory.initElements(driver,this);
    }

    //Performing Actions
    public void loginApp(String userName,String password) throws Exception {
        Utilities.enterText(LoginEnum.ENTER_USERNAME_LOCATOR.getBy(),userName);
        Utilities.enterText(LoginEnum.ENTER_PASSWORD_LOCATOR.getBy(),password);
        Utilities.clickOn(LoginEnum.CLICK_ON_LOGINBTN_LOCATOR.getBy());
//        Utilities.clickOn(LoginEnum.CLICK_ON_BURGER_MENU_LOCATOR.getBy());
//        Utilities.clickOn(LoginEnum.CLICK_ON_LOGOUT_BTN_LOCATOR.getBy());

    }


}
