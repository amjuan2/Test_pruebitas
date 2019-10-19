package pruebasdesoftware.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import pruebasdesoftware.interactions.Alerta;
import pruebasdesoftware.userinterface.RegistrarseUI;

import static pruebasdesoftware.userinterface.RegistrarseUI.*;

public class Registrarse implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("4324355454").into(CEDULA),
                Enter.theValue("Kevin Albeiro").into(RegistrarseUI.NOMBRE),
                Enter.theValue("19").into(EDAD), Enter.theValue("3775399").into(TELEFONO),
                Click.on(REGISTRARSE_BUTTON), Alerta.registrarCliente());
    }

    public static Registrarse enKevSura(){
        return Tasks.instrumented(Registrarse.class);
    }
}
