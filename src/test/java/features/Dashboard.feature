@tag
Feature: Dashboadd
  I want to use this template for my feature file

  @tag1
  Scenario Outline: To verify visibility of Sidebar element
    Given User is on the dashboard after successful login
    When user enters <username> and <password> and clicked on login button
    Then the user see all the element such as dashboard Products, Support, Return ,Orders, Offers , Payments, Chats, Video Calls

    Examples: 
      | username                     | password    |
      | "janhviyadav01nov@gmail.com" | "1Janhvi1$" |

  @tag2
  Scenario Outline: To check and verify the functionality of Log Out button
    Given User is on the dashboard after successful login
    When user enters <username> and <password> and clicked on login button
    And user click on Log Out button the website should be logout
    Then User should see  Log Out message successfuly

    Examples: 
      | username                     | password    |
      | "janhviyadav01nov@gmail.com" | "1Janhvi1$" |

  @tag3
  Scenario Outline: To verify visibility of tabs on dashboard
    Given User is on the dashboard after successful login
    When user enters <username> and <password> and clicked on login button
    Then user see all element are clearly visible on screen

    Examples: 
      | username                     | password    |
      | "janhviyadav01nov@gmail.com" | "1Janhvi1$" |

  @tags4
  Scenario Outline: To check  the Function of header button
    Given User is on the dashboard after successful login
    When user enters <username> and <password> and clicked on login button
    And It redirect user to previous page.

    Examples: 
      | username                     | password    |
      | "janhviyadav01nov@gmail.com" | "1Janhvi1$" |

  @tag5
  Scenario Outline: To check  the Function of header button
    Given User is on the dashboard after successful login
    When user enters <username> and <password> and clicked on login button
    And it should show all the relevant notification of the site the things which are update

    Examples: 
      | username                     | password    |
      | "janhviyadav01nov@gmail.com" | "1Janhvi1$" |

  @tag6
  Scenario Outline: To check  the Function of header button
    Given User is on the dashboard after successful login
    When user enters <username> and <password> and clicked on login button
    And they navigate to profile section

    Examples: 
      | username                     | password    |
      | "janhviyadav01nov@gmail.com" | "1Janhvi1$" |

  @tag7
  Scenario Outline: To check  the Function of profile button
    Given User is on the dashboard after successful login
    When user enters <username> and <password> and clicked on login button
    And All button are clickable

    Examples: 
      | username                     | password    |
      | "janhviyadav01nov@gmail.com" | "1Janhvi1$" |

  @tag8
  Scenario Outline: To check and Verify the upload Profile button in profile
    Given User is on the dashboard after successful login
    When user enters <username> and <password> and clicked on login button
    And It should upload the profile directy but it show message of "Please Upload Profile" but by clicking on edit profile button it show that profile is uploaded

    Examples: 
      | username                     | password    |
      | "janhviyadav01nov@gmail.com" | "1Janhvi1$" |

  @tag9
  Scenario Outline: To check and Verify that Choose File button
    Given User is on the dashboard after successful login
    When user enters <username> and <password> and clicked on login button
    And It show that profile is uploaded but it show at top after refresh

    Examples: 
      | username                     | password    |
      | "janhviyadav01nov@gmail.com" | "1Janhvi1$" |

  @tag10
  Scenario Outline: To check and Verify Upload Button
    Given User is on the dashboard after successful login
    When user enters <username> and <password> and clicked on login button
    And In Edit Profile user can easily change data without clicking on Edit profile button

    Examples: 
      | username                     | password    |
      | "janhviyadav01nov@gmail.com" | "1Janhvi1$" |

  @tag11
  Scenario Outline: To check and Verify My Store button
    Given User is on the dashboard after successful login
    When user enters <username> and <password> and clicked on login button
    And In My Store were all buttons are clickable

    Examples: 
      | username                     | password    |
      | "janhviyadav01nov@gmail.com" | "1Janhvi1$" |

  @Tag12
  Scenario Outline: To check and Verify Upload Profile  button
    Given User is on the dashboard after successful login
    When user enters <username> and <password> and clicked on login button
    And User click on Upload Profile it show message that "Profile Updated Successfully" without filling any data

    Examples: 
      | username                     | password    |
      | "janhviyadav01nov@gmail.com" | "1Janhvi1$" |

  @tag13
  Scenario Outline: To check and Verify Upload  button
    Given User is on the dashboard after successful login
    When user enters <username> and <password> and clicked on login button
    And without clicking on edit button user can easily edit all the data and press on Edit button it show message of "Store Updated Successfully"

    Examples: 
      | username                     | password    |
      | "janhviyadav01nov@gmail.com" | "1Janhvi1$" |

  @tag14
  Scenario: to check and verify the to check and verify the Products button
    Given User is on the dashboard after successful login
    When user enters <username> and <password> and clicked on login button
    And Check all button are clickable

  @tag15
  Scenario: to check and verify the Products button
    Given User is on the dashboard after successful login
    When user enters <username> and <password> and clicked on login button
    And in categories check all button are clickable such as - Fashion, Jewellery, Electronics, FURNITURE

  @tag16
  Scenario: to check and verify  Categories under products
    Given User is on the dashboard after successful login
    When user enters <username> and <password> and clicked on login button
    And User click on Add Products
    Then User select the product from Categories

  @tag17
  Scenario: to check and verify the functionality of Fashion option in Categorise
    Given User is on the dashboard after successful login
    When user enters <username> and <password> and clicked on login button
    And user select Fashion Option  from Categorise
    Then user check all the element in Fashion option are visible such as- Men’s Clothing, Women Ethnic, Women Western, Mens Footwear, Women Footwear, Kids Clothing, Kids Boys,Footwear, Sportswear, Beauty & Cosmetics

  @tag18
  Scenario: to check and verify the functionality of Jewellery option in Categorise
    Given User is on the dashboard after successful login
    When user enters <username> and <password> and clicked on login button
    And user select Jewellery Option from Categories
    Then User click all element in Jewellery option are visible such as- Gold & Diamond, Silver Jewellery, Gold & Silver Coins, Fashion Jewellery, Mens Jewellery

  @tag19
  Scenario: to check and verify the functionality of Electronic option in Categorise
    Given User is on the dashboard after successful login
    When user enters <username> and <password> and clicked on login button
    And User select Electronics option from Categories
    Then user check all element in Electronic are visible such as -Laptops & Computers, Mobiles and Accessories, TVs & Home Appliances, Headphones/Cameras, Headphones/Cameras, Headphones/Cameras

  @tags20
  Scenario: to check and verify the functionality of Furniture option in Categorise
    Given User is on the dashboard after successful login
    When user enters <username> and <password> and clicked on login button
    And user select  FURNITURE option from Categories
    Then user check all element in Furniture are visible such as- Sofas and Recliners, Seatings and Tables, Wardrobes and More, Kids & Teens, Outdoor and Care, Home Decor, Furnishings & Mattresses

  @tag21
  Scenario: to check and verify the functionality of Fashion button  in Categorise
    Given User is on the dashboard after successful login
    When user enters <username> and <password> and clicked on login button
    And User click on Fashion button it show number of element
    Then user click on Men's Clothing section to check that  elements are clickable  Men's Top Wear, Men's Bottom Wear, Men's Co-ords, Others

  @tag22
  Scenario: to check and verify the functionality of Fashion button in Categorise
    Given User is on the dashboard after successful login
    When user enters <username> and <password> and clicked on login button
    And User click on Fashion button  it show number of element, so check 'Men’s Clothing'
    Then User click on 'Mens Clothing' so all elements of this section appear then user click on  'Men’s Top Wear' to check  all elements are clickable  such as 'T-Shirts, Casual Shirts, Formal Shirts, Men’s Blazers, Men’s Kurtas, Jackets, Gilet & Coats Knitwear, Hoodies & Sweatshirts'

  @tag23
  Scenario: to check and verify the functionality of Fashion button in Categorise
    Given User is on the dashboard after successful login
    When user enters <username> and <password> and clicked on login button
    And User click on Fashion button  it show number of element, so  check 'Men's Bottom Wear
    Then User click on 'Men's Clothing' so all elements of this section appear then user click on  'Men's Bottom Wear' to check all elements are clickable such as  Casual Trousers, Jeans, Shorts & 3/4th, Men’s Cargos, Men’s Pyjamas, Track Pants ,Formal Trousers, Dhoti & Lungi

  @tag24
  Scenario: to check and verify the functionality of Fashion button in Categorise
    Given User is on the dashboard after successful login
    When user enters <username> and <password> and clicked on login button
    And User click on Fashion button  it show number of element, so check 'Men's Co-ords'
    Then User click on 'Men's Clothing' so all element of this section appear then user  click on 'Men's Co-ords' to check all elements are clickable such as Track suits, Suits, Sherwani, Ethnic Sets

    @tags25
    Scenario: to check and verify the functionality of Fashion button in Categorise
    Given User is on the dashboard after successful login
    When user enters <username> and <password> and clicked on login button
    And User click on 'Fashion button'  it show number of element, so check 'Other then user click on other it directly give option to update the products 


    @tag26
    Scenario: to check and verify the functionality of Fashion button in Categorise
    Given User is on the dashboard after successful login
    When user enters <username> and <password> and clicked on login button
    And User click on Fashion button  it show number of element, so check  Women Ethnic
    Then  User click on ' Women Ethnic' so all element of this section appear then user  click on 'Basic Ethnic Wear' to check all elements are clickable such as Sarees, Kurtis
    
   
    