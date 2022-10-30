package com.easyFundraising.pages;

import com.easyFundraising.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[.='How it works']")
    public WebElement howItWorks;

    @FindBy(xpath = "//span[.='Find a cause']")
    public WebElement findCause;

    @FindBy(xpath = "//span[.='Register a cause']")
    public WebElement regCause;

    @FindBy(xpath = "//span[.='Register a business']")
    public WebElement regBuss;

    @FindBy(xpath = "//span[.='Log in']" )
    public WebElement logInButton;

    @FindBy(xpath = "//span[.='Sign up']" )
    public WebElement signUpButton;


}
