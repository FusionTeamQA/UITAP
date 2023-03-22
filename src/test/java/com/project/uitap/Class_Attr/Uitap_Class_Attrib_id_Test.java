package com.project.uitap.Class_Attr;

import com.project.uitap.Dynamic_id.Uitap_Dynamic_id;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

import static com.project.uitap.credential.link_pages.Class_Attr;
import static com.project.uitap.credential.link_pages.Dynamic_ID;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Uitap_Class_Attrib_id_Test {

    private WebDriver driver;
    private Class_Attrib_id classAttribId;

    @BeforeEach

    public void setUp() {
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(option);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        driver.get(Class_Attr);

        classAttribId = new Class_Attrib_id(driver);
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void Class_Attrib_by_Xpath_test() {
        classAttribId.buttonClassTestBlue.click();
        driver.switchTo().alert().accept();
        String Title = classAttribId.h3ClassAttribute.getText();
        String Discription = classAttribId.discription.getText();
        System.out.println(Title);
        System.out.println(Discription);
        assertNotEquals(Title, Discription);
    }
    @Test
    public void Class_Attrib_by_CSS_test() {
        classAttribId.buttonClassTestBlue2.click();
        driver.switchTo().alert().accept();
        String Title = classAttribId.h3ClassAttribute.getText();
        String Discription = classAttribId.discription.getText();
        System.out.println(Title);
        System.out.println(Discription);
        assertNotEquals(Title, Discription);
    }

}
