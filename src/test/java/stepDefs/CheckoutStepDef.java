package stepDefs;

import driverManager.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import locators.enumFactory.CheckoutEnum;
import pages.CheckoutPage;
import utils.Utilities;

import java.io.IOException;

public class CheckoutStepDef extends DriverFactory {
    CheckoutPage checkout;

    public CheckoutStepDef() throws IOException {
        checkout = new CheckoutPage(driver);
    }

    @Then("User click on Products of Swag Labs")
    public void userClickOnProductsOfSwagLabs() throws Exception {
        checkout.selectProduct();
        Utilities.takeScreenshot(driver,"Add To Cart products");
    }

    @Then("User enter checkout information {string} and {string} and {string}")
    public void userEnterCheckoutInformationAndAnd(String firstName, String lastName, String postalCode) throws Exception {
        checkout.fillCheckoutInformation(firstName,lastName,postalCode);
        Utilities.takeScreenshot(driver,"Overview the Checkout Details");
    }

    @And("The total amount should be $ {double}")
    public void theTotalAmountShouldBe$(double expectedTotalAmount) throws InterruptedException {
        checkout.validateProductTotalPrice(expectedTotalAmount);
    }
}
