Feature: Checking the Booking Functionality of and Adactin Application
Scenario Outline: Login Functionality
Given user Must launch The Url
When user Enter The "<Username>" In The Username Field
And user Enter The "<Password>" In The Password Field
Then user Click the login Button And It Navigates To The Search Hotel Page

Examples:
|Username|Password|
|Gop|123|
|Gopi|456|
|GOPI4674|Gopi@4674|