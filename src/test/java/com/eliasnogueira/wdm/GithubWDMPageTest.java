package com.eliasnogueira.wdm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.eliasnogueira.wdm.po.GitHubPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GithubWDMPageTest {

    private static WebDriver driver;

    @BeforeAll
    static void webdrivermanagerSetup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://github.com/bonigarcia/webdrivermanager");
    }

    @AfterAll
    static void quitBrowser() {
        driver.quit();
    }

    @Test
    void checkDescription() {
        GitHubPage page = new GitHubPage(driver);
        String expected = "Automatic management of Selenium WebDriver binaries";

        assertEquals(expected, page.getDescription());
    }
}
