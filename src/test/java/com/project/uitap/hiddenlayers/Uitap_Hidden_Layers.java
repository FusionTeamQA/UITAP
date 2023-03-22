package com.project.uitap.hiddenlayers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Uitap_Hidden_Layers {
    @FindBy(css = "button[id='greenButton']")
    public WebElement buttonGreen;

    @FindBy(css = "button[id='blueButton']")
    public WebElement buttonBlue;
    
    

    public Uitap_Hidden_Layers(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    
    
    




}
