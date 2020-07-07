#Author: azizulsyed@gmail.com
#Keywords Summary: It will verify Login functionality
#URL :http://www.executeautomation.com/demosite/Login.html
Feature: Login Functionality
  	This Feature deal with the login functionality of the application
 @test
  Scenario: Verify user should be able to login with correct username and password in FB
    Given Launch "<URL>"
    When user enter "<username>" and "<password>"
    Then user click Signin
    #Then Verify user in FB home page
    
  
   
    
    
    

    
    