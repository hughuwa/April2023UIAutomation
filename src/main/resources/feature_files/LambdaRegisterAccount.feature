@TestToRun
Feature: 3101-Register an account
  As a User
  I want to be able to create an account
  So that I can purchase items on the lambdatest website

  Scenario: Register Page is displayed when Register link is clicked
    Given I am on the Lambdatest home page "https://ecommerce-playground.lambdatest.io/index.php?route=common/home"
    When I click on the MyAccount Menu
    And I click on contniue under the New Customer
    Then the Register Account page should be displayed