package ui;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {

    public static final Target STANDARD_USER = Target.the("primer usuario").located(AppiumBy.androidUIAutomator("new UiSelector().text(\"standard_user\")"));
    //public static final Target USER_NAME = Target.the("username").located(AppiumBy.accessibilityId("test-Username"));
    //public static final Target PASS = Target.the("password").located(AppiumBy.accessibilityId("test-Password"));
    public static final Target LOGIN = Target.the("login").located(AppiumBy.accessibilityId("test-LOGIN"));

}
