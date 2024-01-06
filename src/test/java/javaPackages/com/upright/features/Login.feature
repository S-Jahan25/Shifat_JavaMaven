Feature: Verifying the Profile web application

  # given means (precondition), when (Action), then (Validation/Test)
  #Background is a key word, Features key word.
  #steps always starts with given, when, Then, And
  Background: The Profile link is visible
    Given The profile link is loaded in the browser


  Scenario: TC-101-Verify that the the title shows something meaningful
    When user capture the title
    Then the title should be something meaningful

  Scenario: TC-102 - Very the web url
      When user capture the url
      Then the url should be with http and the name










  #Scenario: TC102.1- Verify the Inputbox
   # When user Click on the Inputbox and Try to write
    #Then input box should allow the user to write inside


  #Scenario: Tc-103 Verify that the input box is available
   #When user click on it
   # Then it shows All the Testing tool name

  #Scenario: Tc-104
   # When User see Project Management tool
    #Then User can type Jira

  #Scenario: Tc-105
   # When User Click on the facebook link
    #Then it should take it to the Facebook Page

  #Scenario: Tc-106
   # When User Click on Linkedin Link
    #Then it should take it to Linkedin Page