package driverManager;

import io.cucumber.java.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;


import java.io.IOException;

public class DriverFactory {
    protected static WebDriver driver;

    public DriverFactory() throws IOException {
        initializeWeb();
    }
    public void initializeWeb() throws IOException {
        try {
            if (driver == null) {
                setUp();
            }
        }
        catch (NullPointerException e) {
            System.out.println("Not found");
        }
    }
    @BeforeClass
    public void setUp() throws IOException {
        try {
            String browser = PropertyReader.getInstance().readProperty("browser");
            ChromeOptions option = new ChromeOptions();
            option.addArguments("incognito");
            if (browser.equalsIgnoreCase("chrome")){
                driver = new ChromeDriver();
            }
            else if (browser.equalsIgnoreCase("firefox")){
                driver = new FirefoxDriver();
            }
            else if (browser.equalsIgnoreCase("edge")){
                driver = new EdgeDriver();
            }
            try {
                Thread.sleep(5000);
            }
            catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

//    @AfterTest
//    public void tearDown() {
//        driver.quit();
//        driver = null;
//    }
}
