package driverConfig;

import net.lightbody.bmp.BrowserMobProxyServer;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

public class Base {
    public static WebDriver driver;
    public static BrowserMobProxyServer server;


    @BeforeClass
    public static void init() {
        driver = DriverFactory.getDriver(BROWSER.CHROME);

    }

    @AfterClass
    public static void close() {
        //  driver.close();(For Proxy_Homework comment)
    }
    public static WebDriver getDriver() {
        return driver;
    }

}

