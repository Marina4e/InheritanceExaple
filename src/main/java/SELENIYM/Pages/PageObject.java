package SELENIYM.Pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageObject {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver chromeDriver = null;
        try {
            chromeDriver =new ChromeDriver();
        GooglePage googlePage = new GooglePage(chromeDriver);
        googlePage.loadPage();
        googlePage.acceptCookiesIfPresent();

        googlePage.setSearchValue("test");
        googlePage.search(true);
        googlePage.luckySearch();
    } finally {
            if (chromeDriver != null)
                chromeDriver.quit();
        }
        }
}
