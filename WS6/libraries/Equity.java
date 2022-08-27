package sharemarket;

import java.util.Date;
public class Equity implements Investment{
    private String code;
    private String name;
    private int qty;
    private double purchasePrice;
    private Date purchaseDate;
    
    public Equity(String code, String name, int qty, double purchasePrice, Date purchaseDate){
        this.code = code;
        this.name = name;
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
        return "Equity code: " + code + ", Equity name: " + name + ", Equity quantity: " + qty + ", Equity purchase price: " + purchasePrice + ", Equity purchase date: " + purchaseDate;
    }

    //getter-setter methods
    public void setCode(String code) {
        this.code = code;
    }
    public void setName(String name) {
        this.name = name;
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

    public String getName() {
        return name;
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