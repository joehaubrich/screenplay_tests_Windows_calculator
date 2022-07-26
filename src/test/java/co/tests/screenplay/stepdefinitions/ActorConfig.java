package co.tests.screenplay.stepdefinitions;

import cucumber.api.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class ActorConfig {

    @Before
    public void actorConfig(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Andres");
    }
}