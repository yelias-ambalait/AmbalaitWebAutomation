Feature: login functionality


  #TC_01
  @TC
  Scenario: Verify that the super admin is logged in and logged out successfully
    Given Check that the login page is displayed
    And Enter username and password
    When Click on the login button
    Then Check that the homepage is displayed
    And Check that the super admin is displayed top right corner
    When Click on the super admin
    Then Check that the logout button is displayed
    When Click on the logout button
    Then Check that the login page is displayed again