package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features = {"src/test/resources/FeatureFile/Checkout.feature"},
//        tags = "@Checkout",
        glue = {"stepDefs","Utilities"},
        monochrome = true,
        publish = true,
       // dryRun = true,
        plugin = { "pretty",
               // "html:reports/cucumber-report.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
        }


)
public class TestRunner extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }

}