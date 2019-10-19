package pruebasdesoftware.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alerta implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            WebDriverWait wait = new WebDriverWait(BrowseTheWeb.as(actor).getDriver(), 2);
            wait.until(ExpectedConditions.alertIsPresent());
            Alert alert = BrowseTheWeb.as(actor).getDriver().switchTo().alert();
            alert.accept();
        } catch (Exception e) {
        }
    }

    public static Alerta registrarCliente(){
        return new Alerta();
    }
}
