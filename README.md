Inventory App - Project Specification
=====================================

### SCREENSHOTS

[![N|Solid](http://i.imgur.com/wQAT9wxm.png)](http://i.imgur.com/wQAT9wxm.png) [![N|Solid](http://i.imgur.com/sRCP2jWm.png)](http://i.imgur.com/sRCP2jWm.png) [![N|Solid](http://i.imgur.com/0CbtQ8Nm.png)](http://i.imgur.com/0CbtQ8Nm.png) [![N|Solid](http://i.imgur.com/23YaKJFm.png)](http://i.imgur.com/23YaKJFm.png) 

### YOUTUBE

[![Watch the video](http://i.imgur.com/hNlwD27.png)](https://www.youtube.com/watch?v=PNce2Okm6Xk)


#Layout
------------


Overall Layout
--------------

The app contains a list of current products and a button to add a new product.
Used in a Udacity course in the Android Basics Nanodegree by Google as final project.


List Item Layout
-----------------

Each list item displays the product name, current quantity, and price. Each list item also contains a Sale Button that reduces the quantity by one (include logic so that no negative quantities are displayed).


Detail Layout
---------------

1. The Detail Layout for each item displays the remainder of the information stored in the database.
2. The Detail Layout contains buttons that increase and decrease the available quantity displayed.
3. The Detail Layout contains a button to order from the supplier.
4. The detail view contains a button to delete the product record entirely.


Layout Best Practices
----------------------

The code adheres to all of the following best practices:
    - Text sizes are defined in sp
    - Lengths are defined in dp
    - Padding and margin is used appropriately, such that the views are not crammed up against each other.


Default Textview
-----------------

When there is no information to display in the database, the layout displays a TextView with instructions on how to populate the database. 




#Functionality
-------------


Runtime Errors
--------------

The code runs without errors. For example, when user inputs product information (quantity, price, name, image), instead of erroring out, the app includes logic to validate that no null values are accepted. If a null value is inputted, add a Toast that prompts the user to input the correct information before they can continue.


ListView Population
--------------------

The listView populates with the current products stored in the table.


Add product button
------------------

The Add product button prompts the user for information about the product and a picture, each of which are then properly stored in the table.


Input validation
------------------

User input is validated. In particular, empty product information is not accepted. If user inputs product information (quantity, price, name, image), instead of erroring out, the app includes logic to validate that no null values are accepted. If a null value is inputted, add a Toast that prompts the user to input the correct information before they can continue. 


Sale Button
------------

Each list item contains a Sale Button which reduces the quantity available by one (include logic so that no negative quantities are displayed).


Detail View intent
------------------

Clicking on the rest of each list item sends the user to the detail screen for the correct product.


Modify quantity buttons
-----------------------

The modify quantity buttons in the detail view properly increase and decrease the quantity available for the correct product.
The student may also add input for how much to increase or decrease the quantity by.


Order Button
-------------

The ‘order more’ button sends an intent to either a phone app or an email app to contact the supplier using the information stored in the database.


Delete button
-------------

The delete button prompts the user for confirmation and, if confirmed, deletes the product record entirely and sends the user back to the main activity. 


External Libraries and Packages
-------------------------------

The intent of this project is to give you practice writing raw Java code using the necessary classes provided by the Android framework; therefore, the use of external libraries for core functionality will not be permitted to complete this project.




#Code Readability
-----------------


Naming conventions
------------------

All variables, methods, and resource IDs are descriptively named such that another developer reading the code can easily understand their function.


Format
------

The code is properly formatted i.e. there are no unnecessary blank lines; there are no unused variables or methods; there is no commented out code.
The code also has proper indentation when defining variables and methods.








