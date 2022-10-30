Feature: Search functionality and verification
  User story:
  Open the website- https://www.easyfundraising.org.uk/
  Go to the link ‘Find a Cause’ on the top of the page
  Enter 3 characters in the Search field- Select the 3rd cause from the suggestion list
  Click Search cause
  Confirm with a message that the selected 3rd Cause exists in the Search results


  Scenario: Find a cause Search Functionality Verification
    Given User is on easyfundraising home page
    When User clicks the Find a Cause on top of the page
    And User clicks the search bar
    When User types "aaa" characters in the search bar
    And User selects the third cause from the suggestion list
    And User clicks the search cause button
    Then User sees selected cause exists in the search result

