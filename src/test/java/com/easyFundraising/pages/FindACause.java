package com.easyFundraising.pages;

import com.easyFundraising.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FindACause extends BasePage {

    public FindACause() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id ="sagc-hero-search-input")
    public WebElement searchBar;

    @FindBy(id = "sagc-hero-search-submit")
    public WebElement searchButton;

    @FindBy(xpath = "//ul[@id='sagc-hero-search-input-auto-suggest']")
    public WebElement suggestionList;

    @FindBy(className = "style_suggestionBtn__47Wy4")
    public List<WebElement> suggestions;

    @FindBy(xpath = "//p[@class='style_title__1XLVx']")
    public List<WebElement> searchResults;

    @FindBy(xpath = "//h1[@class='mb-4 pb-0 typography-xl font-base']")
    public WebElement noMatchingCauseText;

    @FindBy(xpath = "//p[@class='text-v2-semantic-error-primary p-0 m-0']")
    public WebElement searchForCauseError;




}
