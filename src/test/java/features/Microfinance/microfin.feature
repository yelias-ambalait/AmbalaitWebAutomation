Feature: Microfinance Module's Functionality

  Background:
#    Given Check that the login page is displayed
    And Enter valid username and password
    When Click on the login button


  #TC_01
  @test
  Scenario: Verify that the microfinance module dashboard is displayed successfully
    Given Click on the microfinance module
    Then Check that the microfinance module dashboard is displayed


  #TC_02
  @test
  Scenario: Verify that the microfinance employee details is displayed successfully
    Given Click on the microfinance module
    Then Check that the microfinance module dashboard is displayed
    When Click on the Employees
    Then Check that the employee list is displayed
    And Check that the View Icon is available
    When Click on the View Icon
    Then Check that the employee details is displayed

  #TC_03
  @test
  Scenario: Close button is unexpected
    Given Click on the microfinance module
    Then Check that the Configuration is available
    And Hover over the Configuration
    And Hover over the General Configuration
    When Click on the General Configuration
    And Click on the Close button

