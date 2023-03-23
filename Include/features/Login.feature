#Author: raxil.patel@1rivet.com
#@LoginModule
Feature: Login feature
  I want to use this template to check login scenarios.

  @Smoke
  Scenario Outline: Check login is successfully with valid credentials.
    Given User is on the Login page.
    When User enters <username> and <password>.
    Then User is navigate to Home page.

    @valid
    Examples: 
      | username | password |
      | Admin    | admin123 |

    @invalid
    Examples: 
      | username | password  |
      | Admin123 | admin123  |
      | Admin    | admin1234 |
