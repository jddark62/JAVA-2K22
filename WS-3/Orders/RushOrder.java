/*
 * RushOrder class extends the Order class. 
 * It has an integer instance variable deliveryDay, a protected member, 
 * which represents in how many days the order should be delivered. 
 * The getTotal() method overrides the definition of the super class 
 * in the following way: It first invokes the getTotal() 
 * of the super class to find the total for all items in the order. 
 * It then adds the delivery charge. 
 * The delivery charge for one day delivery is $25, 
 * for two day delivery is $15, for three day delivery is $10. 
 * It is free for four or more days. Note that, the delivery charge 
 * should be added only if there are items in the order. 
 * It means if the getTotal() of the super class returns 0, 
 * do not add delivery charge, but just return 0.

 */
public class RushOrder extends Order {
    private int deliveryDay;
    protected static final int ONE_DAY_DELIVERY = 25;
    protected static final int TWO_DAY_DELIVERY = 15;
    protected static final int THREE_DAY_DELIVERY = 10;
    
    public RushOrder(int deliveryDay) {
        this.deliveryDay = deliveryDay;
    }
    
    public int getTotal() {
        int total = super.getTotal();
        if (total > 0) {
            if (deliveryDay <= 3) {
                total += deliveryDay * ONE_DAY_DELIVERY;
            } else {
                total += THREE_DAY_DELIVERY;
            }
        }
        return total;
    }
    
    public String toString() {
        return super.toString() + " Delivery Day: " + deliveryDay;
    }
    
}