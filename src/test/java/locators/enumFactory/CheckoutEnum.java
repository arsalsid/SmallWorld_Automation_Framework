package locators.enumFactory;

import org.openqa.selenium.By;

public enum CheckoutEnum {

    //CheckoutLocator
    CLICK_BACKPACK_LOCATOR(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")),
    CLICK_BACK_LIGHT_LOCATOR(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']")),
    CLICK_BASKET_BTN_LOCATOR(By.xpath("//a[@class='shopping_cart_link']")),
    VALIDATE_CART_PAGE_LOCATOR(By.xpath("//span[text()='Your Cart']")),
    CLICK_REMOVED_CART_BTN_LOCATOR(By.xpath("//button[@id='remove-sauce-labs-bike-light']")),
    CLICK_CONTINUE_SHOPPING_BTN_LOCATOR(By.xpath("//button[@id='continue-shopping']")),
    CLICK_BOLT_TSHIRT_BTN_LOCATOR(By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']")),
    CLICK_CHECKOUT_BTN_LOCATOR(By.xpath("//button[@id='checkout']")),
    ENTER_CHECKOUT_INFO_FIRSTNAME_LOCATOR(By.xpath("//input[@id='first-name']")),
    ENTER_CHECKOUT_INFO_LASTNAME_LOCATOR(By.xpath("//input[@id='last-name']")),
    ENTER_CHECKOUT_INFO_POSTAL_CODE_LOCATOR(By.xpath("//input[@id='postal-code']")),

    VALIDATE_CHECKOUT_INFO_PAGE_LOCATOR(By.xpath("//span[text()='Checkout: Your Information']")),
    CLICK_CONTINUE_BTN_LOCATOR(By.xpath("//input[@id='continue']")),
    PRODUCT_ITEM_A_LOCATOR(By.xpath("(//div[@class='inventory_item_price'])[1]")),
    PRODUCT_ITEM_B_LOCATOR(By.xpath("(//div[@class='inventory_item_price'])[2]")),
    FINISH_BTN_LOCATOR(By.xpath("//button[@id='finish']")),
    VALIDATE_CHECKOUT_SUCCESS_MSG_LOCATOR(By.xpath("//h2[text()='Thank you for your order!']")),
    BACK_TO_HOMEPAGE_BTN_LOCATOR(By.xpath("//button[@id='back-to-products']")),
    CLICK_ON_BURGER_MENU_LOCATOR(By.xpath("//button[@id='react-burger-menu-btn']")),
    CLICK_ON_LOGOUT_BTN_LOCATOR(By.xpath("//a[@id='logout_sidebar_link']"));

    private final By by;

    CheckoutEnum(By by) {
        this.by = by;
    }

    public By getBy(){
        return by;
    }


}
