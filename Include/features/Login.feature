#Author: Mariana Alzate

Feature: Login
 

  @Login
   Scenario Outline: Login with a valid credential
    Given I navigate to Cura System homepage
    And I enter username <username> and password <password>
    And I click Log in button 
	  Then I should be able to login successfully

    Examples: 
      | username                     | password   |
      | pruebasuracallejas@gmail.com | Contra     |
