# Vending-Machine-OOP
vending machine using java 
This application can let user to buy foods and drinks by type an input or read input.txt file to order and got a receipt.
Run on DemoVM.java

## Example of input and output:

Welcome to our Vending Machine<br>
You want to add food(1) or drinks(2)<br>
1<br>
Here are our foods<br>
Enter 1 for Chips            15.00 Baht    15 pieces left <br>
Enter 2 for Sandwich         25.00 Baht    12 pieces left <br>
Enter 3 for Chocolate        10.00 Baht    20 pieces left <br>
Enter 4 for Cookie           12.00 Baht    10 pieces left <br>
2<br>
how many pieces do you need: <br>
10<br>
Sandwich  10 pieces  250.0Baht<br>
want to add more product to cart? (type y or n): <br>
n<br>
-------------------------------------------------<br>
Order<br>
Food :<br>
Sandwich  10 pieces 250.00 Baht <br>
Total Price :250.0<br>
-------------------------------------------------<br>
 Enter coins as follows: <br>
 How many coins do you want to put in (1Baht 5Baht 10Baht 100Baht)<br>
 Ex. if you want 2 coin of ten Baht to pay = 0 0 2 0  <br>
0 0 0 3<br>
here is your change :50.0Baht<br>

## or user can create input.txt file and run on ReadFile.java 
Input file have to use this template:

drink Cola 5 can, <br>
food Chips 6 pieces,<br>
drink Coffee 2 can,<br>
food Chocolate 4 pieces,<br>
food Cookie 10 pieces,<br>
dink Tea 3 can<br>
All the coins put in are:<br>
0oneBahtCoin 0fiveBahtCoin 2tenBahtCoin 5hundredBahtCoin<br>

## Output.txt file: 
-------------------------------------------------<br>
Order<br>
Food :
Chips     6 pieces 90.00 Baht <br>
Chocolate 4 pieces 40.00 Baht <br>
Cookie    10 pieces 120.00 Baht <br>

Drink :<br>
Cola      5 pieces 100.00 Baht <br>
Coffee    2 pieces 60.00 Baht <br>
Tea       3 pieces 75.00 Baht <br>

Total price: 485.0 Baht<br>
You gave all 520Baht<br>
here is your change :35.0Baht<br>
-------------------------------------------------<br>




