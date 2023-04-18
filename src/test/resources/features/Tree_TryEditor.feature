#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Tree Page Try Editor test
  I want to use this template for my feature file

  @tag1
  Scenario: User Clicked on TryEditor Link on Tree Page
    Given User is on Tree Subpage " "
    
    
    
    When User Clicks on TryEditor link
    
    Then redirect to a page having an tryEditor with a Run button to test
    And runcode in try editor page with valid input
    And runcode in try editor page invalid input error

  