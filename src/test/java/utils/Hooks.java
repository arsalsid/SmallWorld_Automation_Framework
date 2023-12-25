package utils;

import driverManager.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;

import java.io.IOException;

public class Hooks {


    public Hooks(WebDriver driver) throws Exception {

    }


//    @After(order = 0)
//    public void quitDriver(Scenario scenario) throws Exception {
////        quitDriver();
//        System.out.println("Testomng@@@@@@@@22");
//        driver.quit();
//        driver= null;
//    }
//
//    @After(order = 2)
//    public void takeScreenshotOnFailedScenario(Scenario scenario) {
//
//        System.out.println("Taking screenshot from Cucumber After hook with order=2 if the scenario fails");
//        if ((scenario.isFailed())) {
//            final byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
//            scenario.attach(screenshot, "image/png", scenario.getName());
//        }
//    }

}
