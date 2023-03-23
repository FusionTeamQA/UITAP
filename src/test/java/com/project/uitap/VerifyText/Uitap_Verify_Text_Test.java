package com.project.uitap.VerifyText;

import com.project.uitap.TextInput.Uitap_Text_Input;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static com.project.uitap.credential.credentials.NameButton;
import static com.project.uitap.credential.link_pages.Text_input;
import static com.project.uitap.credential.link_pages.Verifytext;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Uitap_Verify_Text_Test {

    private WebDriver driver;
    private Uitap_Verify_text uitapVerifyText;

    @BeforeEach

    public void setUp() {
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(option);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(10000, TimeUnit.MILLISECONDS);
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        driver.get(Verifytext);


        uitapVerifyText = new Uitap_Verify_text(driver);
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void Verify_text_test() {
        String Welcome_text = uitapVerifyText.WelcomeText.getText();
        System.out.println("Element with text: " + Welcome_text);
    }
}
