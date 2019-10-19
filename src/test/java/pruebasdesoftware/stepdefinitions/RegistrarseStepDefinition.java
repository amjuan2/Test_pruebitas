package pruebasdesoftware.stepdefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import pruebasdesoftware.tasks.Registrarse;

public class RegistrarseStepDefinition {

    @When("^el llena todos los campos y se registra en la platafoma$")
    public void elLlenaTodosLosCamposYSeRegistraEnLaPlatafoma() {
        OnStage.theActorInTheSpotlight().attemptsTo(Registrarse.enKevSura());
    }


    @Then("^el debera verse registrado correctamente$")
    public void elDeberaVerseRegistradoCorrectamente() {
    }
}
