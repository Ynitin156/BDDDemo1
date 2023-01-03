Feature:Test the OrangeHRM application 
Scenario Outline:Test the login page with valid details
Given Open the chrome browser and url of the application
When Enter "<username>" , "<password>" and click on the login button
Then Success in login and homepage open

Examples:

|username  |password|
|aaaa      |54321|
|bbbb      |12345|




