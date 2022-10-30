Feature: Find a Cause Search functionality and verification
  User story:
  Open the website- https://www.easyfundraising.org.uk/
  Go to the link ‘Find a Cause’ on the top of the page
  Enter 3 characters in the Search field- Select the 3rd cause from the suggestion list
  Click Search cause
  Confirm with a message that the selected 3rd Cause exists in the Search results

  Background:
    Given User is on easyfundraising home page
    When User clicks the Find a Cause on top of the page
    And User clicks the search bar

  #positive scenario with different valid datas by using Scenario Outline:
  Scenario Outline: Find a Cause Search Functionality

    When User types "<threeCharacter>" characters in the search bar
    And User selects the third cause from the suggestion list
    And User clicks the search cause button
    Then User sees selected cause exists in the search result

    Examples:
      | threeCharacter |
      | 1st            |
      | set            |
      | tak            |
      | 126            |

    #negative scenario with invalid datas
  Scenario Outline: Find a Cause Search Functionality
    When User types "<threeCharacter>" characters in the search bar
    And User clicks the search cause button
    Then User sees -We didn't find any causes matching your search- message on the page

    Examples:
      | threeCharacter |
      | 3tk            |
      | @£$            |



   #negative scenario with invalid action
  Scenario: Find a Cause Search Functionality
    When User clicks the search cause button
    Then User sees -To search for a cause, enter a cause name- error

