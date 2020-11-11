Feature: Search

  @Smoke
  Scenario Outline: Front-end - This scenario will validate the search functionality
    Given User navigate to application
     And user scroll down '<pixels>'
     When user click on hire from software talent pool
     And user click on About Us
     Then user click on Contact Us
     And user scroll down '<pixels>'
     
     Examples:
     | pixels |
     | "500"    |
     
  @Regression
  Scenario Outline: Front-end - This scenario will fill certain fields and upload file
  	Given User navigate to application
  	And user scroll down '<pixels>'
  	When user click on hire from software talent pool
  	And user scroll down '<pixels>'
  	#And user send keys
  	And user send key for position 
  	And user click on dropdown
  	And user send keys Zip Code
  	And user send keys input messege
  	And user send keys First Name
  	And user send keys Last Name
  	And user send keys Email
  	And user send keys Phone No
  	And user send keys company
  	And user send keys job title
    Then user to upload file
    And user click on send key
    
 	 Examples:
     | pixels |
     | "500"    |
     
     
     @WhizportLinks
 Scenario: Front-end  Checking all active and broken links 
 	Given User to navigate to application
 	And user to check all broken links