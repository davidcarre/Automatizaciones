package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class NewTenderPage extends BasePage {

    private By DateResponse = By.id("plazo_respuesta");
    private By Cooperative = By.id("select2-cooperativa-container"); // Usando id
    private By CooperativeOption = By.xpath("//li[contains(text(), 'Ampo')]"); // XPath para la opción
    private By Incoterm = By.id("incoterm");
    private By IncotermOption = By.xpath("//option[@value='FCA']");
    private By CpO = By.id("cp_o");
    private By CountryO = By.id("pais_o");
    private By CpD = By.id("cp_d");
    private By CountryD = By.id("pais_d");
    private By Checkbox = By.id("cPaletizada");
    private By Large = By.id("largoMercancia0");
    private By Width = By.id("anchoMercancia0");
    private By High = By.id("altoMercancia0");
    private By Weight = By.id("pesoMercancia0");
    private By Bulto = By.id("cantidadMercancia0");
    private By Proovedor = By.id("select2-proveedor-container");
    private By ProovedorOption = By.xpath("//li[text()='David']");
    private By Contact = By.id("select2-contacto-container");
    private By ContactOption = By.xpath("//li[text()='David Carreño']");
    private By Save = By.id("guardar_bottom");
    private By Ok = By.id("aceptarComunicacion");


    public void conditions() {
        switchToIframe(0);
        String date = "2024-12-20";
        write(DateResponse, date);

        clickElement(Cooperative);
        wait.until(ExpectedConditions.elementToBeClickable(CooperativeOption));
        clickElement(CooperativeOption);

        clickElement(Incoterm);
        wait.until(ExpectedConditions.elementToBeClickable(IncotermOption));
        clickElement(IncotermOption);
        clickElement(Incoterm);

    }

    public void trip() {
        write((CpO), "251201");
        write(CountryO, "Colombia");
        write(CpD, "255123");
        write(CountryD, "España");

    }

    public void commodity() {
        clickElement(Checkbox);
        write(Large, "20");
        write(Width, "20");
        write(High, "20");
        write(Weight, "20");
        write(Bulto, "20");

    }

    public void proovedores() {
        clickElement(Proovedor);
        wait.until(ExpectedConditions.elementToBeClickable(ProovedorOption));
        clickElement(ProovedorOption);
        clickElement(Contact);
        wait.until(ExpectedConditions.elementToBeClickable(ContactOption));
        clickElement(ContactOption);
        clickElement(Save);
        wait.until(ExpectedConditions.elementToBeClickable(Ok));

    }

}
