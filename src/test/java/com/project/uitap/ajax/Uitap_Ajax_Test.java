package com.project.uitap.ajax;

import com.project.uitap.loaddelay.Uitap_Load_Delay;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static com.project.uitap.credential.link_pages.Ajax_page;
import static com.project.uitap.credential.link_pages.Main_URL;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Uitap_Ajax_Test {

    private WebDriver driver;
    private Uitap_Ajax uitapAjax;

    @BeforeEach

    public void setUp() {
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(option);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().timeouts().pageLoadTimeout(15000, TimeUnit.MILLISECONDS);
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        driver.get(Ajax_page);



        uitapAjax = new Uitap_Ajax(driver);
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void uitap_Ajax_test() {
        uitapAjax.buttonAjax.click();
        WebElement text_success = uitapAjax.pDataLoadedWithAjax;
        assertTrue(text_success.isDisplayed());
    }
}
