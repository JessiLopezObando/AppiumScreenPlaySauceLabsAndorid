package android.demoapk.driver;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSElement;
import io.github.cdimascio.dotenv.Dotenv;
import org.openqa.selenium.MutableCapabilities;


import java.net.MalformedURLException;
import java.net.URL;

public class AndroidDriverr {
    public static AndroidDriver<AndroidElement> driver;

    public static AndroidDriverr configureDriver() throws MalformedURLException {

        Dotenv dotenv = Dotenv.configure().load();

        String browserstackUser = dotenv.get("BROWSERSTACK_USER");
        String browserstackKey = dotenv.get("BROWSERSTACK_KEY");

        try {
            MutableCapabilities caps = new MutableCapabilities();
            caps.setCapability("platformName","Android");
            caps.setCapability("appium:deviceName","Android GoogleAPI Emulator");
            caps.setCapability("appium:deviceOrientation", "portrait");
            caps.setCapability("appium:platformVersion","12.0");
            caps.setCapability("appium:automationName", "UiAutomator2");
            caps.setCapability("appium:app", "storage:filename=Android-MyDemoAppRN.1.3.0.build-244.apk");
            MutableCapabilities sauceOptions = new MutableCapabilities();
            sauceOptions.setCapability("build", "appium-build-ICM7Y");
            sauceOptions.setCapability("name", "Testing");
            caps.setCapability("sauce:options", sauceOptions);


            URL url = new URL("https://oauth-jelopez80-b7389:4111b945-c324-4f3c-bd9f-69c1e1ba1dc6@ondemand.us-west-1.saucelabs.com:443/wd/hub");

            driver = new AndroidDriver(url, caps);

        }catch (MalformedURLException e){
            e.printStackTrace();
        }
        return new AndroidDriverr();
    }

    public AndroidDriver<AndroidElement> start(){
        return driver;
    }
}

