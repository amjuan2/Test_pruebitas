package pruebasdesoftware.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/agendar_cita.feature",
        snippets= SnippetType.CAMELCASE,
        glue="pruebasdesoftware.stepdefinitions")
public class AgendarCita {
}
