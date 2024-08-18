Feature: Validating the log in functionality

  Scenario:Successful login with valid credentials
   Given User launches the url and user is on home page
    And  user clicking the  login button
    When I enter a valid username and password
    And I click the sign in button
    And I should see a welcome message and take the screenshot
    And In categories section click the laptop button
    Then click the Macbook air
    And click Add to cart button
    Then handle the alert
    And click on cart and check the products are added
    Then click on place the order button
