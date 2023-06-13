Feature: 3101-Register an account
  As a User
  I want to be able to create an account
  So that I can purchase items on the lambdatest website

  Background:
    Given I am on the Lambdatest home page "https://ecommerce-playground.lambdatest.io"

  Scenario: Register Page is displayed when Register link is clicked
#    Given I am on the Lambdatest home page "https://ecommerce-playground.lambdatest.io"
#    When I click on the MyAccount Menu
    And I click on continue under the New Customer
    Then the Register Account page should be displayed

  Scenario: Register new user happy path
#    Given I am on the Lambdatest home page "https://ecommerce-playground.lambdatest.io"
#    When I click on the MyAccount Menu
    And I click on continue under the New Customer
#    And I enter valid details for First Name, Last Name, E-mail, Telephone, Password, Confirm password
    And I enter valid details for First Name as "aabb", Last Name as "ccdd", E-mail as "ce@e.e", Telephone "123", Password as "1234", and Confirm password
    And I accept the privacy policy
    And I click on Continue button on the Register an Account Page
    Then Register confirmation page is displayed

  Scenario: Privacy policy acceptance
    When I click on the MyAccount Menu
    And I click on continue under the New Customer
    And I enter valid details for First Name as "aabb", Last Name as "ccdd", E-mail as "ce@e.e", Telephone "123", Password as "1234", and Confirm password
    And I click on Continue button on the Register an Account Page
    Then error message Warning: You must agree to the Privacy Policy should be displayed


  Scenario: Register new user by hoovering on myAccount and clicking Register option
#    Given I am on the Lambdatest home page "https://ecommerce-playground.lambdatest.io"
    When I hover on myAccount and click register
#    And I click on contniue under the New Customer
#    And I enter valid details for First Name, Last Name, E-mail, Telephone, Password, Confirm password
    And I enter valid details for First Name as "aabb", Last Name as "ccdd", E-mail as "ce@e.e", Telephone "123", Password as "1234", and Confirm password
    And I accept the privacy policy
    And I click on Continue button on the Register an Account Page
    Then Register confirmation page is displayed


  Scenario Outline: Register new user happy path - using Scenario outline
#    Given I am on the Lambdatest home page "https://ecommerce-playground.lambdatest.io"
    When I click on the MyAccount Menu
    And I click on continue under the New Customer
#    And I enter valid details for First Name, Last Name, E-mail, Telephone, Password, Confirm password
    And I enter valid details for "<firstName>", "<lastName>", "<emailAddress>", "<Telephone>", "<password>", and Confirm password
    And I accept the privacy policy
    And I click on Continue button on the Register an Account Page
    Then Register confirmation page is displayed

    Examples:
      | firstName | lastName | emailAddress  | Telephone | password |
      | Toni      | Ade      | toniAde@g.com | 013839    | 12345    |
#    | Reni| Gragna| reniAde@g.com| 000313839| 1332345|

  @TestToRun
  Scenario Outline: Register new user happy path - using Scenario outline
#    Given I am on the Lambdatest home page "https://ecommerce-playground.lambdatest.io"
    When I click on the MyAccount Menu
    And I click on continue under the New Customer
#    And I enter valid details for First Name, Last Name, E-mail, Telephone, Password, Confirm password
    And I enter valid details for "<firstName>", "<lastName>", "<emailAddress>", "<Telephone>", "<password>", and Confirm password
    And I accept the privacy policy
    And I click on Continue button on the Register an Account Page
    Then Register confirmation page is displayed

    Examples:
      | firstName | lastName | emailAddress  | Telephone | password |
      | Toni      | Ade      | toniAde@g.com | 013839    | 12345    |
#    | Reni| Gragna| reniAde@g.com| 000313839| 1332345|



  Scenario: Register new user happy path - Using data table
    When I click on the MyAccount Menu
    And I click on continue under the New Customer
    And I enter valid details as
    |Tomi|
    |Ade |
    |twwsomAde@g.com|
    |013839|
    |12345|
    And I accept the privacy policy
    And I click on Continue button on the Register an Account Page
    Then Register confirmation page is displayed



  Scenario: Register new user happy path - Using data table
    When I click on the MyAccount Menu
    And I click on continue under the New Customer
    And I enter valid details for registration as
      |FIELD    |VALUE          |
      |firstname|Tomi           |
      |lastname |Ade            |
      |email    |twwsomAde@g.com|
      |telephone|013839         |
      |password |12345          |
    And I accept the privacy policy
    And I click on Continue button on the Register an Account Page
    Then Register confirmation page is displayed
