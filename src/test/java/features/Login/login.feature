Feature: Login Functionality


  #TC_01
  @test
  Scenario: Verify that the super admin is logged in and logged out successfully
#    Given Check that the login page is displayed
    And Enter valid username and password
    When Click on the login button
    Then Check that the homepage is displayed
    And Check that the super admin is displayed top right corner
    When Click on the super admin
    Then Check that the logout button is displayed
    When Click on the logout button
#    Then Check that the login page is displayed again

  #TC_02
  @test
  Scenario: Verify that the login functionality with invalid credentials
#    Given Check that the login page is displayed
    And Enter invalid username and password
    When Click on the login button
    Then Check that the invalid message is displayed

  #TC_03
  @test
  Scenario: Verify that the login functionality with valid username and invalid password
    Given Check that the login page is displayed
    And Enter valid username and invalid password
    When Click on the login button
    Then Check that the error message is displayed for incorrect password