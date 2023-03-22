package com.project.uitap.TextInput;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Uitap_Text_Input {
    public Uitap_Text_Input(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    @FindBy(css = "button[class$='btn-primary']")
    public WebElement MainButtonCSS;

    @FindBy(xpath = "//*[@id='a660f6bc-e564-2276-3fa8-18db983ed895']")
    public WebElement MainButtonXpath;

    @FindBy(css = "input[id='newButtonName']")
    public WebElement inputNewButtonName;

    @FindBy(css = "button[id='updatingButton']")
    public WebElement buttonUpdating;



    
    
    




}
