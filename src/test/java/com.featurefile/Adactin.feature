Feature: Hotel booking functionality in adactin application
Scenario: User login to the adactin application

Given User launch adactin application
When user enter user name
When user enter password
And user click ok button
Then It naviagte to the search hotel page


Scenario: User filling there details to book hotel
When User selecting the location
When User selecting the Hotels 
When User selecting the Room Type
When User selecting the Number of Rooms
When User entering the Check In Date
When User entering the Check Out Date
When User selecting the Adults per Room
When User selecting the Children per Room
And User click search button

Scenario: User verifing the hotel details
When user clicking the radio button
And User clicking the continue button

Scenario: User enterig the user details
When  user enter First Name
When  user enter Last Name
When  user enter Billing Address
When  user enter Credit Card No
When  user selecting Credit Card Type
When  user selecting Expiry Date
When  user entering CVV Number
And user clicking booknow button


