package runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import pages.BasePage;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", // Directorio de archivos de características
        glue = "steps", // Donde están los pasos
        plugin = { "pretty", "html:target/cucumber-reports" })
public class TestRunner {
    @BeforeClass
    public static void setup() {
        // Inicialización de configuración antes de ejecutar pruebas
    }

    @AfterClass
    public static void cleanDriver() {
        BasePage.closeBrowser();
    }
}
