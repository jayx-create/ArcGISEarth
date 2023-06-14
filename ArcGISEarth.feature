Feature: User will be able to zoom in and out 

Background: The user is logged in on ArcGISEarth mobile application
Given "<Login Profile Id>" is logged in
When   User sees earth on page
And    User is registered with "<Language>"

@screenSizeType:["Phone"] @executionType:["Browser"] @Language:["English"]
Scenario Outline: "<TestCaseID>" Customer is able to zoom in ArcGISEarth
Then User will be able to zoom in 


@ArcGis_Earth_1
Examples:
| TestCaseId     | Login Profile Id | Language  |
| ArcGis_Earth_1 | 1819             | English   |



@screenSizeType:["Phone"] @executionType:["Browser"] @Language:["English"]
Scenario Outline: "<TestCaseID>" Customer is able to zoom out ArcGISEarth
Then User will be able to zoom out


@ArcGis_Earth_2
Examples:
| TestCaseId     | Login Profile Id | Language |
| ArcGis_Earth_2 | 1820             | English  |
