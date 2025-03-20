Feature: Lead Created using CRM application

#Background: 
#Given the user is on the login page

@createLead
Scenario Outline: Successful Creating the Lead providing the Valid Data


When the user enters the username as 'demosalesmanager'
And the user enters the password as 'crmsfa'
And the user clicks the login button
Then the user should be redirected to welcome page
And the user should view the welcome message
When the user clicks the crmsfa link
And the user clicks the leads menu
And the user clicks the create lead
And the user enters the company name as <cname>
And the user enters the first name as <fname>
And the user enters the last name as <lname>
And the user enters the phone number as <phno>
And the user clicks the create lead button

Examples:
|cname|fname|lname|phno|
|Testleaf|Bhuvanesh|M|987|
|TCS|Harrish|A|897|


