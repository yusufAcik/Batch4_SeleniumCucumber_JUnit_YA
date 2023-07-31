Feature: Add Education Tests

  @wip
  Scenario: Add education forms labels test
    Given Tht user is on the login page
    When The user logs in with valid credentials "mgezer@gmail.com" and "Mg12345678"
    And Verify that the username on the dashboard page is "Melih Gezer"
    When The user should be able to navigate Tabs and Modules with "Melih Gezer" and "My Profile"
    And The user sohould be able navigate User Profile Page Tabs with "Add Education"
    Then The user should be able to see following labels at the Education Form
      | School or Bootcamp *    |
      | Degree or Certificate * |
      | Study                   |
      | From Date               |
      |                         |
      | To Date                 |
      | Program Description     |