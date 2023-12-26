package utils;

import driverManager.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Hooks extends DriverFactory {

    // Assuming that DriverFactory initializes the 'driver' instance
    public Hooks() throws Exception {
        super(); // Make sure DriverFactory initializes the 'driver' instance
    }

    @After(order = 0)
    public void tearDown(Scenario scenario) throws Exception {
        if (driver != null) {
            driver.quit();
        }
    }

    @After(order = 2)
    public void takeScreenshotOnFailedScenario(Scenario scenario) {
        System.out.println("Taking screenshot from Cucumber After hook with order=2 if the scenario fails");
        if ((scenario.isFailed())) {
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }
    }
}
