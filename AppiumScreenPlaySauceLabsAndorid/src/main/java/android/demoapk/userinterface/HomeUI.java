package android.demoapk.userinterface;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class HomeUI {

    public static final Target MENU_BUTTON = Target.the("menu button").located(MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"open menu\"]/android.widget.ImageView"));
    public static final Target HEADER_TXT = Target.the("Header text of products").located(MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"container header\"]/android.widget.TextView"));
    public static final Target CONFIRM_LOGOUT_BTN = Target.the("Button to confirm logout").located(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]"));
    public static final Target CONFIRM_LOGOUT_TXT = Target.the("Text to confirm logout").located(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView"));

}


