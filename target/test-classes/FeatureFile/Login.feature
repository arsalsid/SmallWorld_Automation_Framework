Feature: Login the Sauce Demo Page

  @Login
  Scenario: Login the wth valid credentials

    When User Navigates to Sauce Demo Website URL
    Then I login with Application "standard_user" and "secret_sauce"



    