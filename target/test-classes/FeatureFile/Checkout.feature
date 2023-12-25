Feature: Checkout the products from Swag Labs

  @Checkout
  Scenario: Select multiple products and add in bucket with checkout

    When User Navigates to Sauce Demo Website URL
    Then I login with Application "standard_user" and "secret_sauce"
    Then User click on Products of Swag Labs
    Then User enter checkout information "Tim" and "Cook" and "74500"
