@tag
Feature: Login feature
  i will test the login page

  Background: Browser launch
    Given: Browser will open


  Scenario Outline: Orange Hrm site and Php travel site login
    Given I will land the "<url>"login page
    When I will enter the user "<name>" and "<password>"
    Then I verify the login page "<Title>".

    Examples: 
      | name                 | password  | url                                        | Title              |
      | Admin                | admin123  | https://opensource-demo.orangehrmlive.com/ | OrangeHRM          |
      | admin@phptravels.com | demoadmin | https://www.phptravels.net/admin           | Administator Login |
