@Jpetstore_feature
Feature: Jpet Website
@tc01_register
Scenario: Registration to the application
Given Enter user ID and password
When Add the account information
Then Save the account inforamtion
And Complete the registration

@tc02_Login
Scenario: Login to the Jpet store application

Given the user launches the website in chrome browser
When opens the login page
Then enter username and password
And click on login button

@tc03_Searchmain
Scenario: Search for the animal in the application

Given the search bar in the login page
When search for the animal you are looking for
Then enter the product id and name in the search bar
And click on the Search button

@tc04_search
Scenario: seraching for product
Given :open the jpet website
When :enter the item name
Then :Click on search bar
And :close the website
 
@tc05_invalidsearch
Scenario: Seraching for product
Given :Open the jpet website
When :Enter the item name
Then :click on search bar
And :Close the website


 @tc06_searchbyhint
Scenario: Seraching for product
Given :Open the Jpet website
When :Enter the Item name with hint
Then :click on Search bar
And :Close the Website


 @tc07_searchbyhomepage
Scenario: Seraching for the product
Given :Open the JPET website
When :click on image
Then :click on Search
And :Close The Website
        
 @tc08_searchbyproductid
Scenario: Seraching for the Product
Given :Open the JPET Website
When :click on product
Then :click on Searchbar
And :Close The jpetWebsite

@tc09_jpetstorelogin
Scenario:
Login in to JPetStore application

Given the user launched the chromebrowser
When the user open the JPetStore website
Then user clicks on login button
Then the user enters the username and password clicks on login button

@tc10_addtocart
Scenario: Add the animals or bird to the cart

Given the details of the required animal or bird
When the product id and name of the animal is added to the cart
Then check the shopping cart
And contains the wish list 



@tc11_addtocart
Scenario: Add to Cart in the JPet Store application.

Given open the url in browser 
When the url is launched click on search and enter search content
Then click on search button
And click on product id
And click on Item ID
And click on addtocart



@tc12_removefromcart
Scenario: remove item from the cart in the JPet Store application.

Given open the given url in the browser
When the url is launched then click on search and enter search content
Then click on the Search button
And click on product ID
And click on Item id
And click on AddToCart
And click on RemoveFromCart

@tc13_updatecart
Scenario: update cart in the JPet Store application.
Given Open the url in browser 
When the url is launched click on search and enter search content in search
Then click on the searchbutton bar
And click on the product id
And click on the Item ID
And click on the addtocart
And change the quantity 
And click on the update cart

@tc14_signout
Scenario: Sign out from the JPet Store application.

Given the user has launched the chromebrowser
When the user opens the JPetStore website
Then user clicking on login button
And the user enterS the username and password clicks on login button
And after login sign out from the apllication

@tc15_printtable
Scenario: Prints the details in a table
 
 Given the details of an animal in the homepage
 When the details are matched
 Then the selected animals details are printed
 And details are printed in a table




 