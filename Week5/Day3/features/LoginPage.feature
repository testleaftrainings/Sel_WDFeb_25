Feature: User Authentication for Leaftaps Application
@positive@smoke
Scenario: Successful Login using Valid Credentials

Given the user is on the login page
When the user enters the username as 'demosalesmanager'
And the user enters the password as 'crmsfa'
And the user clicks the login button
Then the user should be redirected to welcome page
And the user should view the welcome message

@negative
Scenario: Failed Login using Invalid Credentials

Given the user is on the login page
When the user enters the username as 'demosalesmanager'
And the user enters the password as 'crmsa'
And the user clicks the login button
But the user should not redirected to welcome page


