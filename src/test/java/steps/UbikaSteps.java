package steps;

import io.cucumber.java.en.Given;
import pages.Pagprincipal;

public class UbikaSteps {

    Pagprincipal inicio = new Pagprincipal();

    @Given ("Yo quiero acceder a la pag") 
    public void NavegarUbika(){
        inicio.navigateToUbika();;

    }


}
