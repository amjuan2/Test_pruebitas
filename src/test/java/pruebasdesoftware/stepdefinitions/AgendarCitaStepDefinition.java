package pruebasdesoftware.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import pruebasdesoftware.tasks.Agendar;
import pruebasdesoftware.userinterface.HomePage;

public class AgendarCitaStepDefinition {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^que (.*) se encuentra en la plataforma de KevSura$")
    public void queElUsuarioSeEncuentraEnLaPlataformaDeKevSura(String user) {
        OnStage.theActorCalled(user).attemptsTo(Open.browserOn().the(HomePage.class));
    }

    @When("^el se dirige a la pantalla de asignar citas y asigna una cita disponible$")
    public void elSeDirigeALaPantallaDeAsignarCitasYAsignaUnaCitaDisponible() {
        OnStage.theActorInTheSpotlight().attemptsTo(Agendar.cita());
    }

    @Then("^el debera ver que la cita se agendo correctamente$")
    public void elDeberaVerQueLaCitaSeAgendoCorrectamente() {
    }
}
