package task;

import interactions.SwipeVertically;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static ui.LoginPage.LOGIN;
import static ui.LoginPage.STANDARD_USER;

public class IniciarSesion implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                SwipeVertically.toDown(),
                Click.on(STANDARD_USER),
                SwipeVertically.toUp(),
                Click.on(LOGIN)

        );
    }

    public static IniciarSesion ahora() {
        return Tasks.instrumented(IniciarSesion.class);
    }

}
