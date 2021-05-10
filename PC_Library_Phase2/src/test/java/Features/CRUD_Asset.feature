Feature: I can perform CRUD operations for Asset

  Scenario: I can Create Asset
    Given I open browser and navigate to the website
    Then I login into the application As Admin
    Then I navigate to the AssetType Page
    And I click on Create AssetType
    When I enter values for Static and Dynamic Fields and click on add type
    Then Values are entered into the FieldsTable - asserts
    And I click on CreateType
    And I can see the new AssetType into the AssetType Table in AssetTypePage - check if it exits
    Then Navigate back to AssetTypePage
    Then I navigate to the AssetType Page and click on Create Asset button
    And I choose to Create Tablet Asset
    Then I fill the necessary Data into the Asset and click on Create
    Then I check if the Asset is Created with the correct input

  Scenario: I can edit Asset
    Given I click on Edit Button and change the input for populated fields and click update
    Then I check if the changes are made correctly

  Scenario: I can search Asset
    Given I enter input for a defined searchable field for the AssetType
    Then I should get the correct Asset as a response for the search

   Scenario: I can delete Asset
     Given I click on Delete and Click on Confirm dialog
     Then Then I check if the Asset is Deleted