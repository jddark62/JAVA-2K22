/*
 *  File Account.java contains a definition for a simple bank account class
 *  with methods to withdraw, deposit, get the balance and account number,
 *  and return a String representation. 
 * Note that the constructor for this class creates a random account number.
 *  Overload the constructor as follows: 
• public Account (double initBal, String owner, long number) 
– initializes the balance, owner, and account number as specified 
• public Account (double initBal, String owner) 
– initializes the balance and owner as specified; randomly generates the account number. 
• public Account (String owner) 
– initializes the owner as specified; sets the initial balance to 0 and randomly generates the account number.
III) The bank wants to keep track of how many accounts exist using  a private static integer variable numAccounts to hold this value. Add a static method getNumAccounts that returns the total number of accounts. 
IV) Add a method void close() to your Account class. This method should close the current account by appending “CLOSED” to the account name and setting the balance to 0. (The account number should remain unchanged.) Also decrement the total number of accounts.
V) The bank also wants to keep track of the total number of deposits and withdrawals (separately) for each day, and the total amount deposited and withdrawn. 
 */

 import java.util.Scanner;
 import java.lang.Math;

 class Account {
    private double initBal; 
      private String owner;
      private double balance;
      private long number;
      private static long nextNumber = 1000000;
      private static long randomNumber = (long) (Math.random() * 1000000);
      private static long accountNumber = randomNumber + nextNumber;
      private static int numAccounts = 0;
      private static double totalDeposits = 0;
      private static double totalWithdrawals = 0;
      private static double totalBalance = 0;
      private static int numDeposits = 0;
      private static int numWithdrawals = 0;
      private static int numClosed = 0;
      private static int numOpened = 0;
      public Account(double initBal, String owner, long number) {
        this.initBal = initBal;
        this.owner = owner;
        this.number = number;
        this.balance = initBal;
      }

      public Account(double initBal, String owner) {
        this.initBal = initBal;
        this.owner = owner;
        this.number = accountNumber;
        this.balance = initBal;
        nextNumber++;
        randomNumber = (long) (Math.random() * 1000000);
        accountNumber = randomNumber + nextNumber;
      }
      public Account(String owner) {
        this.owner = owner;
        this.number = accountNumber;
        this.balance = 0;
        nextNumber++;
        randomNumber = (long) (Math.random() * 1000000);
        accountNumber = randomNumber + nextNumber;
      }

      public void deposit(double amount) {
        balance += amount;
        totalDeposits += amount;
        numDeposits++;
      }

      public void withdraw(double amount) {
        balance -= amount;
        totalWithdrawals += amount;
        numWithdrawals++;
      }

      public double getBalance() {
        return balance;
      }

      public long getNumber() {
        return number;
      }

      public String getOwner() {
        return owner;
      }

      public static int getNumAccounts() {
        return numAccounts;
      }
      public static int getNumDeposits() {
        return numDeposits;
      }

      public static int getNumWithdrawals() {
        return numWithdrawals;
      }

      public static double getTotalDeposits() {
        return totalDeposits;
      }
      public static double getTotalWithdrawals() {
        return totalWithdrawals;
      }
      public static double getTotalBalance() {
        return totalBalance;
      }
      public static int getNumClosed() {
        return numClosed;
      }
      public static int getNumOpened() {
        return numOpened;
      }
      public void close() {
        balance = 0;
        owner += "CLOSED";
        numClosed++;
        numAccounts--;
      }
      public String toString() {
        return "Account number: " + number + "\n" + "Owner: " + owner + "\n" + "Balance: " + balance;
      }

 }
 /**
  * four
  */
 public class four {
 
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         System.out.println("Enter the number of accounts: ");
         int numAccounts = scan.nextInt();
         Account[] accounts = new Account[numAccounts];
         for (int i = 0; i < numAccounts; i++) {
            System.out.println("Enter the initial balance: ");
            double initBal = scan.nextDouble();
            System.out.println("Enter the owner: ");
            String owner = scan.next();
            System.out.println("Enter the account number: ");
            long number = scan.nextLong();
            accounts[i] = new Account(initBal, owner, number);
         }
         for (int i = 0; i < numAccounts; i++) {
            System.out.println(accounts[i]);
         }
         System.out.println("Enter the account number to deposit: ");
         long number = scan.nextLong();
         System.out.println("Enter the amount to deposit: ");
         double amount = scan.nextDouble();
         for (int i = 0; i < numAccounts; i++) {
            if (accounts[i].getNumber() == number) {
               accounts[i].deposit(amount);
            }
         }
         System.out.println("Enter the account number to withdraw: ");
         number = scan.nextLong();
         System.out.println("Enter the amount to withdraw: ");
         amount = scan.nextDouble();
         for (int i = 0; i < numAccounts; i++) {
            if (accounts[i].getNumber() == number) {
               accounts[i].withdraw(amount);
            }
         }
         for (int i = 0; i < numAccounts; i++) {
            System.out.println(accounts[i]);
         }
         System.out.println("Enter the account number to close: ");
         number = scan.nextLong();
         for (int i = 0; i < numAccounts; i++) {
            if (accounts[i].getNumber() == number) {
               accounts[i].close();
            }
         }
         for (int i = 0; i < numAccounts; i++) {
            System.out.println(accounts[i]);
         }
         System.out.println("The total number of accounts is: " + Account.getNumAccounts());
         System.out.println("The total number of deposits is: " + Account.getNumDeposits());
         System.out.println("The total number of withdrawals is: " + Account.getNumWithdrawals());
         System.out.println("The total amount of deposits is: " + Account.getTotalDeposits());
         System.out.println("The total amount of withdrawals is: " + Account.getTotalWithdrawals());
         System.out.println("The total balance is: " + Account.getTotalBalance());
         System.out.println("The total number of closed accounts is: " + Account.getNumClosed());
         System.out.println("The total number of opened accounts is: " + Account.getNumOpened());
    }
 }