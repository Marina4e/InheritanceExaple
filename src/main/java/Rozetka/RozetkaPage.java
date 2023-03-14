package Rozetka;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RozetkaPage {
    private final WebDriver driver;
    private final static By TOP_SALES_LABEL = By
            .xpath("//span [text () = ' ТОП ПРОДАЖІВ ']");

    public RozetkaPage(WebDriver driver) {
        this.driver = driver;
    }

    public void loadPage() {
        driver.get("https://rozetka.com.ua/");
    }

    public void search(String value) {
        driver.findElement(By.name("search")).sendKeys(value);
        driver.findElement(By.className("search-form__submit")).click();
    }

    public void verifySearchResult() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions
                        .visibilityOfElementLocated(TOP_SALES_LABEL));
    }
}
