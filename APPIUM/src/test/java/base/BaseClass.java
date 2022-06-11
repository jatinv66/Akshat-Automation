package base;

import java.io.IOException;

import utlities.AppiumServer;
import utlities.CommonUtils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class BaseClass {

    public static AppiumDriver<MobileElement> driver;
    public static String loadPropertiesFile = "android.properties";

    public static void setUp() {
    	
        if (driver == null) {
            if (loadPropertiesFile.contains("android")) {
                AppiumServer.start();
                try {
                    CommonUtils.loadAndroidConfigProperties(loadPropertiesFile);
                    CommonUtils.setAndroidCapablities();
                    driver = CommonUtils.getAndroidDriver();
                } catch (IOException e) {
                    e.printStackTrace();

                }

            } else if (loadPropertiesFile.contains("ios")) {

            }
        }

    }

    public void quit() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
        AppiumServer.stop();
    }

}
