Note: I wrote the main method to output something similar to the expected output, not to outup everything asked in the Testing section.
# Exercise 1: Basic Banking System
Implement the Account class with the following requirements:

## Attributes:
●   number (int)  (account number)
●   owner (String)  (owner name)
●   balance (double) (balance)
●   limit (double)   (limit)

## Methods:
1. deposits(double quantity): adds value to the balance
2. withdraws(double value): subtracts value from the balance (returning boolean for success)
3. printsOwner(): shows the account owner's name
4. retrievesbalance(): returns the current balance
5. transfersTo(Conta destination, double value): transfers value to another account
6. printsInfo(): shows all account data

Challenge: Implement limit verification when withdrawing.

## For Testing:
Create a main method inside the Account class to test all implemented functionalities.

In the main method, follow the steps below:
●   Create two instances (objects) of the Account class.
●   Assign values to the attributes of each account (number, owner, balance, and limit).
●   Test the implemented methods:
	Perform deposits and withdrawals in both accounts.
	Transfer a value from one account to another.
	Display the account data before and after the operations.
●   Verify the results printed to the console to ensure that the methods are  working correctly.
●   Include explanatory messages in the console to facilitate understanding of the tests.

### Expected Output Example:
=== ACCOUNT CLASS TEST ===
Details of account 1:
Account's number: 123
Account's owner name: Maria Silva
Account's balance: R$1000.0
Account's limit: R$500.0

Depositing R$200 in Maria's account...
New balance: R$1200.0

Withdrawing R$1500 from Maria's account...
Withdraw successful!
Current balance: R$-300.0

Insufficient funds! Your remaining limit will be transfered.
Transfering R$200.0 to Bob...
Depositing R$200.0 in Bob's account...
New balance: R$700.0

Transfer complete!

Accounts final balances:
Account 1 - balance: R$-500.0
Account 2 - balance: R$700.0
