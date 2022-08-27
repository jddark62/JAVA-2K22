/*
 * The ABC asset management company wants to manage its customers' equity and commodity investments 
 * in the following way.
 * You are expected to create the below listed set of reusable libraries as per specification using 
 * packages.
 * 
 * SHARE MARKET - package 1
 * You will have to create a set of classes for computing the weekly return, monthly return and yearly return
 * and 5 years of both equity and commodity investments. 
 * Returns should be calculated in percentage.
 * define the behaviour of these two classes by creating an interface Investment.
 * This interface includes an instance variable current date (use java library for date) that will be used to calculate the returns
 * these two sub classes should include getter and setter methods and 
 * COMMODITY: code, title, qty, purchase price, purchase date (use java date)
 * EQUITY: code, name, qty, purchase price, purchase date (use java date)
 * 
 *  *  * CUSTOMERS - package 2
 * There are two kins of customers eg. retail and corporate customers. both will inherit the features of 
 * customer class. The customers can purchase any number of equities and commodities.
 * 
 * Customer class should include getter and setter methods and
 * Additional features to be included
 * Retail_customer: Aadhar number, pan number
 * Corporate_customer: company registration number, company pan number
 * 
 * CUSTOMER CLASS
 * Customer code
 * name
 * Address
 * Demat No
 * Equity[] of type equity
 * Commodity[] of type commodity
 * Get equity_purchase()
 * Get commodity_purchase()
 * Compute returns()
 * 
 * 
 * Create another package 3 DRIVER which includes your java application
 * with the main method
 * Write an interactive code to accept current market price of both equities and commodities
 * You should create an array of retail and corporate customer objects
 * For each customer,
 * you must ass a minimum of 3 equity and 2 commodities and print
 * the result in a neat format
 * 
 * Customer Details
 * ----------------------------------------------------------------------
 * equity code, title, qty, 1 week return, 1 monthly return, 1 year return
 * ----------------------------------------------------------------------
 * Total Investment                                          Current Value
 */

package driver;

import java.util.Scanner;

import sharemarket.*;

import customer.*;

import java.util.Date;

public class Driver {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Customer[] customer = new Customer[3];
        for(int i=0; i<customer.length; i++){
            System.out.println("Enter customer code: ");
            int customerCode = sc.nextInt();
            System.out.println("Enter customer name: ");
            String customerName = sc.next();
            System.out.println("Enter customer address: ");
            String customerAddress = sc.next();
            System.out.println("Enter customer demat number: ");
            int customerDematNumber = sc.nextInt();
            System.out.println("Enter customer type: ");
            String customerType = sc.next();
            if(customerType.equalsIgnoreCase("retail")){
                System.out.println("Enter customer aadhar number: ");
                int customerAadharNumber = sc.nextInt();
                System.out.println("Enter customer pan number: ");
                String customerPanNumber = sc.next();
                customer[i] = new RetailCustomer(customerCode, customerName, customerAddress, customerDematNumber, customerAadharNumber, customerPanNumber);
            }
            else if(customerType.equalsIgnoreCase("corporate")){
                System.out.println("Enter customer company registration number: ");
                int customerCompanyRegistrationNumber = sc.nextInt();
                System.out.println("Enter customer company pan number: ");
                String customerCompanyPanNumber = sc.next();
                customer[i] = new CorporateCustomer(customerCode, customerName, customerAddress, customerDematNumber, customerCompanyRegistrationNumber, customerCompanyPanNumber);
            }
            else{
                System.out.println("Invalid customer type");
            }
            System.out.println("Enter number of equities: ");
            int numberOfEquities = sc.nextInt();
            Equity[] equity = new Equity[numberOfEquities];
            for(int j=0; j<equity.length; j++){
                System.out.println("Enter equity code: ");
                int equityCode = sc.nextInt();
                System.out.println("Enter equity name: ");
                String equityName = sc.next();
                System.out.println("Enter equity quantity: ");
                int equityQuantity = sc.nextInt();
                System.out.println("Enter equity purchase price: ");
                double equityPurchasePrice = sc.nextDouble();
                System.out.println("Enter equity purchase date: ");
                Date equityPurchaseDate = new Date(sc.next());
                equity[j] = new Equity(equityCode, equityName, equityQuantity, equityPurchasePrice, equityPurchaseDate);
            }
            System.out.println("Enter number of commodities: ");
            int numberOfCommodities = sc.nextInt();
            Commodity[] commodity = new Commodity[numberOfCommodities];
            for(int k=0; k<commodity.length; k++){
                System.out.println("Enter commodity code: ");
                int commodityCode = sc.nextInt();
                System.out.println("Enter commodity name: ");
                String commodityName = sc.next();
                System.out.println("Enter commodity quantity: ");
                int commodityQuantity = sc.nextInt();
                System.out.println("Enter commodity purchase price: ");
                double commodityPurchasePrice = sc.nextDouble();
                System.out.println("Enter commodity purchase date: ");
                Date commodityPurchaseDate = new Date(sc.next());
                commodity[k] = new Commodity(commodityCode, commodityName, commodityQuantity, commodityPurchasePrice, commodityPurchaseDate);
            }
            customer[i].setEquity(equity);
            customer[i].setCommodity(commodity);
        }
    }
}