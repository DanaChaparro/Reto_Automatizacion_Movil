package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static ui.CarritoPage.TITTLE_ORDER_GEN;

public class OrdenCorrecta implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return TITTLE_ORDER_GEN.resolveFor(actor).getAttribute("text");
    }

    public static OrdenCorrecta generada() {
        return new OrdenCorrecta();
    }

}
