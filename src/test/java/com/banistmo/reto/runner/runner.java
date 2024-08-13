package com.banistmo.reto.runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)

@CucumberOptions(
        features = "src/test/resources/features/comprar.feature",
        tags = "@comprar",
        glue = {"com.banistmo.reto.stepdefinition"},
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class runner {
}
