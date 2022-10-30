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

    @FindBy(className = "style_suggestionBtn__47Wy4")
    public List<WebElement> suggestions;

    @FindBy(xpath = "//p[@class='style_title__1XLVx']")
    public List<WebElement> searchResults;




}
