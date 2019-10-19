package pruebasdesoftware.tasks;

import net.serenitybdd.core.time.InternalSystemClock;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static pruebasdesoftware.userinterface.AgendarCita.*;
import static pruebasdesoftware.userinterface.HomePage.ASIGNAR_CITA;

public class Agendar implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        InternalSystemClock clock = new InternalSystemClock();
        actor.attemptsTo(Click.on(ASIGNAR_CITA),Enter.theValue("12/12/2020").into(FECHA),
                Click.on(DOCTOR.of("2")));

        clock.pauseFor(2000);

        actor.attemptsTo(Click.on(HORA.of("11:00am")),
                Click.on(CONSULTORIO.of("1")), Enter.theValue("123").into(PACIENTE),
                Click.on(ASIGNAR_BUTTON));
    }

    public static Agendar cita(){
        return Tasks.instrumented(Agendar.class);
    }
}
