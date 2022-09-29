/*
 * OrderItem class has a String upc, an integer quantity 
 * and an integer price, all private. 
 * The getCost() method returns the multiplication of its quantity 
 * and price.
 */
public class OrderItem {
    private String upc;
    private int quantity;
    private int price;
    
    public OrderItem(String upc, int quantity, int price) {
        this.upc = upc;
        this.quantity = quantity;
        this.price = price;
    }
    
    public int getCost() {
        return quantity * price;
    }
    
    public String toString() {
        return "UPC: " + upc + " Quantity: " + quantity + " Price: " + price;
    }
}