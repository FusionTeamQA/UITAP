package com.project.uitap.Client_delay;

import com.project.uitap.ajax.Uitap_Ajax;
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
import static com.project.uitap.credential.link_pages.Client_delay;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Uitap_ClientDelay_Test {

    private WebDriver driver;
    private Uitap_ClientDelay uitapClientDelay;

    @BeforeEach

    public void setUp() {
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(option);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().timeouts().pageLoadTimeout(15000, TimeUnit.MILLISECONDS);
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        driver.get(Client_delay);



        uitapClientDelay = new Uitap_ClientDelay(driver);
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void uitapClietnDelay_test() {
        uitapClientDelay.buttonAjax2.click();
        WebElement text_success = uitapClientDelay.pDataCalculatedTheClient;
        text_success.getText();
        System.out.println(text_success);
        assertTrue(text_success.isDisplayed());
    }
}
