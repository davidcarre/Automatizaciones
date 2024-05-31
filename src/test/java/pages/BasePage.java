package pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {

    protected static WebDriver driver;
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

    static{
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

    }

    public BasePage(WebDriver driver){
        BasePage.driver = driver;
    }
    //para ir a la pag
    public static void navigateTo(String url) {
        driver.get(url);
    }
    //para cerrar la pag
    public static void CloseBrowser(){
        driver.quit();
    }
    private WebElement Find(String locator){
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
    }
    //para clickar un elemento
    public void clickElement (String locator){
        Find(locator).click();

    }
    //para escribir en un campo
    public void write(String locator, String keysToSend){
        Find(locator).clear();
        Find(locator).sendKeys(keysToSend);
    }
    //para lista plegable por valor
    public void selectFromDropdownByValue(String locator, String value){
        Select dropdown = new Select(Find(locator));
        dropdown.selectByValue(value);
    }

    //para lista plegable por indice
    public void selectFromDropdownByIndex(String locator, Integer index){
        Select dropdown = new Select(Find(locator));
        dropdown.selectByIndex(index);
    }
    //para ver cuantos elementos tiene la lista
    public int dropdownSize(String locator){
        Select dropdown = new Select(Find(locator));
        List <WebElement> dropdownOptions = dropdown.getOptions();
        return dropdownOptions.size();
    }

}

