package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Pagprincipal extends BasePage {

    private String searchButton = "//button[@id='boton']";
    private String searchText = "//input[@id='username']";
    private String searchPass = "//input[@id='password']";
    private String clickMenu = "//td[@title='menu']";
    private String clickTs = "//*[@id=\"menu_modulos\"]/div[2]/table/tbody/tr[2]/td";
    
    
    public Pagprincipal(){
        super(driver);
    }

    // Método para navegar a Ubika
    public void navigateToUbika(){
        navigateTo("https://ategi.ubika.es:8501/publica/");
    }

    // Email
    public void enterText(String text){
        write(searchText, text);
    }

    // Contraseña
    public void psswText(String text){
        write(searchPass, text);
    }

    // Logeo
    public void clickButton(){
        clickElement(searchButton);
    }

    // Ingreso menu
    public void showMenu(){
        clickElement(clickMenu);
    }

    // Tender spot
    public void EnterTS(){
        clickElement(clickTs);
    }

    // Método para hacer clic en el botón "Spot"
    public void clickBotonSpot() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='boton_spot' and @onclick='wizard();']")));
        wait.until(ExpectedConditions.visibilityOf(element));
        element.click();
    }
}
