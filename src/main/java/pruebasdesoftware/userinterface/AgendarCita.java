package pruebasdesoftware.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class AgendarCita {
    public static final Target FECHA = Target.the("Campo para la fecha").locatedBy("//input[@id='fecha']");
    public static final Target DOCTOR = Target.the("Campo del doctor").locatedBy("//select[@id='doctor']//option[@value='{0}']");
    public static final Target HORA = Target.the("Campo de la hora").locatedBy("//select[@id='hora']//option[@value='{0}'");
    public static final Target CONSULTORIO = Target.the("Consultorio").locatedBy("//select[@id='hab']//option[@value='{0}'");
    public static final Target PACIENTE = Target.the("Campo para el paciente").locatedBy("//input[@id='paciente']");
    public static final Target ASIGNAR_BUTTON = Target.the("Boton para asignar").locatedBy("//button[text()='Asignar']");
    public static final Target ACTUALIZAR_BUTTON = Target.the("Boton para actualizar").locatedBy("//button[text()='Actualizar']");
}
