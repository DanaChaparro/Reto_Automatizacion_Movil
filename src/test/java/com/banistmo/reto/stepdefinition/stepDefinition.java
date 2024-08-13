package com.banistmo.reto.stepdefinition;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import questions.OrdenCorrecta;
import questions.ValorArticulo;
import task.AgregarArticulo;
import task.IniciarSesion;
import task.Pagar;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class stepDefinition {

    @Managed(driver = "appium")
    public static WebDriver driver;

    @Dado("que el {actor} ha iniciado sesion")
    public void queActorHaIniciadoSesion(Actor actor) {
        actor.can(BrowseTheWeb.with(driver).asActor(actor));
        actor.entersTheScene();

        actor.wasAbleTo(
                IniciarSesion.ahora()
        );
    }

    @Cuando("agrega el articulo al carrito")
    public void agregaElArticuloAlCarrito() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                AgregarArticulo.alCarrito()
        );
    }

    @Cuando("realiza el pago del articulo")
    public void realizaElPagoDelArticulo(DataTable dataTable) {
        List<List<String>> items = dataTable.asLists(String.class);
        int fila = 1;
        OnStage.theActorInTheSpotlight().attemptsTo(
                Pagar.articulo(items.get(fila).get(0), items.get(fila).get(1), items.get(fila).get(2))
        );
    }

    @Entonces("deberia ver el valor {word} y su orden generada")
    public void deberiaVerElValorySuOrdenGenerada(String precio) {
        OnStage.theActorInTheSpotlight().should(seeThat(ValorArticulo.validado(precio)));
        OnStage.theActorInTheSpotlight().should(seeThat(OrdenCorrecta.generada(), equalTo("THANK YOU FOR YOU ORDER")));
    }

}
