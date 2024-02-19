Feature: Signup Module For Parabank Application

Scenario Outline: Postive Test case for Signup module 

Given User enter the landing page and then click register button
When User enter the all details like "<firstname>","<lastname>","<address>","<city>","<state>","<zipcode>","<phone>","<ssn>","<username>","<password>","<confirm>"
Then User click the register button and its shows successfully message
Examples:
| firstname | lastname | address | city | state | zipcode | phone | ssn | username | password | confirm |
| abcd			|  la			 | dummy address | dummy	| dummy state | 60000 | 7410258963 | 86412 | ram12 | 12345 | 12345 |
| abcd			|  la			 | dummy address | dummy	| dummy state | 60000 | 7410258963 | 86412 | ranjith21| 12345 | 12345 |
