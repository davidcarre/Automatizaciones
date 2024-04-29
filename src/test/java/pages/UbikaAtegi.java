package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.WebDriverManager;


public class UbikaAtegi {
    private WebDriver driver;

    @BeforeMethod
    public void SetUp(){
        //inicia el wbedrives
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void entrarUbika(){
        //navega a Ubika
        driver.get("https://ategi.ubika.es:8501/publica/");
    }

    @AfterMethod
    public void tearDown(){
        //cerrar el navegador
        if (driver != null){
            driver.quit();
        }
    }

}
