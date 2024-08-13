package task;

import interactions.SwipeVertically;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static ui.CarritoPage.ART_CAMISA_ROJA;

public class AgregarArticulo implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                SwipeVertically.toDown(),
                Click.on(ART_CAMISA_ROJA)

        );
    }

    public static AgregarArticulo alCarrito() {
        return Tasks.instrumented(AgregarArticulo.class);
    }

}
