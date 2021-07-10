package group1.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

import java.util.Locale;

public class WebDriverFactory {
    public static WebDriver getDriver(String browserType) {
        WebDriver driver = null;
        switch (browserType.toLowerCase(Locale.ROOT)) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;

            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;

            case "opera":
                WebDriverManager.operadriver().setup();
                driver = new OperaDriver();
                break;

            case "edge":
                WebDriverManager.operadriver().setup();
                driver = new OperaDriver();
                break;


        }
        return driver;
    }
}
