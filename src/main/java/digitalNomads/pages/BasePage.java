package digitalNomads.pages;

import digitalNomads.drivers.MainDriver;
import org.openqa.selenium.support.PageFactory;


public abstract class BasePage {

    public BasePage(){
        PageFactory.initElements(MainDriver.getDriver(), this);
    }



}
