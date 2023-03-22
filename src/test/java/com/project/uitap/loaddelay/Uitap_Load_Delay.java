package com.project.uitap.loaddelay;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Uitap_Load_Delay {
    public Uitap_Load_Delay(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    @FindBy(css = "button[class$='btn-primary']")
    public WebElement MainButtonCSS;

    @FindBy(xpath = "//*[@id='a660f6bc-e564-2276-3fa8-18db983ed895']")
    public WebElement MainButtonXpath;

    @FindBy(css = "a[onclick*='return']")
    public WebElement linkLoadDelay;

    @FindBy(css = "i[id='spinner']")
    public WebElement iSpinner;

    @FindBy(css = "h3")
    public WebElement h3LoadDelays;

    @FindBy(css = "button[class$='btn-primary']")
    public WebElement buttonAppearingAfterDelay;

    
    
    




}
