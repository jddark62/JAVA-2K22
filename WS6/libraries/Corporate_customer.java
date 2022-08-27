package customers;

public class Corporate_customer extends Customer{
    private String companyRegistrationNumber;
    private String companyPanNumber;
    
    public Corporate_customer(String code, String name, String address, String dematNo, String companyRegistrationNumber, String companyPanNumber){
        super(code, name, address, dematNo);
        this.companyRegistrationNumber = companyRegistrationNumber;
        this.companyPanNumber = companyPanNumber;
    }

    public String toString(){
        return super.toString() + ", Corporate customer company registration number: " + companyRegistrationNumber + ", Corporate customer company pan number: " + companyPanNumber;
    }
}