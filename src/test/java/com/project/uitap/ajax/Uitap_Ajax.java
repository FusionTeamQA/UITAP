package com.project.uitap.ajax;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Uitap_Ajax {
    public Uitap_Ajax(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    @FindBy(css = "button[id='ajaxButton']")
    public WebElement buttonAjax;

    @FindBy(css = "p[class='bg-success']")
    public WebElement pDataLoadedWithAjax;
    
    

    
    
    




}
