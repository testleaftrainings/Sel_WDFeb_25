Feature: User Authentication for Leaftaps Application
#Background: 
#Given the user is on the login page
@positive@smoke
Scenario: Successful Login using Valid Credentials

When the user enters the username as 'democsr'
And the user enters the password as 'crmsfa'
And the user clicks the login button
Then the user should be redirected to welcome page
And the user should view the welcome message

@negative
Scenario: Failed Login using Invalid Credentials


When the user enters the username as 'manager'
And the user enters the password as 'crmsa'
And the user clicks the login button
But the user should not redirected to welcome page


