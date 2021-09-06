#Author: your.email@your.domain.com
@smoke
Feature: Telecom

  Background: 
    #Given user launches telecom application
    And user click on add customer button

  Scenario: add customer flow
    When user need to fill up the fields
    And user click on submit button
    Then user verify customer id is generated

  Scenario: add customer flow
    When user need to fill up the fields 1D List
      | prem | kumar | prem@gmail.com | pudukkoati | 987654 |
    And user click on submit button
    Then user verify customer id is generated

  Scenario: add customer flow
    When user need to fill up the fields 1D Map
      | fname       | prem           |
      | lname       | kumar          |
      | email       | prem@gmail.com |
      | addr        | pudukkoati     |
      | telephoneno |         987654 |
    And user click on submit button
    Then user verify customer id is generated

  Scenario Outline: add customer flow
    When user need to fill up the fields Scenario OUTLINE "<fname>","<lname>","<email>","<addr>","<telephoneno>"
    And user click on submit button
    Then user verify customer id is generated

    Examples: 
      | fname  | lname | email          | addr       | telephoneno |
      | prem   | kumar | prem@gmail.com | pudukkoati |      987654 |
      | karthi | Rajan | kk@gmail.com   | chennai    |       98765 |
