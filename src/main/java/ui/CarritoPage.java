package ui;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class CarritoPage {

    public static final Target ART_CAMISA_ROJA = Target.the("camisa roja").located(AppiumBy.androidUIAutomator("new UiSelector().description(\"test-ADD TO CART\").instance(3)"));
    public static final Target CARRITO_COMPRAS = Target.the("carrito").located(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(3)"));
    public static final Target TITTLE_ORDER_GEN = Target.the("tittle orden generada").located(AppiumBy.androidUIAutomator("new UiSelector().text(\"THANK YOU FOR YOU ORDER\")"));
    //public static final Target VAL_ART = Target.the("valor articulo").located(AppiumBy.androidUIAutomator("new UiSelector().text(\"$15.99\")"));
    //public static final Target ITEM_TOTAL = Target.the("item total").located(AppiumBy.androidUIAutomator("new UiSelector().text(\"Item total: $15.99\")"));
    public static final Target BTN_CHECKOUT = Target.the("username").located(AppiumBy.accessibilityId("test-CHECKOUT"));
    public static final Target FIRST_NAME = Target.the("firstname").located(AppiumBy.accessibilityId("test-First Name"));
    public static final Target LAST_NAME = Target.the("lastname").located(AppiumBy.accessibilityId("test-Last Name"));
    public static final Target POSTAL_CODE = Target.the("postalcode").located(AppiumBy.accessibilityId("test-Zip/Postal Code"));
    public static final Target BTN_CONTINUE = Target.the("boton continuar").located(AppiumBy.accessibilityId("test-CONTINUE"));
    public static final Target BTN_FINISH = Target.the("boton finalizar").located(AppiumBy.accessibilityId("test-FINISH"));

    public static Target VAL_TOTAL_ITEM(String precio) {
        return Target.the("valor total item").located(AppiumBy.xpath("//android.widget.TextView[@text=\"Item total: $" + precio + "\"]"));
    }

    public static Target VAL_ART(String precio) {
        return Target.the("valor total item").located(AppiumBy.xpath("//android.widget.TextView[@text=\"$" + precio + "\"]"));
    }

}
