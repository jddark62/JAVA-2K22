/*
 *  * CUSTOMERS - package 2
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
 */

 package customers;
 
 import java.util.ArrayList;

    import sharemarket.Equity;

    import sharemarket.Commodity;

    public class Customer{
        private String code;
        private String name;
        private String address;
        private String dematNo;
        private ArrayList<Equity> equity;
        private ArrayList<Commodity> commodity;
        
        public Customer(String code, String name, String address, String dematNo){
            this.code = code;
            this.name = name;
            this.address = address;
            this.dematNo = dematNo;
            equity = new ArrayList<Equity>();
            commodity = new ArrayList<Commodity>();
        }
        
        public void equity_purchase(Equity equity){
            this.equity.add(equity);
        }
        
        public void commodity_purchase(Commodity commodity){
            this.commodity.add(commodity);
        }
        
        public double computeReturns(){
            double returns = 0;
            for(Equity equity: equity){
                returns += equity.fiveYearsReturn();
            }
            for(Commodity commodity: commodity){
                returns += commodity.fiveYearsReturn();
            }
            return returns;
        }
        
        public String toString(){
            return "Customer code: " + code + ", Customer name: " + name + ", Customer address: " + address + ", Customer demat number: " + dematNo;
        }
        
        //getter-setter methods
        public void setCode(String code) {
            this.code = code;
        }
        public void setName(String name) {
            this.name = name;
        }
        public void setAddress(String address) {
            this.address = address;
        }
        public void setDematNo(String dematNo) {
            this.dematNo = dematNo;
        }
        public void setEquity(ArrayList<Equity> equity) {
            this.equity = equity;
        }
        public void setCommodity(ArrayList<Commodity> commodity) {
            this.commodity = commodity;
        }
        public String getCode() {
            return code;
        }
        public String getName() {
            return name;
        }
        public String getAddress() {
            return address;
        }
        public String getDematNo() {
            return dematNo;
        }
        public ArrayList<Equity> getEquity() {
            return equity;
        }
        public ArrayList<Commodity> getCommodity() {
            return commodity;
        }
    }