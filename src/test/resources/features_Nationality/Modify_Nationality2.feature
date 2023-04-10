Feature: Nationality Record creation

	
Background: Common steps
    Given User launch chrome browser
    When User opens URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"

@Smoke1
Scenario: TC01_ Create Nationality Record
 	When User Navigate to LogIn Page2
    			|Username|Password|
    			|Admin   |admin123|
    Then Creted Nationality Record3
          |NATIONALITYNAME|
					|Indian12322|
					|Indian12422|
					|Indian12522|
    When Click on logout button
    Then Close Browser
 
