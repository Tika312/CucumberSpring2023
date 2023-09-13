package digitalNomads.pages;

import digitalNomads.drivers.MainDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class TextBoxPage extends BasePage{


    @FindBy(id = "userName-label")
    public WebElement fullNameText;

    @FindBy(id = "userEmail-label")
    public WebElement userEmailText;

    @FindBy(id = "currentAddress-label")
    public WebElement userCurrentAddressText;

    @FindBy(id = "permanentAddress-label")
    public WebElement userPermanentAddressText;

}
