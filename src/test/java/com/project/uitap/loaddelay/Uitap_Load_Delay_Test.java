package com.project.uitap.loaddelay;

import com.project.uitap.hiddenlayers.Uitap_Hidden_Layers;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static com.project.uitap.credential.link_pages.Hidden_Layers;
import static com.project.uitap.credential.link_pages.Main_URL;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Uitap_Load_Delay_Test {

    private WebDriver driver;
    private Uitap_Load_Delay uitapLoadDelay;

    @BeforeEach

    public void setUp() {
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(option);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(10000, TimeUnit.MILLISECONDS);
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        driver.get(Main_URL);



        uitapLoadDelay = new Uitap_Load_Delay(driver);
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void uitapLoadDelay_test() {
        uitapLoadDelay.linkLoadDelay.click();
        WebElement button = uitapLoadDelay.buttonAppearingAfterDelay;
        assertTrue(button.isDisplayed());
    }
}
