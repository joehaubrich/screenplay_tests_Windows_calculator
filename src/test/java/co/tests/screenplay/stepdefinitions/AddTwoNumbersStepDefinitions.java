package co.tests.screenplay.stepdefinitions;

import co.tests.screenplay.questions.TheResult;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static co.tests.screenplay.model.NumberToOperateBuilder.theNumbers;
import static co.tests.screenplay.tasks.Add.add;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.Is.is;

public class AddTwoNumbersStepDefinitions {

    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @When("^I add (\\d+) and (\\d+)$")
    public void addTwoNumbers(int firstNumber, int secondNumber) {
        theActorCalled("Cesar").attemptsTo(add(theNumbers(firstNumber).and(secondNumber)));
    }

    @Then("^the result should be (\\d+)$")
    public void theResultShouldBe(int thisNumber) {
        theActorInTheSpotlight().should(seeThat(TheResult.ofTheSum(), is(thisNumber)));
    }

}
