package com.project.uitap.TextInput;

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

import static com.project.uitap.credential.credentials.NameButton;
import static com.project.uitap.credential.link_pages.Main_URL;
import static com.project.uitap.credential.link_pages.Text_input;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Uitap_Text_Input_Test {

    private WebDriver driver;
    private Uitap_Text_Input uitapTextInput;

    @BeforeEach

    public void setUp() {
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(option);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(10000, TimeUnit.MILLISECONDS);
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        driver.get(Text_input);



        uitapTextInput = new Uitap_Text_Input(driver);
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void uitapInputText_test() {
        uitapTextInput.inputNewButtonName.sendKeys(NameButton);
        uitapTextInput.buttonUpdating.click();
        String nameButtonNew = uitapTextInput.buttonUpdating.getText();
        System.out.println(nameButtonNew);
        assertEquals(nameButtonNew, NameButton);
    }
}
