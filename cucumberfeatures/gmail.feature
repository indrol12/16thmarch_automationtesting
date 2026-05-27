
Feature: Gmail Login

  Scenario: verify gmail login successfull by providing valid credential
    Given user should be registered with valid credentials
    When user enters email and password
    Then Gmail Login Successfull


  