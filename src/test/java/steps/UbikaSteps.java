package steps;

import io.cucumber.java.en.*;
import pages.Pagprincipal;

public class UbikaSteps {

    Pagprincipal ubika = new Pagprincipal();

    @Given ("Yo quiero acceder a la pagina") 
    public void NavegarUbika(){
        ubika.navigateToUbika();;

    }

    @When ("Escribo email")
    public void enterTextEmail(){
        ubika.enterText("dcarreno@fagorelectronica.com.co");
    }
    
    @And ("Escribo contraseña")
    public void enterTextPass(){
        ubika.psswText("MPxjsgo5");
    }

    @And ("clickar login")
    public void clickEntrar(){
        ubika.clickElement("//button[@id='boton']");

   }

   @And ("Entro al menu")
   public void clickMenu(){
       ubika.clickElement("//td[@title='menu']");

  }

  @And ("click en tender spot")
  public void clickTender(){
    ubika.clickElement("//tbody/tr[3]/td[1]/a[1]");
  }

  @And ("creo un tender")
  public void createTender(){
    ubika.clickElement("/html[1]/body[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[3]/td[1]/a[1]");
  }



}
