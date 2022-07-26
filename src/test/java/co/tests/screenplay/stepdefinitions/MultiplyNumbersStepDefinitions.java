package co.tests.screenplay.stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;

import static co.tests.screenplay.userinterface.MainScreen.*;

public class MultiplyNumbersStepDefinitions {
    @Given("Andres multiplys nine and nine")
    public void andres_opens_the_calculator_application_on_his_windows_machine() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Click.on(NINE_BUTTON),
                Click.on(MULTIPLY_BUTTON),
                Click.on(NINE_BUTTON)
        );
    }

    @Then("he clicks equals and gets the result of eighty-one")
    public void he_clicks_equals_and_gets_the_result_of() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Click.on(EQUALS_BUTTON)
        );
    }
}
