package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;

public class Pagprincipal  extends BasePage{

    private String searchButton = "//button[@id='boton']";
    private String searchText = "//input[@id='username']";
    private String searchPass = "//input[@id='password']";
    private String clickMenu ="//td[@title='menu']";
    private String clickTs = "//*[@id=\"menu_modulos\"]/div[2]/table/tbody/tr[2]/td";
    private String createTs ="//tbody/tr[3]/td[1]/a[1]";
    
    
    public Pagprincipal(){
        super(driver);
    }
 
    //metodo para navegar a ubika
    public void navigateToUbika(){
        navigateTo("https://ategi.ubika.es:8501/publica/");
    }
    //email
    public void enterText(String text){
        write(searchText, text);

    }
    //contraseña
    public void psswText(String text){
        write(searchPass, text);
    }
    //logeo
    public void clickButton(){
        clickElement(searchButton);
    }
    //ingreso menu
    public void showMenu(){
        clickElement(clickMenu);
    }
    //tender spot
    public void EnterTS(){
        clickElement(clickTs);
    }
    //crear 
    public void CreateTs(){
        clickElement(createTs);
    }







}
