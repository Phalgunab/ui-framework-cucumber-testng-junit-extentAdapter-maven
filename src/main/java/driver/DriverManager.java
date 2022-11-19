package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {

    public static WebDriver driver = null;

    private DriverManager(){}

    public static WebDriver getDriver(){
        if(null==driver || ((ChromeDriver) driver).getSessionId()==null){
//            System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver.exe");
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        return driver;
    }
}
