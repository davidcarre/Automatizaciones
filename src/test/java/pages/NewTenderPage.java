package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;

public class NewTenderPage extends BasePage {

    private By DateResponse = By.id("plazo_respuesta");
    private By Cooperative = By.id("select2-cooperativa-container");
    private By CooperativeOption = By.xpath("//li[contains(text(), 'Ampo')]");
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
    private By ContactOption = By.xpath("//li[text()='Pruebas']");
    private By Save = By.id("guardar_bottom");
    private By Ok = By.id("aceptarComunicacion");
    private By accept = By.xpath("//span[text()='Aceptar']");
    private By Close = By.xpath("//*[@id=\"dialogMensaje2\"]/div/span");
    private By TransitariosTab = By.xpath("//a[@data-bs-target='#ofertas']");
    private By Copy = By.id("copy");

    public void conditions() {
        switchToIframe(0);

        String date = "20-12-2024";
        write(DateResponse, date);

        clickElement(Cooperative);
        wait.until(ExpectedConditions.elementToBeClickable(CooperativeOption));
        clickElement(CooperativeOption);

        clickElement(Incoterm);
        wait.until(ExpectedConditions.elementToBeClickable(IncotermOption));
        clickElement(IncotermOption);

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

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        wait.until(ExpectedConditions.elementToBeClickable(Ok));
        clickElement(Ok);
        clickElement(accept);
        clickElement(Close);

    }

    public void copy() {
        switchToIframe(0);
        wait.until(ExpectedConditions.elementToBeClickable(TransitariosTab));
        clickElement(TransitariosTab);
        clickElement(Copy);

        // Llamar al método que abre la nueva ventana después de copiar la URL
        openNewWindowAndNavigate();
    }

    public String getClipboardContents() {
        try {
            return (String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
        } catch (UnsupportedFlavorException | IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    // Método para abrir una nueva ventana y navegar a la URL
    public void openNewWindowAndNavigate() {
        // Obtener la URL desde el portapapeles
        String copiedUrl = getClipboardContents();

        if (copiedUrl != null) {
            // Abrir una nueva ventana en blanco
            ((JavascriptExecutor) driver).executeScript("window.open('about:blank','_blank');");

            // Cambiar el control a la nueva ventana
            for (String winHandle : driver.getWindowHandles()) {
                driver.switchTo().window(winHandle);
            }

            // Navegar a la URL copiada
            driver.get(copiedUrl);
        } else {
            System.out.println("No se pudo obtener la URL del portapapeles.");
        }
    }
}
