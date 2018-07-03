Feature: This feature is about creating new account in the system

  Scenario: Successful sign-up
    Given I have opened home page
    When I select My account menu
      And I select sign up button
      And I enter First name
      And I enter Last name
      And I enter Mobile number
      And I enter Email address
      And I enter Password
      And I confirm Password
      And I select Sign up button
    Then User account page is opened