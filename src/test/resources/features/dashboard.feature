Feature: Dashboard tests

  @wip
  Scenario: Dashboard Menu tests (Usage of cucumber list)

    Given Tht user is on the login page
    When The user logs in with valid credentials "mgezer@gmail.com" and "Mg12345678"
    Then The user should be able to login
    And Verify that the username on the dashboard page is "Melih Gezer"
    And The user should be able to see all following tabs that shown on the page
      | Dashboard   |
      | Developers  |
      | Components  |
      | Forms       |
      | JavaScript  |
      | Melih Gezer |

