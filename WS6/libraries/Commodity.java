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
 */


package sharemarket;

import java.util.Date;

public class Commodity implements Investment{
    private String code;
    private String title;
    private int qty;
    private double purchasePrice;
    private Date purchaseDate;
    
    public Commodity(String code, String title, int qty, double purchasePrice, Date purchaseDate){
        this.code = code;
        this.title = title;
        this.qty = qty;
        this.purchasePrice = purchasePrice;
        this.purchaseDate = purchaseDate;
    }
    
    public double weeklyReturn(){
        double currentPrice = purchasePrice + (purchasePrice*0.1);
        double weeklyReturn = (currentPrice - purchasePrice)/purchasePrice;
        return weeklyReturn;
    }
    
    public double monthlyReturn(){
        double currentPrice = purchasePrice + (purchasePrice*0.2);
        double monthlyReturn = (currentPrice - purchasePrice)/purchasePrice;
        return monthlyReturn;
    }
    
    public double yearlyReturn(){
        double currentPrice = purchasePrice + (purchasePrice*0.3);
        double yearlyReturn = (currentPrice - purchasePrice)/purchasePrice;
        return yearlyReturn;
    }
    
    public double fiveYearsReturn(){
        double currentPrice = purchasePrice + (purchasePrice*1.5);
        double fiveYearsReturn = (currentPrice - purchasePrice)/purchasePrice;
        return fiveYearsReturn;
    }
    
    public String toString(){
        return "Commodity code: " + code + ", Commodity title: " + title + ", Commodity quantity: " + qty + ", Commodity purchase price: " + purchasePrice + ", Commodity purchase date: " + purchaseDate;
    }

    //getter-setter methods
    public void setCode(String code) {
        this.code = code;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public String getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }

    public int getQty() {
        return qty;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }
}