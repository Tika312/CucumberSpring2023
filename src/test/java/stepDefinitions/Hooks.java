package stepDefinitions;

import digitalNomads.drivers.MainDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;


public class Hooks {

    @Before
    public void setUp() {

    }
    @After
    public void tearDown(Scenario scenario) {

        if (scenario.isFailed()) {
            try {

                byte[] screenshot = ((TakesScreenshot) MainDriver.getDriver()).getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshot, "image/png", "screenshot");
            } catch (WebDriverException noSupportScreenshot) {
                System.err.println(noSupportScreenshot.getMessage());
            }
        }
        MainDriver.closeDriver();
    }
}
