Feature: Checking the Booking Functionality of and Adactin Application
Scenario: Login Functionality
Given user Must launch The Url
When user Enter The Username In The Username Field
And user Enter The Password In The Password Field
Then user Click the login Button And It Navigates To The Search Hotel Page

Scenario: Search Hotel Functionality
When user Select The Location In The Location Field
And user Select The Hotel In The Hotel Field
And user Select The Room Type In The  Room Type Field
And user Select The Room Numbers In The  Room Numbers Field
And user Erase The Start Date In The Start Date Field 
And user Enter The Date In In The Date In Field
And user Erase The End Date In The End Date Field
And user Enter The Date Out In The Date Out Field
And user Select The Adult In The Adult Field
And user Select The Child In The Child Field
Then User Click The Submit Button and it Navigate to Confirmation page

Scenario: Confirmation Functionality
When user Click The Radio button
Then User Click The Continue Button And It Navigate to Hotel Booking Page.

Scenario: Boking Confirmation Functionality
When user Enter the First Name In The First Name Field
And user Enter The Last Name in The Last Name Field
And user Enter The Billing Address In The Billing Address Field
And user Enter The Card Number In The Card Number Field
And user Select the Type Of Card In The Card Type
And user Select The Expiry Month In The Month Field
And user Select The Expiry Year In The Year Field
And user Enter The Cvv Number In The Cvv Field
Then Click The Booking Button And Navigate To The Booking Confirmation Page
Then Click The Logout Button And Finish The Booking Functionality