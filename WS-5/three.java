/*
 * Consider a superclass PurchaseItem which models customer’s purchases. This class has:
two private instance variables name (String) and unitPrice (double).
One constructor to initialize the instance variables.
A default constructor to initialize name to “no item”, and unitPrice to 0. use this()
A method getPrice that returns the unitPrice.
Accessor and mutator methods.
A toString method to return the name of the item followed by @ symbol, then the unitPrice.
Consider two subclasses WeighedItem and CountedItem.  WeighedItem has an additional instance variable weight (double) in Kg while CountedItem has an additional variable quantity (int) both private.
- Write an appropriate constructor for each of the classes making use of the constructor of the superclass in defining those of the subclasses. 
- Override getPrice method that returns the price of the purchasedItem based on its unit price and weight (WeighedItem), or quantity (CountedItem).  Make use of getPrice of the superclass
- Override also toString method for each class making use of the toString method of the superclass in defining those of the subclasses. toString should return something that can be printed on the receipt.

For example   
Banana @ 3.00   1.37Kg   4.11 SR (in case of WeighedItem class)
Pens @ 4.5      10 units   45 SR (in case of CountedItem class) 
Write an application class where you construct objects from the two subclasses and print them on the screen.

 */

class PurchaseItem {
    private String name;
    private double unitPrice;
    
    public PurchaseItem(String name, double unitPrice) {
        this.name = name;
        this.unitPrice = unitPrice;
    }
    
    public PurchaseItem() {
        this("no item", 0.0);
    }
    
    public String getName() {
        return name;
    }
    
    public double getPrice() {
        return unitPrice;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
    
    public String toString() {
        return name + "@" + unitPrice;
    }
}

class WeighedItem extends PurchaseItem {
    private double weight;
    
    public WeighedItem(String name, double unitPrice, double weight) {
        super(name, unitPrice);
        this.weight = weight;
    }
    
    public WeighedItem() {
        super();
    }
    
    public double getWeight() {
        return weight;
    }
    
    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    public String toString() {
        return super.toString() + " " + weight + "Kg";
    }
}

class CountedItem extends PurchaseItem {
    private int quantity;
    
    public CountedItem(String name, double unitPrice, int quantity) {
        super(name, unitPrice);
        this.quantity = quantity;
    }
    
    public CountedItem() {
        super();
    }
    
    public int getQuantity() {
        return quantity;
    }
    
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public String toString() {
        return super.toString() + " " + quantity + " units";
    }
}


/**
 * three
 */
public class three {

    public static void main(String[] args) {
        WeighedItem banana = new WeighedItem("Banana", 3.0, 1.37);
        CountedItem pens = new CountedItem("Pens", 4.5, 10);
        System.out.println(banana);
        System.out.println(pens);
    }
    
}