@tag
Feature: Verify the sign up functionality of trialshoppy

  @signup
  Scenario Outline: To validate successfully land on SignUp page
    Given the user is on the seller info page
    When User enter <email_address> and clicks on start selling button
    Then User successfully lands on sign up page

    Examples: 
      | email_address        |
      | "gurpreet@gmail.com" |

  @fillSignUpPage
  Scenario Outline: To validate account created successfully after filling signup page
    Given the user is on the seller info page
    When User enter <email_address> and clicks on start selling button
    And User successfully lands on sign up page
    Then User successfully lands on sign up page
    And user click on Send OTP button to receive OTP on <emailAddress> and enters the OTP
    And User enters the Ten Digit <mobile_number>
    And User enter the <valid_Password>
    And User click on create Account button
    And user navigates to the Basic info page
    And User enters the <firstName>, <lastName>, <Pincode>, <addressLine>, <City> and <state>
    And User clicks on the save and next button
    And User navigates to the business info page
    And User enters <store>, <storeDescription>, <GSTNumber>,<pincode>,<bAddressLine>, <bcity>, <bstate> and <bcountry>
    Then User navigates to verification page

    Examples: 
      | email_address               | emailAddress                | mobile_number | valid_Password | firstName    | lastName  | Pincode  | addressLine                          | City        | state       | store   | storeDescription                       | GSTNumber       | pincode  | bAddressLine | bcity    | bstate       | bcountry |
      | "nikhilk.pg23cs@nitp.ac.in" | "nikhilk.pg23cs@nitp.ac.in" | "9176132801"  | "Guru@1234"    | "Gurpreet17" | "Singh17" | "784495" | "Ward No 10 JN Road opposite of SBI" | "Rangapara" | "Assam    " | "cloth" | "Selling furnitures for Advance India" | "1234567898235" | "784305" | "Ward No 10" | "Mumbai" | "Maharastra" | "India"  |
      #| "bhamrasingh12@yopmail.com"  | "bhamrasingh12@yopmail.com"  | "9176132798"  | "Guru@1234"    | "Gurpreet"   | "Singh"   | "784505" | "Ward No 10 JN Road opposite of SBI" | "Rangapara" | "Assam    " | "Furniture" | "Selling furnitures for Advance India" | "1234567898765" | "784505" | "Ward No 10 JN Road opposite of SBI" | "Mumbai" | "Maharastra" | "India"  |
