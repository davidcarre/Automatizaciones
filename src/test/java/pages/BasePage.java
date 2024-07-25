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
    private static WebDriverWait wait;
    private static final Duration TIMEOUT = Duration.ofSeconds(10);

    static {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, TIMEOUT);
    }

    public static void navigateTo(String url) {
        driver.get(url);
    }

    public static void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }

    protected WebElement findElement(By locator) {
        try {
            return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        } catch (Exception e) {
            throw new RuntimeException("Element not found: " + locator + " Exception: " + e.getMessage(), e);
        }
    }

    protected WebElement findClickableElement(By locator) {
        try {
            return wait.until(ExpectedConditions.elementToBeClickable(locator));
        } catch (Exception e) {
            throw new RuntimeException("Element not clickable: " + locator + " Exception: " + e.getMessage(), e);
        }
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

    public void switchToIframe(By iframeLocator) {
        WebElement iframe = findElement(iframeLocator);
        driver.switchTo().frame(iframe);
    }

    public void switchToDefaultContent() {
        driver.switchTo().defaultContent();
    }
}
