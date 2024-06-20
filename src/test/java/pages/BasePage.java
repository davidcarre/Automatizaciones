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
    private WebDriverWait wait;

    static {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    public BasePage(WebDriver driver) {
        BasePage.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public static void navigateTo(String url) {
        driver.get(url);
    }

    public static void closeBrowser() {
        driver.quit();
    }

    protected WebElement findElement(By locator) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    protected WebElement findClickableElement(By locator) {
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public void clickElement(By locator) {
        findClickableElement(locator).click();
    }

    public void write(By locator, String keysToSend) {
        WebElement element = findElement(locator);
        element.clear();
        element.sendKeys(keysToSend);
    }

    public void selectFromDropdownByValue(By locator, String value) {
        Select dropdown = new Select(findElement(locator));
        dropdown.selectByValue(value);
    }

    public void selectFromDropdownByIndex(By locator, Integer index) {
        Select dropdown = new Select(findElement(locator));
        dropdown.selectByIndex(index);
    }

    public int dropdownSize(By locator) {
        Select dropdown = new Select(findElement(locator));
        List<WebElement> dropdownOptions = dropdown.getOptions();
        return dropdownOptions.size();
    }
}
