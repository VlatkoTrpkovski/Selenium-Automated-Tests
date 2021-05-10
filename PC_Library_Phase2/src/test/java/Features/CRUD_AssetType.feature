Feature: I can perform CRUD operations for AssetType
  @SmokeTestsPositiveScenarios
  Scenario: I can Create AssetType
    Given I open browser and navigate to the website
    Then I login into the application As Admin
    Then I navigate to the AssetType Page
    And I click on Create AssetType
    When I enter values for Static and Dynamic Fields and click on add type
    Then Values are entered into the FieldsTable - asserts
    And I click on CreateType
    And I can see the new AssetType into the AssetType Table in AssetTypePage - check if it exits
    Then Navigate back to AssetTypePage



  @SmokeTestsPositiveScenarios
  Scenario: I can Edit existing AssetType
    Given I click on edit for the previously created AssetType
    Then I click edit button for the previously entered row in the FieldsTable
    And I change the input for FieldName  and check the unchecked boxes and click updateType
    And Check if changes are saved properly in the FieldsTable, asserts
    Then Navigate back to AssetType Page

  @SmokeTestsPositiveScenarios
  Scenario: I can delete row from FieldsTable when editing AssetType and Delete whole AssetType
    When I click Delete button for the previously Edited row in the FieldsTable
    Then I check if the row is deleted
    Then I click on Continue
    And I delete the whole AssetType, if it is not used by an Asset
    Then I check if the AssetType is deleted






