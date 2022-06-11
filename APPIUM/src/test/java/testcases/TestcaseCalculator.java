package testcases;

import java.net.MalformedURLException;
import java.net.URL;

import base.BaseClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TestcaseCalculator extends BaseClass {
	static	AppiumDriver<MobileElement> driver;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		setUp();
//		openCaculator();

	}

	public static void openCaculator() throws MalformedURLException {
		DesiredCapabilities capablities=new DesiredCapabilities();
		capablities.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		//	capablities.setCapability(CapabilityType.BROWSER_NAME, BROWSER_NAME);
		capablities.setCapability(MobileCapabilityType.PLATFORM_VERSION, 10);
		capablities.setCapability(MobileCapabilityType.DEVICE_NAME, "4ce28a3d");
		capablities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.coloros.calculator");
		capablities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.android.calculator2.Calculator");
		capablities.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, true);
		capablities.setCapability(MobileCapabilityType.NO_RESET, false);
		capablities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 200);
	   
	    URL url=new URL("http://127.0.0.0.0:4723/wd/hub");
	driver=new AppiumDriver<MobileElement>(url,capablities);
	
	}
}
