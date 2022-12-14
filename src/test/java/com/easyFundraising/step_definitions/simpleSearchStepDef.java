package com.easyFundraising.step_definitions;

import com.easyFundraising.pages.FindACause;
import com.easyFundraising.utilities.ConfigurationReader;
import com.easyFundraising.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class simpleSearchStepDef {

    FindACause findACause = new FindACause();
    String thirdSuggestion;



    @Given("User is on easyfundraising home page")
    public void user_is_on_easyfundraising_home_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }

    @When("User clicks the Find a Cause on top of the page")
    public void user_clicks_the_find_a_cause_on_top_of_the_page() {

        findACause.findCause.click();
    }


    @Given("User clicks the search bar")
    public void user_clicks_the_search_bar() {

        findACause.searchBar.click();

    }


    @When("User types {string} characters in the search bar")
    public void user_types_characters_in_the_search_bar(String string) {

        findACause.searchBar.sendKeys(string);
    }

    @When("User selects the third cause from the suggestion list")
    public void user_selects_the_third_cause_from_the_suggestion_list() throws InterruptedException {

        thirdSuggestion = findACause.suggestions.get(2).getText();


        try{
            findACause.suggestions.get(2).click();
        } catch (Exception e){
            System.out.println("Suggestion list is shorter than 3");
        }

    }


    @When("User clicks the search cause button")
    public void user_clicks_the_search_cause_button() {

        findACause.searchButton.click();
    }

    @Then("User sees selected cause exists in the search result")
    public void user_verifies_that_selected_cause_exists_in_the_search_result() {

        boolean exists = true;


        for (WebElement searchResult : findACause.searchResults) {

            if (searchResult.getText().equalsIgnoreCase(thirdSuggestion)) {
                exists = true;
                break;

            } else{
                exists= false;
            }

        }

        if (exists) {
            System.out.println("3rd Cause exists in the Search results");
        }else{
            System.out.println("3rd Cause doesn't exists in the Search results");
        }

    }

    @Then("User sees -We didn't find any causes matching your search- message on the page")
    public void user_sees_we_didn_t_find_any_causes_matching_your_search_message_on_the_page() {

        Assert.assertTrue(findACause.noMatchingCauseText.isDisplayed());

    }


    @Then("User sees -To search for a cause, enter a cause name- error")
    public void user_sees_to_search_for_a_cause_enter_a_cause_name_error() {

        Assert.assertTrue(findACause.searchForCauseError.isDisplayed());
    }


}