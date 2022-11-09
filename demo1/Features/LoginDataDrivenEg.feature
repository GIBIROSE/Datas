Feature: Login

  Scenario Outline: Login Data Driven 
	Given User Launch Chrome browser 
	When User opens URL "http://admin-demo.nopcommerce.com/login" 
	And User enters Email as "<email>" and Password as "<password>" 
	When Click on Login 
	And close browser 
	
	Examples: 
		| email | password |
		| admin@yourstore.com	|	admin |
		| admin1@yourstore.com | admin123	|