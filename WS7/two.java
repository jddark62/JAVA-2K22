/*
 * Write a JAVA program which has 
a.  A Class called Account that creates account with 500Rs minimum balance,
 a deposit() method to deposit amount, 
 a withdraw() method to withdraw amount and
  also throws LessBalanceException if an account holder tries to withdraw money which makes the balance become less than 500Rs.
b. A Class called LessBalanceException which returns the statement that says withdraw amount (___Rs) is not valid.
c. A Class which creates 2 accounts, both account deposit money and one account tries to withdraw more money which generates a LessBalanceException take appropriate action for the same.

 */

import java.util.Scanner;

class Account {
    int balance;
    Account(int balance) {
        this.balance = balance;
    }
    void deposit(int amount) {
        balance += amount;
    }
    void withdraw(int amount) throws LessBalanceException {
        if (balance - amount < 500) {
            throw new LessBalanceException(amount);
        }
        balance -= amount;
    }
}

class LessBalanceException extends Exception {
    LessBalanceException(int amount) {
        super("Withdraw amount " + amount + " is not valid.");
    }
}

class two {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Account account1 = new Account(500);
        Account account2 = new Account(500);
        System.out.println("Enter the amount to be deposited in account 1:");
        int amount = input.nextInt();
        account1.deposit(amount);
        System.out.println("Enter the amount to be deposited in account 2:");
        amount = input.nextInt();
        account2.deposit(amount);
        System.out.println("Enter the amount to be withdrawn from account 1:");
        amount = input.nextInt();
        try {
            account1.withdraw(amount);
        } catch (LessBalanceException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Enter the amount to be withdrawn from account 2:");
        amount = input.nextInt();
        try {
            account2.withdraw(amount);
        } catch (LessBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}