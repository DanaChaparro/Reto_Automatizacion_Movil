package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static ui.CarritoPage.*;

public class Pagar implements Task {

    private String firstName;
    private String lastName;
    private String postalCode;

    public Pagar(String firstName, String lastName, String postalCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.postalCode = postalCode;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Click.on(CARRITO_COMPRAS),
                Click.on(BTN_CHECKOUT),
                Enter.theValue(firstName).into(FIRST_NAME),
                Enter.theValue(lastName).into(LAST_NAME),
                Enter.theValue(postalCode).into(POSTAL_CODE),
                Click.on(BTN_CONTINUE)

        );
    }

    public static Pagar articulo(String firstName, String lastName, String postalCode) {
        return Tasks.instrumented(Pagar.class, firstName, lastName, postalCode);
    }

}