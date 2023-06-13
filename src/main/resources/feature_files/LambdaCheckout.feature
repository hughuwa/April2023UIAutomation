Feature: Lambda Checkout
  As a User
  I want to be able to checkout
  So that I can purchase items on the lambdatest website

  Background:
    Given I am on the Lambdatest home page "https://ecommerce-playground.lambdatest.io"
#    When I click on the MyAccount Menu



  Scenario: Lambda Checkout
    And I enter E-mail as "be@e.e",Password as "1234"
    And I Click on Login button
    And I click on "Shop by Category" menu
    And I Click on "software" from the left hand menu
    And I choose "Palm Treo Pro"
    And I click on buy now
#    And populate the necessary fields
    And I accept terms and conditions
    And click on continue button
    And click on confirm order
    Then "Your order has been placed!" is dispalayed


  Scenario: Search for HTC
    And Hoover on myAccount and Click on Login
#    And Click on Login
    And I enter E-mail as "be@e.e",Password as "1234"
    And I Click on Login button
    And enter "HTC" on the search bar and press enter
    Then the search tab should be displayed

  @HTC
  Scenario: Login to Lambda site and logout
    When Hoover on myAccount and Click on Login
    And I login with the following details
      | username | lat1@email.com |
      | password | 123Pasword!    |
    Then "My Account" page is displayed
    When I hoover and click on Logout link from the right hand menu
    Then "Account Logout" page should be displayed

