package stepDefinitions;

import digitalNomads.drivers.MainDriver;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class TextBoxSteps {

    WebDriver driver = MainDriver.getDriver();
    @Given("user should open {string}")
    public void user_should_open(String url) {
        driver.get(url);
    }
    @Given("verify Full Name text is displayed")
    public void verify_full_name_text_is_displayed() {
        Assert.assertTrue(driver.findElement(By.id("userName-label")).isDisplayed());
    }
    @Given("verify Email text is displayed")
    public void verify_email_text_is_displayed() {
        Assert.assertTrue(driver.findElement(By.id("userEmail-label")).isDisplayed());
    }
    @Given("verify Current Address text is displayed")
    public void verify_current_address_text_is_displayed() {
        Assert.assertTrue(driver.findElement(By.id("currentAddress-label")).isDisplayed());
    }
    @Given("verify Permanent Address text is displayed")
    public void verify_permanent_address_text_is_displayed() {
        Assert.assertTrue(driver.findElement(By.id("permanentAddress-label")).isDisplayed());
    }
    @Given("verify Submit button is displayed")
    public void verify_submit_button_is_displayed() {
        Assert.assertFalse(driver.findElement(By.id("userName-label")).isDisplayed());
    }

}
