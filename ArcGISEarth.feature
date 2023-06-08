Feature: User will be able to zoom in and out 

Background: The user is logged in on ArcGISEarth mobile application
Given "<Login Profile Id>" is logged in
When   User sees earth on page
And    User is registered with "<Language>"


Scenario Outline: "<TestCaseID>" Customer is able to zoom in ArcGISEarth
Then User will be able to zoom in 



Examples:
| TestCaseId     | Login Profile Id | Language  |
| ArcGis_Earth_1 | 1819             | English   |




Scenario Outline: "<TestCaseID>" Customer is able to zoom out ArcGISEarth
Then User will be able to zoom out



Examples:
| TestCaseId     | Login Profile Id | Language |
| ArcGis_Earth_2 | 1820             | English  |
