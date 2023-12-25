package locators.enumFactory;

import org.openqa.selenium.By;

public enum LoginEnum {

    //LoginPageLocator
    ENTER_USERNAME_LOCATOR(By.xpath("//input[@id='user-name']")),
    ENTER_PASSWORD_LOCATOR(By.xpath("//input[@id='password']")),
    CLICK_ON_LOGINBTN_LOCATOR(By.xpath("//input[@id='login-button']")),
    CLICK_ON_BURGER_MENU_LOCATOR(By.xpath("//button[@id='react-burger-menu-btn']")),
    CLICK_ON_LOGOUT_BTN_LOCATOR(By.xpath("//a[@id='logout_sidebar_link']"));


    private final By by;

    LoginEnum(By by) {
        this.by = by;
    }

    public By getBy(){
        return by;
    }
}
