package utlities;

import java.io.File;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

public class AppiumServer {

	public static AppiumDriverLocalService service;

	public static void start() {

		// starting the Appium server code
		if(System.getProperty("os.name").toLowerCase().contains("linux"))
		{
			service = AppiumDriverLocalService.buildService(new AppiumServiceBuilder()
					.usingDriverExecutable(new File("/home/linuxbrew/.linuxbrew/bin/node"))
					.withAppiumJS(new File("/home/linuxbrew/.linuxbrew/lib/node_modules/appium/lib/main.js")));
			service.start();

			//TODO: Remove Log File no need as of Now
		}
		else if(System.getProperty("os.name").toLowerCase().contains("window"))
		{
			service = AppiumDriverLocalService.buildService(new AppiumServiceBuilder()
					.usingDriverExecutable(new File("C:\\Program Files\\nodejs\\node.exe"))
					.withAppiumJS(new File(
							"C:\\Program Files\\Appium\\resources\\app\\node_modules\\appium\\build\\lib\\main.js")));
			service.start();
		}
	}

	public static void stop() {

		service.stop();

	}

}
