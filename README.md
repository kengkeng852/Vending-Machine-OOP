# Vending-Machine-OOP
vending machine using java 
This application can let user to buy foods and drinks by type an input or read input.txt file to order and got a receipt.
Run on DemoVM.java
Example of input and output:
Welcome to our Vending Machine
You want to add food(1) or drinks(2)
1
Here are our foods
Enter 1 for Chips            15.00 Baht    15 pieces left 
Enter 2 for Sandwich         25.00 Baht    12 pieces left 
Enter 3 for Chocolate        10.00 Baht    20 pieces left 
Enter 4 for Cookie           12.00 Baht    10 pieces left 
2
how many pieces do you need: 
10
Sandwich  10 pieces  250.0Baht
want to add more product to cart? (type y or n): 
n
-------------------------------------------------
Order
Food :
Sandwich  10 pieces 250.00 Baht 
Total Price :250.0
-------------------------------------------------
 Enter coins as follows: 
 How many coins do you want to put in (1Baht 5Baht 10Baht 100Baht)
 Ex. if you want 2 coin of ten Baht to pay = 0 0 2 0  
0 0 0 3
here is your change :50.0Baht

or user can create input.txt file and run on ReadFile.java 
Input file have to use this template:

drink Cola 5 can,
food Chips 6 pieces,
drink Coffee 2 can,
food Chocolate 4 pieces,
food Cookie 10 pieces,
dink Tea 3 can
All the coins put in are:
0oneBahtCoin 0fiveBahtCoin 2tenBahtCoin 5hundredBahtCoin

Output.txt file: 
-------------------------------------------------
Order
Food :
Chips     6 pieces 90.00 Baht 
Chocolate 4 pieces 40.00 Baht 
Cookie    10 pieces 120.00 Baht 

Drink :
Cola      5 pieces 100.00 Baht 
Coffee    2 pieces 60.00 Baht 
Tea       3 pieces 75.00 Baht 

Total price: 485.0 Baht
You gave all 520Baht
here is your change :35.0Baht
-------------------------------------------------

