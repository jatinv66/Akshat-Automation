package APPIUM;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class TestcaseCalculator {
	static	AppiumDriver<MobileElement> driver;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		openCaculator();

	}
	
	public static void openCaculator() throws MalformedURLException {
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("deviceName", "realme Narzo 10A");
		cap.setCapability("udid", "");
		cap.setCapability("plateformVersion", "11");
	    cap.setCapability("appPackage", "com.coloros.calculator");
	    cap.setCapability("appActivity", "com.android.calculator2.Calculator");
	   
	    URL url=new URL("http://127.0.0.0.0:4723/wd/hub");
	driver=new AppiumDriver<MobileElement>(url,cap);
	
	}
}
