package pruebasdesoftware.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://localhost:8082/VistasProjectCitas/index.html")
public class HomePage extends PageObject {
    private HomePage(){}
    public static final Target ASIGNAR_CITA = Target.the("Campo de la vista agendar cita").locatedBy("//a[text()='Asignar citas']");
}
