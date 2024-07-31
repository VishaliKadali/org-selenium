Feature: Leaftaps application

Scenario: Leaftaps login positive flow

#Given Launch the browser
#And Load the url and maximize the application
When Enter the username as 'DemoSalesManager'
And Enter the password as 'crmsfa'
And Click Login
Then Verify Homepage is displayed

Scenario: Leaftaps login negative flow

#And Load the url and maximize the application
When Enter the username as 'Demo'
And Enter the password as 'crmsfa'
And Click Login
But Verify Error message is displayed



