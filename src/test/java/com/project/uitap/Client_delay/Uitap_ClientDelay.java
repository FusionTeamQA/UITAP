package com.project.uitap.Client_delay;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Uitap_ClientDelay {
    public Uitap_ClientDelay(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }



    @FindBy(css = "button[id='ajaxButton']")
    public WebElement buttonAjax2;

    @FindBy(css = "p[class='bg-success']")
    public WebElement pDataCalculatedTheClient;
    
    

    
    
    




}
