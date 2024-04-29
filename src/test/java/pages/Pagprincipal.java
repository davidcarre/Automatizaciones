package pages;

public class Pagprincipal  extends BasePage{

    public Pagprincipal(){
        super(driver);
    }
 
    //metodo para navegar a ubika
    public void navigateToUbika(){
        navigateTo("https://ategi.ubika.es:8501/publica/");
    }


}
