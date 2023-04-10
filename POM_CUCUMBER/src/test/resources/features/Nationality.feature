Feature: Orange HRM Application - Create Nationality Record

@cucumber
Scenario: TC01_ Create Nationality Record

 Given I open OpenOrangeHRM website
 When User Navigate to LogIn Page1
    |Username|Password|
    |Admin   |admin123|
# And I created Nationality Record1
#  |Nationality|
#  |Indian661400|
 Then User LogOut from the Application2
 
 
 @cucumber
 Scenario: TC01_ Create Nationality Record
 
 Given I open OpenOrangeHRM website
 When User Navigate to LogIn Page1
    |Username|Password|
    |Admin   |admin123|
 
 #And I created Nationality Record1
 # |Nationality|
 # |Indian66141|
 Then User LogOut from the Application1