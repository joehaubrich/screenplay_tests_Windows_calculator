package co.tests.screenplay.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class MainScreen {
 public static final Target ADD_BUTTON = Target.the("Add button").locatedBy("//*[@AutomationId='plusButton']");
 public static final Target MULTIPLY_BUTTON = Target.the("Multiply button").locatedBy("//*[@AutomationId='multiplyButton']");
 public static final Target NINE_BUTTON = Target.the("Nine button").locatedBy("//*[@AutomationId='num9Button']");
 public static final Target EQUALS_BUTTON = Target.the("Equals button").locatedBy("//*[@AutomationId='equalButton']");


}
