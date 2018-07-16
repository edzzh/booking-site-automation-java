Feature: This feature is about login in to your account

  Scenario: Successful login
    Given I have opened home page
    When I select My account menu
      And I select Login button from drop-down menu
      And I enter Email address
      And I enter Password
      And I select Login button
    Then User account page is opened