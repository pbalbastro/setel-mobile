import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class base {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 4 API 30 pat");
		cap.setCapability(MobileCapabilityType.APP, "/Tutorial/src/com.todoist_15.0.4-6030_minAPI21(nodpi)_apkmirror.com.apk");

	}

}
