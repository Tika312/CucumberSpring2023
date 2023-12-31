package digitalNomads.drivers;

import digitalNomads.utils.ConfigReader;
import org.openqa.selenium.WebDriver;

public class MainDriver {

    private MainDriver(){ // конструктор

    }

    private static WebDriver driver; // обьявление драйвера

    public static WebDriver getDriver(){
        if (driver == null){
            switch (ConfigReader.getPropertyOf("browser").toLowerCase()){
                case "chrome":
                    driver = ChromeWebDriver.loadWebDriver();
                    break;
                case  "edge":
                    driver = EdgeWebDriver.loadEdgeWebDriver();
                    break;
                case "firefox":
                    driver = FireFoxWebDriver.loadFireFoxWebDriver();
                    break;
                default:
                    throw new IllegalArgumentException("Please choose among chrome,edge,firefox browsers only");
            }
        }
        return driver;
    }

    public static void closeDriver(){
        try {
            if (driver!= null){
                driver.close();
                driver.quit();
                driver = null;
            }
        }catch (Exception e){
            System.out.println("Error while closing driver");
        }
    }
}
