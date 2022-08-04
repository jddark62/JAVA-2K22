/*
 * Order class has a list of OrderItem objects. 
 * The addOrderItem() method takes an object of 
 * OrderItem as the parameter and stores it in the list. 
 * The getTotal() method returns the total cost of all order 
 * items in the order. 
 * The printOrderItems() method prints information about each order item 
 * via the toString() method of the OrderItem class.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Order{
    private List<OrderItem> orderItems = new ArrayList<OrderItem>();
    
    public void addOrderItem(OrderItem orderItem){
        orderItems.add(orderItem);
    }
    
    public double getTotal(){
        double total = 0;
        for(OrderItem orderItem : orderItems){
            total += orderItem.getTotal();
        }
        return total;
    }
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Order: ");
        for(OrderItem orderItem : orderItems){
            sb.append(orderItem.toString());
        }
        return sb.toString();
    }
    
}