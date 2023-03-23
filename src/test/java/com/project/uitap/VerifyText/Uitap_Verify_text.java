package com.project.uitap.VerifyText;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Uitap_Verify_text {
    public Uitap_Verify_text(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//span[normalize-space(.)='Welcome UserName!']\n")
    public WebElement WelcomeText;




    
    
    




}
