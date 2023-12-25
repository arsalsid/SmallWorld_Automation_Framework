package stepDefs;

import driverManager.DriverFactory;
import driverManager.PropertyReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import utils.Utilities;


public class LoginStepDef extends DriverFactory {
    LoginPage login;

    public LoginStepDef() throws Exception {
        login = new LoginPage(driver);
    }

    @When("User Navigates to Sauce Demo Website URL")
    public void userNavigatesToURL() throws Exception {
       String url = PropertyReader.getInstance().readProperty("URL");
       driver.get(url);
       Utilities.takeScreenshot(driver,"Launch the application");
    }

    @Then("I login with Application {string} and {string}")
    public void iLoginWithApplicationAnd(String userName, String password) throws Exception {
        login.loginApp(userName,password);
        Utilities.AssertTitle("Swag Labs");
        Utilities.takeScreenshot(driver,"Login an Application with valid credentials");
    }

}
