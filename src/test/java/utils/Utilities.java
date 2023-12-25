package utils;

import driverManager.DriverFactory;
import org.openqa.selenium.*;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class Utilities extends DriverFactory {

    private WebDriverWait wait;


    public Utilities (WebDriverWait wait) throws IOException {
        this.wait = wait;
    }

    public static void waitForVisibility10(WebElement element) {
        new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.visibilityOf(element));
    }


    public static void enterText(By elementLocator, String textToEnter) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(elementLocator));
        element.clear();
        element.sendKeys(textToEnter);
    }

    public static void clickOn(By elementLocator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(elementLocator));
        element.click();
    }
    public static boolean isElementPresent(String xpath){
        WebElement  element = driver.findElement(By.xpath(xpath));
        waitForVisibility10(element);
        if (element == null){
            return false;
        }else {
            return true;
        }
    }

    public static boolean AssertTitle(String expectedTitle){
        String actualResult = driver.getTitle();
        System.out.println("The Actual title is : " +actualResult);
        if(expectedTitle.equals(actualResult)) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void assertElementText(By by, String expectedText) {
        WebElement element = driver.findElement(by);
        String actualText = element.getText();
        System.out.println("The Actual result text is : " +actualText);
        Assert.assertEquals(actualText, expectedText, "Assertion Failed: Text does not match");
    }


    public static void waitForElementToBeClickable(String locatorValue){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locatorValue)));
    }

    public static void waitForElementToBeVisible(String locatorValue) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locatorValue)));
    }

    public static String takeScreenshot(WebDriver driver, String testName) throws InterruptedException {
        Thread.sleep(2000);
        TakesScreenshot scrShot = ((TakesScreenshot) driver);
        File src = scrShot.getScreenshotAs(OutputType.FILE);
        File dest = new File(System.getProperty("user.dir") + "//Screenshots//" + testName + ".png");

        try {
            FileHandler.copy(src, dest);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return System.getProperty("user.dir") + "//Screenshots//" + testName + ".png";
    }
}
