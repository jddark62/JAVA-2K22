/*
 * Implement the inheritance hierarchy shown in Figure 1. 
 * Have Account and SavingAccount classes in a single file 
 * named BankAccount. The defaultInterestRate field in the SavingAccount 
 * class is static with an initial value of 2.5. 
 * The setDefaultInterestRate() is a static function.
 * Have the BankAccount class to create objects of Account 
 * and SavingAcount classes, invoke deposit and withdraw methods on them,
 *  and invoke the setDefaultInterestRate() and the applyMonthlyInterest() 
 * on the SavingAccount object.
 * Account class - 
 * double balance
 * deposit (double amount)
 * withdraw (double amount)
 */

 class Account {
    public double balance;
    public Account(double balance) {
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        balance += amount;
    }
    public void withdraw(double amount){
        balance -= amount;
    }
 }

 class SavingAccount extends Account{
    public static double defaultInterestRate = 2.5;
    public double interestRate;
    public SavingAccount(double balance, double interestRate) {
        super(balance);
        this.interestRate = interestRate;
    }
    public void applyMonthlyInterest() {
        balance += balance * interestRate / 12;
    }
    public static void setDefaultInterestRate(double interestRate) {
        defaultInterestRate = interestRate;
    }

 }

 /**
  * BankAccount
  */
 public class BankAccount {
 
    public static void main(String[] args) {
        Account a = new Account(100);
        a.deposit(100);
        System.out.println(a.getBalance());
        a.withdraw(50);
        System.out.println(a.getBalance());
        SavingAccount sa = new SavingAccount(100, 2.5);
        sa.deposit(100);
        System.out.println(sa.getBalance());
        sa.applyMonthlyInterest();
        System.out.println(sa.getBalance());
        SavingAccount.setDefaultInterestRate(3.5);
        sa.applyMonthlyInterest();
        System.out.println(sa.getBalance());
    }
 }