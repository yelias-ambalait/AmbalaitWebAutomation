Feature: HR & Payroll Functionality

  Background:
    Given Check that the login page is displayed
    And Enter valid username and password
    When Click on the login button

    #TC_01
  @test
  Scenario: Exception is displaying without TIN
    Given Check that the homepage is displayed
    When Click on the HR & Payroll
    And Hover over the Information
    And Click on the Add Employee
    And Fill the required fields except TIN
    And Click on the Save button

    #TC_02
  @test
  Scenario: Employee's List photos aren't displaying
    Given Check that the homepage is displayed
    When Click on the HR & Payroll
    And Hover over the Information
    And Click on the Appointment Letter List

    #TC_03
  @test
  Scenario: Appointment Letter List Search filtering isn't working
    Given Check that the homepage is displayed
    When Click on the HR & Payroll
    And Hover over the Information
    And Click on the Appointment Letter List
    And Select all required fields or specific field
    And Click on the Search button

    #TC_04
  @test
  Scenario: New Document Close button is redirected to the wrong page
    Given Check that the homepage is displayed
    When Click on the HR & Payroll
    And Hover over the Information
    And Click on the Document Manager
    And Click on the New Document Button
    And Click on the Close Button from the bottom

