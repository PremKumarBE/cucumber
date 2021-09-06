
Feature: Tarifplan

  Background: 
    #Given user launch telecom application
    And click Add traif

  Scenario: add tarif flow
    When user need to fill the fields
    And user click submit button
    Then user verify the status
