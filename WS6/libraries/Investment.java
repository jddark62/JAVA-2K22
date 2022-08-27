/*
 * The ABC asset management company wants to manage its customers' equity and commodity investments 
 * in the following way.
 * You are expected to create the below listed set of reusable libraries as per specification using 
 * packages.
 * 
 * SHARE MARKET - package 1
 * You will have to create a set of classes for computing the weekly return, monthly return and yearly return
 * and 5 years of both equity and commodity investments.
 * define the behaviour of these two classes by creating an interface Investment.
 * This interface includes an instance variable current date (use java library for date) that will be used to calculate the returns
 * these two sub classes should include
 * COMMODITY: code, title, qty, purchase price, purchase date (use java date)
 * EQUITY: code, name, qty, purchase price, purchase date (use java date)
 * 

 */

package sharemarket;

import java.util.Date;

interface Investment{
    Date currentDate = new Date();
    public double weeklyReturn();
    public double monthlyReturn();
    public double yearlyReturn();
    public double fiveYearsReturn();
}
