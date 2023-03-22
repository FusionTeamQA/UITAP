package com.project.uitap.hiddenlayers;

import com.project.uitap.Dynamic_id.Uitap_Dynamic_id;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

import static com.project.uitap.credential.link_pages.Dynamic_ID;
import static com.project.uitap.credential.link_pages.Hidden_Layers;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class Uitap_Hidden_Layers_Test {

    private WebDriver driver;
    private Uitap_Hidden_Layers uitap_hidden_layers;

    @BeforeEach

    public void setUp() {
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(option);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        driver.get(Hidden_Layers);

        uitap_hidden_layers = new Uitap_Hidden_Layers(driver);
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void uitap_hidden_layers_test() {
        String Current_ID = uitap_hidden_layers.buttonGreen.getAttribute("id");
        System.out.println(Current_ID);
        uitap_hidden_layers.buttonGreen.click();
        String New_ID = uitap_hidden_layers.buttonBlue.getAttribute("id");
        System.out.println(New_ID);
        assertNotEquals(Current_ID, New_ID);
    }

}
