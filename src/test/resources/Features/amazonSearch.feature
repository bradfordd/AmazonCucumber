# Dylan Bradford
# 12/09/22
# Set of features involved in searching for an object of Amazon

Feature: Testing Amazon search functionality

	Scenario: Check can search on Amazon storefront and get relevant results
	
		Given user is on Amazon Homepage
		When user searches for a type of item in the amazon searchbar
		And user presses enter
		Then user is navigated to page containing search results