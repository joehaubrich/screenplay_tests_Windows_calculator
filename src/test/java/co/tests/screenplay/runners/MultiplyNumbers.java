package co.tests.screenplay.runners;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/multiply_numbers.feature",
        glue = "co.tests.screenplay.stepdefinitions"
)

public class MultiplyNumbers {

}