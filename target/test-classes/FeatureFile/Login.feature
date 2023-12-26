Feature: Login the Swag Labs Website

  @Login @TC-001
  Scenario: Login the wth valid credentials

    When User Navigates to Sauce Demo Website URL
    Then I login with Application "standard_user" and "secret_sauce"

  @Login @TC-002
  Scenario: Login the wth Invalid credentials

    When User Navigates to Sauce Demo Website URL
    Then I login with Application "standard_user" and "admin123"



    