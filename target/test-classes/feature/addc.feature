
@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag2
  Scenario Outline:Adding
 Given User in Guru telecom page and click the submit button
    When User Enters the details and click submit button "<FirstName>","<LastName>","<email>","<Address>","<mobilenumber>"
    Then User verify customer id is displayed


    Examples: 
      |FirstName    | LastName        | email                  |Address    |mobilenumber|
      | Gunasekaran |     Govindasamy | gunaanjali03@gmail.com |Krishnagiri|915949153   |
       | Gunasekara |     Govindasam | gunaanjali033@gmail.com |Krishnagirii|9159491572   |
      
