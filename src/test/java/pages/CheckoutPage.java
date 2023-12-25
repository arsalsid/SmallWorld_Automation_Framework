package pages;

import io.cucumber.java.en.Then;
import locators.enumFactory.CheckoutEnum;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utils.Utilities;
import java.io.IOException;


public class CheckoutPage {

    public CheckoutPage(WebDriver driver) throws IOException {
        PageFactory.initElements(driver,this);
    }
    public void selectProduct() throws Exception {
        Utilities.clickOn(CheckoutEnum.CLICK_BACKPACK_LOCATOR.getBy());
        Utilities.clickOn(CheckoutEnum.CLICK_BACK_LIGHT_LOCATOR.getBy());
        Utilities.clickOn(CheckoutEnum.CLICK_BASKET_BTN_LOCATOR.getBy());
        Utilities.assertElementText(CheckoutEnum.VALIDATE_CART_PAGE_LOCATOR.getBy(),"Your Cart");
        Utilities.clickOn(CheckoutEnum.CLICK_REMOVED_CART_BTN_LOCATOR.getBy());
        Utilities.clickOn(CheckoutEnum.CLICK_CONTINUE_SHOPPING_BTN_LOCATOR.getBy());
        Utilities.clickOn(CheckoutEnum.CLICK_BOLT_TSHIRT_BTN_LOCATOR.getBy());
        Utilities.clickOn(CheckoutEnum.CLICK_BASKET_BTN_LOCATOR.getBy());
        Utilities.clickOn(CheckoutEnum.CLICK_CHECKOUT_BTN_LOCATOR.getBy());

    }

    public void fillCheckoutInformation(String firstName, String lastName, String postalCode) throws Exception {
        Utilities.enterText(CheckoutEnum.ENTER_CHECKOUT_INFO_FIRSTNAME_LOCATOR.getBy(),firstName);
        Utilities.enterText(CheckoutEnum.ENTER_CHECKOUT_INFO_LASTNAME_LOCATOR.getBy(),lastName);
        Utilities.enterText(CheckoutEnum.ENTER_CHECKOUT_INFO_POSTAL_CODE_LOCATOR.getBy(),postalCode);
        Utilities.assertElementText(CheckoutEnum.VALIDATE_CHECKOUT_INFO_PAGE_LOCATOR.getBy(), "Checkout: Your Information");
        Utilities.clickOn(CheckoutEnum.CLICK_CONTINUE_BTN_LOCATOR.getBy());
    }
}
