/*
 * Introduce Delivery as a test driver in the default package. It should execute as follows: 
Create an array of four Order objects, calling it orders. The first object is an instance of Order class, the second is an instance of RushOrder class with one day delivery, the third object is an instance of RushOrder class with two day delivery and the forth object is an instance of RushOrder class with three day delivery.
Prompt the user to enter the UPC code for an item or “done” to quit. Read the user input. 
While the user enter a UPC (anything other than “done”), prompt for and read the quantity. 
Generate a random number from 50 to 100 for the price.
Create an OrderItem object with UPC, quantity and price.
Generate a random number from 1 to 7 for the delivery day.
Add the order item to the element of the orders array corresponding to the delivery day via the addOrderItem(). If delivery day is four or bigger, add the order item into the first element, which is the instance of Order class. If the delivery day is one, add it to the second element of the orders array, which is the instance of the RushOrder class with one day delivery, and so on.
Continue the loop until either user enters “done”.
For each order in the orders array:
Print out the type of order via the toString() methods.
Print out all the order items.
Print out the subtotal for this order.
Print out the total cost in all of the orders.

 */

 import java.util.ArrayList;
 import java.util.Random;
 import java.util.Scanner;

    public class Delivery {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Order[] orders = new Order[4];
            orders[0] = new Order();
            orders[1] = new RushOrder(1);
            orders[2] = new RushOrder(2);
            orders[3] = new RushOrder(3);
            String input = "";
            while (!input.equals("done")) {
                System.out.println("Enter UPC or done to quit: ");
                input = sc.nextLine();
                if (!input.equals("done")) {
                    System.out.println("Enter quantity: ");
                    int quantity = sc.nextInt();
                    sc.nextLine();
                    Random r = new Random();
                    double price = r.nextInt(51) + 50;
                    OrderItem orderItem = new OrderItem(input, quantity, (int)price);
                    System.out.println("Enter delivery day: ");
                    int deliveryDay = sc.nextInt();
                    sc.nextLine();
                    if (deliveryDay >= 4) {
                        orders[0].addOrderItem(orderItem);
                    } else {
                        orders[deliveryDay].addOrderItem(orderItem);
                    }
                }
            }
            for (Order order : orders) {
                System.out.println(order.toString());
                System.out.println("Subtotal: " + order.getTotal());
            }
            System.out.println("Total: " + getTotal(orders));
        }
        public static double getTotal(Order[] orders) {
            double total = 0;
            for (Order order : orders) {
                total += order.getTotal();
            }
            return total;
        }
    }