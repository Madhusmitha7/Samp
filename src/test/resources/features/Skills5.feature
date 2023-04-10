Feature: Skills Record creation
	
Background: Common steps
    Given User launch chrome browser
    When User opens URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"

  Scenario: Create SKills Record
 		When User Navigate to LogIn Page2
    			|Username|Password|
    			|Admin   |admin123|
    Then Creted Skills Record3
          |SKILLNAME|SKILLDESCR| 
					|Java12101|Java12101 descr|
					|Java13101|Java13101 descr|
					|Java14101|Java14101 descr|
    When Click on logout button
    Then Close Browser
