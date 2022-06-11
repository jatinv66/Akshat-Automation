package utlities;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.RemoteWebDriver;

public class CommonUtils {

    private static AppiumDriver<MobileElement> driver;
    private static ChromeDriver chromeDriver;
    private static URL serverURL;
    private static DesiredCapabilities capablities = new DesiredCapabilities();
    private static String APPIUM_PORT;
    private static int IMPLICIT_WAIT_TIME;
    private static int EXPLICIT_WAIT_TIME;
    private static String BASE_PKG;
    private static String APP_ACTIVITY;
    private static String APP_PATH;
    private static String BROWSER_NAME;
    private static String PLATFORM_NAME;
    private static String PLATFORM_VERSION;
    private static String DEVICE_NAME;
    private static String UDID;
    private static String BUNDLE_ID;
    private static String APP;
    private static String AUTO_GRANT_PERMISSION;
    private static String NO_RESET;
    private static String NEW_COMMAND_TIMEOUT;
    private static Properties prop = new Properties();
    private static FileInputStream fis;

    public static void loadAndroidConfigProperties(String loadConfigProperty) throws IOException {
        if(System.getProperty("os.name").toLowerCase().contains("linux"))
        {
            DEVICE_NAME = "4ce28a3d";
            PLATFORM_VERSION = "10";
            fis = new FileInputStream(System.getProperty("user.dir") + "/src/test/resources/properties/" + loadConfigProperty);
        }
        else if(System.getProperty("os.name").toLowerCase().contains("window"))
        {
            DEVICE_NAME = "4ce28a3d";
            PLATFORM_VERSION = "10";
            fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\" + loadConfigProperty);
        }
        prop.load(fis);
        IMPLICIT_WAIT_TIME = Integer.parseInt(prop.getProperty("implicitWait"));
        EXPLICIT_WAIT_TIME = Integer.parseInt(prop.getProperty("explicitWait"));
        BASE_PKG = prop.getProperty("basepackage");
        APP_ACTIVITY = prop.getProperty("activity");
        APPIUM_PORT = prop.getProperty("appiumPort");
        PLATFORM_NAME = prop.getProperty("platformName");
        BROWSER_NAME = prop.getProperty("browserName");
        AUTO_GRANT_PERMISSION = prop.getProperty("permission");
        NO_RESET = prop.getProperty("noReset");
        NEW_COMMAND_TIMEOUT = prop.getProperty("timeout");
    }

    public static void loadIosConfigProperties() {

    }

    public static void setAndroidCapablities() {
        capablities.setCapability(MobileCapabilityType.PLATFORM_NAME, PLATFORM_NAME);
        //	capablities.setCapability(CapabilityType.BROWSER_NAME, BROWSER_NAME);
        capablities.setCapability(MobileCapabilityType.PLATFORM_VERSION, PLATFORM_VERSION);
        capablities.setCapability(MobileCapabilityType.DEVICE_NAME, DEVICE_NAME);
        capablities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, BASE_PKG);
        capablities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, APP_ACTIVITY);
        capablities.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, AUTO_GRANT_PERMISSION);
        capablities.setCapability(MobileCapabilityType.NO_RESET, NO_RESET);
        capablities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, NEW_COMMAND_TIMEOUT);
    }

    public static void setIosCapablities() {

    }

    public static AppiumDriver<MobileElement> getAndroidDriver() throws MalformedURLException {
        serverURL = new URL("http://localhost:" + APPIUM_PORT + "/wd/hub");
        driver = new AndroidDriver<MobileElement>(serverURL, capablities);
        return driver;
    }

    public static void getChromeDriver() {
        System.setProperty("webdriver.chrome.driver", "B:\\chromedriver.exe");
    }

    public static AppiumDriver<MobileElement> getIosDriver() {
        return driver;
    }

}
