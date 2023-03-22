package com.project.uitap.Class_Attr;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Class_Attrib_id {
    public Class_Attrib_id(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[contains(concat(' ', normalize-space(@class), ' '), ' btn-primary ')]\n")
    public WebElement buttonClassTestBlue;

    @FindBy(css = "button[class*='btn-primary']")
    public WebElement buttonClassTestBlue2;

    @FindBy(css = "h3")
    public WebElement h3ClassAttribute;

    @FindBy(css = "html > body > section > div > p:nth-of-type(1)")
    public WebElement discription;
    
    




}
