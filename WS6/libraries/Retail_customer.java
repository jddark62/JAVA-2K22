package customers;

public class Retail_customer extends Customer{
    private String aadharNumber;
    private String panNumber;
    
    public Retail_customer(String code, String name, String address, String dematNo, String aadharNumber, String panNumber){
        super(code, name, address, dematNo);
        this.aadharNumber = aadharNumber;
        this.panNumber = panNumber;
    }
    
    public String toString(){
        return super.toString() + ", Retail customer aadhar number: " + aadharNumber + ", Retail customer pan number: " + panNumber;
    }

}