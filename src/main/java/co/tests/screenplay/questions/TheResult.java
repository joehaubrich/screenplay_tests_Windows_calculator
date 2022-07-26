package co.tests.screenplay.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;

import static co.tests.screenplay.userinterface.CalculatorPage.RESULT;

@Subject("the result of the sum")
public class TheResult implements Question<Integer> {

    @Override
    public Integer answeredBy(Actor actor) {
        return Integer.parseInt(RESULT.resolveFor(actor).getText().replace("Display is", "").trim());
    }

    public static TheResult ofTheSum() {
        return new TheResult();
    }
}
