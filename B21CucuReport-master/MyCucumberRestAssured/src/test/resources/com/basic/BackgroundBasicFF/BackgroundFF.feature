
Feature: background basic feature
  I want to use this template for my feature file

  
 Background: User is logged in
Given I navigate to login page
When I enter id and password
Then I should be able to login
    
Scenario: Search a product and add the first product to the User basket
 Given User search for Lenovo Laptop
 When Add the first laptop that appears in the search result to the basket
 Then User basket should display with added item
 
 
