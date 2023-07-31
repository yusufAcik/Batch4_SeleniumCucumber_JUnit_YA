Feature: Cucumber tests with excel file

  @wip
  Scenario Outline: Login Test with excel file
    Given Tht user is on the login page
    When The user logins with valid credentials "Your Email" and "Password" from excel file "src/test/resources/LoginList (1).xlsx", "<sheetName>",<rowNumber>
    Then The user should be able to login
    Then Verify that "Your Name" is visible on dashboard page with excel file "src/test/resources/LoginList (1).xlsx", "<sheetName>",<rowNumber>
    Examples:
      | sheetName | rowNumber |
      | QaTeam2 | 0 |
