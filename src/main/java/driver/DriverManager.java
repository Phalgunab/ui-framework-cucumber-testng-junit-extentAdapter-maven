package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public final class DriverManager {

    private DriverManager(){}
    public static WebDriver driver = null;

    public static WebDriver getDriver(){
        if(null==driver ){
            System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver.exe");
            driver = new ChromeDriver();
        }
        return driver;

    }
}
