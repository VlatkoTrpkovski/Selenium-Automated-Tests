Feature: I can perform CRUD operations for AssetType
  @SmokeTestsPositiveScenarios1
  Scenario: I can Create AssetType
    Given I open browser and navigate to the website
    Then I login into the application As Admin
    Then I navigate to the AssetType Page
    And I click on Create AssetType
    When I enter values for FieldName,FieldType,checkRequiredBox and click on +
    Then Values are entered into the FieldsTable - asserts
    And I click on Save
    Then Msg. is displayed
    And I can see the new AssetType into the AssetType Table in AssetTypePage


  @SmokeTestsPositiveScenarios
  Scenario: I can Edit existing AssetType
    And I click on edit for the previously created AssetType
    Then I click edit button for the previously entered row in the FieldsTable
    And I change the input for FieldName and uncheck the Requiredbox , I cant edit FieldType
    When I click on +
    Then Updates are inserted into the FieldsTable , asserts
    Then I click on Save
    Then Msg. is displayed
    And I can see the new AssetType into the AssetType Table in AssetTypePage
    Then I click again on edit for the same AssetType
    And Check if changes are saved properly in the FieldsTable, asserts
    Then Navigate back to AssetType Page

  @SmokeTestsPositiveScenarios
  Scenario: I can delete row from FieldsTable when editing AssetType
    And I click on edit for the previously Edited AssetType
    When I click Delete button for the previously Edited row in the FieldsTable - I can delete row only if FieldName is not used in any other AssetType
    Then I check if the row is deleted - asserts
    Then I click on Save
    Then I click again on edit for the same AssetType
    And Check if changes are saved properly in the FieldsTable, asserts
    Then Navigate back to AssetType Page



