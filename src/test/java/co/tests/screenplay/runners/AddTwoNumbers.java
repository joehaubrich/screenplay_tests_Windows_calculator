package co.tests.screenplay.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions( features = { "src/test/resources/features/add_two_numbers.feature" },
                    glue = { "co.tests.screenplay.stepdefinitions" },
                    snippets = SnippetType.CAMELCASE)
public class AddTwoNumbers {

}
