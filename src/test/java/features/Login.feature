Feature: Login functionality for seller dashboard
@loginSuccess
  Scenario Outline: Successful login with valid credentials
    Given the user is on the seller info page and navigates to login page by clicking the login button
    When the user enters valid <username> and <password>
    And clicks the login button
    Then the user should be redirected to the dashboard

    Examples: 
      | username                     | password        |
      | "nikhilk.ug18.cs@nitp.ac.in" | "Mypapa@123456" |
      

@StressloginSuccess
  Scenario Outline: Successful login with valid credentials
    #Given the user is on the seller info page and navigates to login page by clicking the login button
    #When the user enters valid <username> and <password>
    #And clicks the login button
    #And the user should be redirected to the dashboard
		Then User clicks on the logout button
		
    Examples: 
      | username                     | password        |
      | "nikhilk.ug18.cs@nitp.ac.in" | "Mypapa@123456" |


@loginUnsuccess
  Scenario Outline: Unsuccessful login with invalid credentials
    Given the user is on the seller info page and navigates to login page by clicking the login button
    When the user enters invalid <username> and second time invalid <password>
    And clicks the login button
    Then an error message should be displayed

    Examples: 
      | username                     | password        |
      | "nkhilk.ug18.cs@nitp.ac.in"  | "Mypapa@123456" |
      | "nikhilk.ug18.cs@nitp.ac.in" | "Mypapa@12345"  |
      | "nkhilk.ug18.cs@nitp.ac.in"  | "Mypapa@12345"  |
      
  Scenario: Unsuccessful login with empty credentials
    Given the user is on the login page
    When the user leaves username and password fields empty
    And clicks the login button
    Then a validation message should be displayed
#
  Scenario: Forgotten password link is functional
    Given the user is on the login page
    When the user clicks the "Forgot Password" link
    Then the user should be redirected to the password recovery page to recreate the new password
