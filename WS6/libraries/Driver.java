/*

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

import java.util.ArrayList;

import customers.*;

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