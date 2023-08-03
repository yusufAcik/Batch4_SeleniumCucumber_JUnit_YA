Feature: Add Education Tests


  Scenario: Add education forms labels test
    Given Tht user is on the login page
    When The user logs in with valid credentials "mgezer@gmail.com" and "Mg12345678"
    And Verify that the username on the dashboard page is "Melih Gezer"
    When The user should be able to navigate Tabs and Modules with "Melih Gezer" and "My Profile"
    And The user should be able navigate User Profile Page Tabs with "Add Education"
    Then The user should be able to see following labels at the Education Form
      | School or Bootcamp *    |
      | Degree or Certificate * |
      | Study                   |
      | From Date               |
      |                         |
      | To Date                 |
      | Program Description     |

  @wip_1
  Scenario: Add education forms labels test_1
    Given Tht user is on the login page
    When The user logs in with valid credentials "mgezer@gmail.com" and "Mg12345678"
    And Verify that the username on the dashboard page is "Melih Gezer"
    When The user should be able to navigate Tabs and Modules with "Melih Gezer" and "My Profile"
    And The user should be able navigate User Profile Page Tabs with "Add Education"
    Then The user should be able to see following labels at the Education Form_second
      | School or Bootcamp *    |
      | Degree or Certificate * |
      | Study                   |
      | From Date               |
      | To Date                 |
      | Program Description     |


  Scenario Outline: Add education form test with scenario outline
    Given Tht user is on the login page
    When The user logs in with valid credentials "<userEmail>" and "<password>"
    And Verify that the username on the dashboard page is "<username>"
    When The user should be able to navigate Tabs and Modules with "<tabName>" and "<moduleName>"
    And The user should be able navigate User Profile Page Tabs with "<userProfileTabName>"
    Then The user should be able to see following labels at the Education Form_second
      | School or Bootcamp *    |
      | Degree or Certificate * |
      | Study                   |
      | From Date               |
      | To Date                 |
      | Program Description     |
    When The user fills the education form with "<school>", "<degree>", "<study>", "<fromDate>", "<toDate>", "<description>"
    Then the user should be able to see last added record with "<school>"
    And The user should be able to delete last added record with "<school>"
    Examples:
      | userEmail      | password   | username  | tabName   | moduleName | userProfileTabName | school | degree | study    | fromDate | toDate   | description    |
      | jack@gmail.com | Jack12345  | jack      | jack      | My Profile | Add Education      | METU   | First  | Math     | 11112011 | 11112015 | Nice Programme |
      | jhon@test.com  | Test123456 | Jhon Nash | Jhon Nash | My Profile | Add Education      | ITU    | second | Engineer | 11112011 | 11112015 | Hard Programme |