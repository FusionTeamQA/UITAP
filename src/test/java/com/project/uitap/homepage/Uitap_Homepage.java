package com.project.uitap.homepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Uitap_Homepage {
    public Uitap_Homepage (WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    @FindBy(css = "h1[id='title']")
    public WebElement h1Title;


    

    
    
    
}
