package questions;

import interactions.SwipeVertically;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;

import static ui.CarritoPage.*;

public class ValorArticulo implements Question<Boolean> {

    private String precio;

    public ValorArticulo(String precio) {
        this.precio = precio;
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        if ((VAL_TOTAL_ITEM(precio).resolveFor(actor).getAttribute("text")).contains(VAL_ART(precio).resolveFor(actor).getAttribute("text"))) {
            actor.attemptsTo(SwipeVertically.toDown(), Click.on(BTN_FINISH));
            return true;
        } else {
            return false;
        }

    }

    public static ValorArticulo validado(String precio) {
        return new ValorArticulo(precio);
    }

}
