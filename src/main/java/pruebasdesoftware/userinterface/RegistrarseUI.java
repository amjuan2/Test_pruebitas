package pruebasdesoftware.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class RegistrarseUI {
    public static final Target CEDULA = Target.the("Campo para la cedula").locatedBy("//input[@id='id']");
    public static final Target NOMBRE = Target.the("Campo para el nombre").locatedBy("//input[@id='nom']");
    public static final Target EDAD = Target.the("Campo para la edad").locatedBy("//input[@id='edad']");
    public static final Target TELEFONO = Target.the("Campo para el telefono").locatedBy("//input[@id='tel']");
    public static final Target REGISTRARSE_BUTTON = Target.the("Boton para registrarse").locatedBy("//button[text()='Registrarse']");
}
