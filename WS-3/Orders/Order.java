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
    public class Order {
        private ArrayList<OrderItem> orderItems;
        
        public Order() {
            orderItems = new ArrayList<OrderItem>();
        }
        
        public void addOrderItem(OrderItem orderItem) {
            orderItems.add(orderItem);
        }
        
        public int getTotal() {
            int total = 0;
            for (OrderItem orderItem : orderItems) {
                total += orderItem.getCost();
            }
            return total;
        }
        
        public void printOrderItems() {
            for (OrderItem orderItem : orderItems) {
                System.out.println(orderItem);
            }
        }
        
        public String toString() {
            return "Order: " + orderItems;
        }
    }