Feature: Application Login

Scenario: Homepage default login
Given user is on landing page
When user logs in username and password
Then home page is populated
And cards are displayed
