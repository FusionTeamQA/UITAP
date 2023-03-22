package com.project.uitap.Dynamic_id;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import static com.project.uitap.credential.link_pages.Dynamic_ID;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class Uitap_Dynamic_id_Test {

    private WebDriver driver;
    private Uitap_Dynamic_id uitap_dynamic_id;

    @BeforeEach

    public void setUp() {
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(option);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        driver.get(Dynamic_ID);

        uitap_dynamic_id = new Uitap_Dynamic_id(driver);
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void Dynamic_ID_test() {
        String Current_ID = uitap_dynamic_id.MainButtonCSS.getAttribute("id");
        System.out.println(Current_ID);
        uitap_dynamic_id.MainButtonCSS.click();
        driver.navigate().refresh();
        String New_ID = uitap_dynamic_id.MainButtonCSS.getAttribute("id");
        System.out.println(New_ID);
        assertNotEquals(Current_ID, New_ID);
    }

}
