package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by s.milaserdov on 12/15/2017.
 */
public class Page {

    public static WebDriver driver;

    public Page() {

        if (driver == null) {
            System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\src\\test\\java\\executables\\geckodriver.exe");

            driver = new FirefoxDriver();
            driver.get("http://google.com");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }
    }

}

