@login @regression
Feature: Login Functionality
  # User Story=Feature:

 # Background:
  #  Given Tht user is on the login page

  @user
  Scenario: Login as user
    #Test Case = Scenario
    Given Tht user is on the login page
    # Test Steps = Given, When, Then etc..
    When The user logs in with jack's credentials
    Then The user should be able to login

  @user
  Scenario: Login as user
    Given Tht user is on the login page
    When The user logs in with Rosa's credentials
    Then The user should be able to login


  Scenario: Login with parameter
    Given Tht user is on the login page
    When The user logs in with valid credentials "mgezer@gmail.com" and "Mg12345678"
    Then The user should be able to login
    * Verify that the username on the dashboard page is "Melih Gezer"


  Scenario: Login with parameter
    Given Tht user is on the login page
    When The user logs in with valid credentials "rosa@test.com" and "Test123456"
    Then The user should be able to login
    * Verify that the username on the dashboard page is "Rosa"

  Scenario: Login with cucumber list
    Given Tht user is on the login page
    When The user logins with following list
      | mgezer@gmail.com |
      | Mg12345678       |
      | Melih Gezer      |
    Then The user should be able to login


  Scenario: Login with cucumber map
    Given Tht user is on the login page
    When The user logins with following map
      | userEmail | mgezer@gmail.com |
      | password  | Mg12345678       |
      | username  | Melih Gezer      |
    Then The user should be able to login



