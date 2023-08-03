@regression
  Feature: Add Education Test - Excel File

    @wip
    Scenario Outline:
      Given Tht user is on the login page
      When The user logins with valid credentials "Your Email" and "Password" from excel file "<path>", "<sheetName>",<rowNumber>
      Then The user should be able to login
      When The user navigates to tab and module via "Your Name" and "<moduleName>" from excel file "<path>", "<sheetName>", <rowNumber>
      And The user should be able navigate User Profile Page Tabs with "Add Education"
      When The user fills the Add Education Form with excel file "<path>", "<sheetName>", <rowNumber>
      Then The user should be able to see last added record with "school" via excel file "<path>", "<sheetName>", <rowNumber>
      And The user should be able to delete last added record with "school" via excel file "<path>", "<sheetName>", <rowNumber>
      Examples:
        | path | sheetName | rowNumber | moduleName |
        | src/test/resources/LoginList (1).xlsx | QaTeam3 | 1 | module Name |
        | src/test/resources/LoginList (1).xlsx | QaTeam3 | 2 | module Name |
        | src/test/resources/LoginList (1).xlsx | QaTeam3 | 5 | module Name |
